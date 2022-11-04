package com.example.kuis1mobile_2018041;

public class Mahasiswa {
    private String nama,nim,jurusan, angkatan;
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getJurusan(){
        return jurusan;
    }
    public String getAngkatan(){
        return angkatan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
