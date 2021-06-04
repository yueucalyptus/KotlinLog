package jp.techacademy.yukari.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human ("ゆかり", 25, hobby = "Netflix")

        human.say()
        Log.d("kotlintest", "私の名前は" + human.name + "です。")
        Log.d("kotlintest", "年は" + human.age + "歳です。")

        val human2 = Human("Kate", 20, "DisneyPlus")

        human2.think()
        Log.d("kotlintest", "私は" + human2.hobby + "について考える")
        Log.d(MY_TAG, "私は" + human2.hobby + "について考える。")

    }
}