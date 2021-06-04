package jp.techacademy.yukari.kotlinlog

import android.util.Log

const val MY_TAG = "kotlintest"

open class Human: Animal, Thinkable {

    constructor(name: String, age: Int, hobby: String): super(name, age, hobby){
    }
    override fun say() {
     //   var name:String
     //   var age:Int
        Log.d("kotlintest", "私の名前は" + this.name + "です。")
        Log.d("kotlintest", "年は" + this.age + "歳です。")
    }

    fun MyTag(): String{
        return "[" + MY_TAG + "]"
    }


    override fun think(){
      //  var hobby: String
        Log.d("kotlintest", "私は" + this.hobby + "について考える")
    }
}