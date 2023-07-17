package com.androidpreparation.localstorage.sharedprefences

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.androidpreparation.R

class ShareActivity : AppCompatActivity() {

    lateinit var edtName: EditText
    lateinit var edtEmail:EditText
    lateinit var btnSave: Button
    lateinit var btnRetrive:Button
    lateinit var btnClear:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sharepreference)
        val sharedPreference:SharedPreference=SharedPreference(this)

        edtName=findViewById(R.id.edt_name)
        edtEmail=findViewById(R.id.edt_email)
        btnClear=findViewById(R.id.btn_clear)
        btnSave=findViewById(R.id.btn_save)
        btnRetrive=findViewById(R.id.btn_retriev)

        btnSave.setOnClickListener {

            val name=edtName.editableText.toString()
            val email=edtEmail.editableText.toString()
            sharedPreference.save("name",name)
            sharedPreference.save("email",email)
            Toast.makeText(this@ShareActivity,"Data Stored",Toast.LENGTH_SHORT).show()
            //to save an Int
//            sharedPreference.save("intval",1)

            //to save boolien
//            sharedPreference.save("bool",true)


            Toast.makeText(this@ShareActivity,"Saved to shared pref",Toast.LENGTH_SHORT).show()
        }
        btnRetrive.setOnClickListener {
            if (sharedPreference.getValueString("name")!=null) {
                edtName.hint = sharedPreference.getValueString("name")!!
                Toast.makeText(this@ShareActivity,"Data Retrieved",Toast.LENGTH_SHORT).show()
            }else{
                edtName.hint="NO value found"
            }
            if (sharedPreference.getValueString("email")!=null) {
                edtEmail.hint = sharedPreference.getValueString("email")!!
            }else{
                edtEmail.hint="No value found"
            }


        }

        btnClear.setOnClickListener {
            sharedPreference.clearSharedPreference()
            Toast.makeText(this@ShareActivity,"Data Cleared",Toast.LENGTH_SHORT).show()
        }
    }
}