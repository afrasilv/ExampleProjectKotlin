package com.example.afrasilv.exampleprojectkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        toast("hello")

        val tv = this.findViewById<TextView>(R.id.textView) as TextView //as para hacer casting
        tv.setText("Hello Kotlin")
        tv.text = "Hello Kotlin" //igual que lo de arriba
        toast("hello $textView, how are you?")
        toast("hello ${textView.text}, how are you?") //si es un objeto más complejo, tendríamos que usar los corchetes


        val etv = findViewById<EditText>(R.id.message) as EditText
        val button = findViewById<Button>(R.id.button) as Button

        button.setOnClickListener{ toast("Hello ${etv.text}") }
    }

    //Unit = void en Java pero devolviendo un objeto (la función)
    private fun toast(message: String): Unit{
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }



   /* fun getInt(int: Int): Int{
        return 2 * int
    }

    fun getInt(int: Int): Int = 2 * int

    fun getInt(int: Int) = 2 * int // infiere el tipo
    */

    fun test() {
        val x = 20
        val y: Int = 20
        var long: Long = x.toLong()
        val string = "Hello"
//        string = "goodbye" < -- al ser val es como final en java, no podemos cambiarle el valor, para ello tendríamos que usar var

//        las variables en Kotlin son objetos podemos usar y.toString() por ejemplo
    }
}
