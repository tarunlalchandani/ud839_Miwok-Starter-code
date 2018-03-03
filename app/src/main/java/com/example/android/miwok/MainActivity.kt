
package com.example.android.miwok

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main)
        txtnum.setOnClickListener{
            var intentnumber:Intent=Intent(this,NumbersActivity::class.java)
            startActivity(intentnumber)
            Toast.makeText(this,"you entered into ",Toast.LENGTH_SHORT).show()
        }
        txtfamily.setOnClickListener{
            var intentfamily:Intent=Intent(this,FamilyActivity::class.java)
            startActivity(intentfamily)
            Toast.makeText(this,"you entered the family list",Toast.LENGTH_SHORT).show()
        }
        txtcolors.setOnClickListener{
            var intentcolors:Intent=Intent(this,ColorsActivity::class.java)
            startActivity(intentcolors)
            Toast.makeText(this,"you entered colours list",Toast.LENGTH_SHORT).show()
        }
        txtphrases.setOnClickListener{
            var intentphrase:Intent=Intent(this,PhraseActivity::class.java)
            startActivity(intentphrase)
            Toast.makeText(this,"you entered phrases list",Toast.LENGTH_SHORT).show()
        }

    }

}
