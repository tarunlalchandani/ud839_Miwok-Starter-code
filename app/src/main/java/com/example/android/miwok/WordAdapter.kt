package com.example.android.miwok

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.android.miwok.R.id.text1
import java.security.AccessController.getContext

public class WordAdapter(context: Context,androidWord:ArrayList<Word>): ArrayAdapter<Word>(context,0,androidWord) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView:View?=convertView
        if(listItemView==null)
        {
            listItemView=LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false)
        }
        var listView2:View=listItemView!!
        var currentAndroidWord:Word=getItem(position)
        var t1:TextView=listView2.findViewById(R.id.text1)
        t1.setText(currentAndroidWord.getEnglishTranslation())
        var t2:TextView=listView2.findViewById(R.id.text2)
        t2.setText(currentAndroidWord.getsindhiTranslation())
        return listView2
    }
}