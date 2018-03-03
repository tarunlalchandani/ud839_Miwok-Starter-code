package com.example.android.miwok

/**
 * Created by tarun on 1/03/2018.
 */
public class Word(s1:String?,s2:String?){
    private var sindhiTranslation:String?=null
    private var englishTranslation:String?=null
    init{
        sindhiTranslation=s1
        englishTranslation=s2
    }
    fun getsindhiTranslation():String?{
        return sindhiTranslation
    }
    fun getEnglishTranslation():String?{
       return englishTranslation
    }
}