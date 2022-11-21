package com.cdp.viewmodelproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    //var count =0
    var count = MutableLiveData<Int>()

    init{
        count.value = 0
    }

    fun increment() {
        count.value = (count.value)?.plus(1)
    }
}