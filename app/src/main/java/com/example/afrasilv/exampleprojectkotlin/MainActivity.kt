package com.example.afrasilv.exampleprojectkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("hello")
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
}
