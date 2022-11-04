package com.example.kuis1mobile_2018041;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tenama;
    TextView tenim;
    TextView tejurusan;
    TextView teangkatan;
    EditText plnama;
    EditText plnim;
    EditText pljurusan;
    EditText plangkatan;
    Button btntampil;

    MahasiswaViewModel biodataViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tenama = findViewById(R.id.viewnama);
        tenim = findViewById(R.id.viewnim);
        tejurusan = findViewById(R.id.viewjurusan);
        teangkatan = findViewById(R.id.viewangkatan);
        plnama = findViewById(R.id.plnama);
        plnim = findViewById(R.id.plnim);
        pljurusan = findViewById(R.id.pljurusan);
        plangkatan = findViewById(R.id.plangkatan);
        btntampil = findViewById(R.id.btntampil);

        biodataViewModel = new ViewModelProvider(MainActivity.this).get(MahasiswaViewModel.class);
        biodataViewModel.getData().observe(this, new Observer<Mahasiswa>() {
            @Override
            public void onChanged(Mahasiswa biodata) {
                tenama.setText(biodata.getNama());
                tenim.setText(biodata.getNim());
                tejurusan.setText(biodata.getJurusan());
                teangkatan.setText(biodata.getAngkatan());
            }
        });
        btntampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mahasiswa biodata = new Mahasiswa();
                biodata.setNama(plnama.getText().toString());
                biodata.setNim(plnim.getText().toString());
                biodata.setJurusan(pljurusan.getText().toString());
                biodata.setAngkatan(plangkatan.getText().toString());
                biodataViewModel.setData(biodata);
            }

        });
    }
}