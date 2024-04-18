package kr.ac.kopo.framelayouttest

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button

    lateinit var img1 : ImageView
    lateinit var img2 : ImageView
    lateinit var img3 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)
        btn3 = findViewById<Button>(R.id.btn3)

        img1 = findViewById<ImageView>(R.id.img1)
        img2 = findViewById<ImageView>(R.id.img2)
        img3 = findViewById<ImageView>(R.id.img3)

        img2.visibility = View.INVISIBLE
        img3.visibility = View.INVISIBLE

        btn1.setOnClickListener(btnListener)
        btn2.setOnClickListener(btnListener)
        btn3.setOnClickListener(btnListener)
    }
        val btnListener = OnClickListener{
            img1.visibility = View.INVISIBLE
            img2.visibility = View.INVISIBLE
            img3.visibility = View.INVISIBLE
            when(it.id){
                R.id.btn1 -> img1.visibility=View.VISIBLE
                R.id.btn2 -> img2.visibility=View.VISIBLE
                R.id.btn3 -> img3.visibility=View.VISIBLE
            }
        }


//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
        }