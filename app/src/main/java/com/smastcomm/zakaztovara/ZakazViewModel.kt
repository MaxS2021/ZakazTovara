package com.smastcomm.zakaztovara

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ZakazViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Zakaz Fragment"
    }
    val text: LiveData<String> = _text
}