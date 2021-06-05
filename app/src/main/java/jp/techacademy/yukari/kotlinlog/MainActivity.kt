package jp.techacademy.yukari.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("ゆかり", 25, hobby = "Netflix")

        human.say()
        human.think()

        val human2 = Human("Kate", 20, hobby = "DisneyPlus")

        human2.say()
        human2.think()


    }
}