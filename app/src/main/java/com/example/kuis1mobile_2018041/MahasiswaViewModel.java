package com.example.kuis1mobile_2018041;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class MahasiswaViewModel extends ViewModel {
    private MutableLiveData<Mahasiswa> data;

    public MutableLiveData<Mahasiswa> getData (){
        if (data == null){
            data = new MutableLiveData<>();
        }
        return data;
    }

    public void setData (Mahasiswa data) {
        this.data.postValue(data);
    }
}
