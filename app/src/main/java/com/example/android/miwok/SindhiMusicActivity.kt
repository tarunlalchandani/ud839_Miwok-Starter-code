package com.example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView

class NumbersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sindhimusic)
        var words=ArrayList<Word>()
        words.add(Word("one","هڪ"))
        words.add(Word("two","ٻـ"))
        words.add(Word("three","ٽي"))
        words.add(Word("four","چار"))
        words.add(Word("five","پنج"))
        words.add(Word("six","ڇھ"))
        words.add(Word("seven","ست"))
        words.add(Word("eight","اٺُ"))
        words.add(Word("nine","نَو"))
        words.add(Word("ten","نَو"))
        //logging method
        /*for(i in 1..10)
        {
            Log.v("NumbersActivity","the $i element ="+words[i])
        }*/
        //create an {@link ArrayAdapter}, wose data source is a list of strings.The
        //adapter knows how to create layouts for each item in the list,using the
        //simple_list_item_1.xml layout resource defined in the andorid framework.
        //his list item layout contains a single{@link TextView},which the adapter will set to
        //display a single word
        var adapter=WordAdapter(this,words)
        //find the {@link ListView} object in the view hierachy of the {@link Activity,}
        //Their should be a {@link ListView} with the view ID called list,which is declared in
        //activity_numbers.xml layout file
        var listview: ListView =findViewById<ListView>(R.id.list)
        //Make the {@link ListView} use the {@link ArrayAdapter} use the {@link ArrayAdapter} we created above,so that the
        //{@link ListView} will display list items for each word in the list of words.
        //Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listview.setAdapter(adapter)

    }


}
