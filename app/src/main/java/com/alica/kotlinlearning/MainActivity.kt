package com.alica.kotlinlearning

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables && Constants
        //var degisken  val sabit
        //Integer tam sayılar
        //Defining tanımlamak
        val myInteger : Int
        //Initialize deger atamak
        myInteger = 10

        //Double & Float virgullu sayilar
        //Double
        val pi = 3.14
        //Float sona f eklenmeli
        val myFloat = 3.14f
        //camelCase
        //snake_case

        //String metinler
        val myString = "Ali Can Doğru"

        //Boolean true-false
        var myBoolean : Boolean = true

        //Conversion değişken donusturmek
        var myNumber = 5
        var myLongNumber = myNumber.toLong()

        //Collections Koleksiyonlar
        //Arrays Diziler
        // arraylere daha sonradan eleman eklenemez olusturuldugu zaman size degeri sabit kalacak sekilde ayarlanir
        val myArray = arrayOf("James","Kirk","Rob","Lars")
        myArray[0] //index 0 dan baslar
        val numberArray = arrayOf(1,2,3,4,5)
        val myNewArray = doubleArrayOf(1.0,2.0,3.0)
        val mixedArray = arrayOf("Ali",5)

        //List - ArrayList
        val myMusician = arrayListOf<String>("James","Kirk")
        myMusician.add("Lars")
        myMusician.add(0,"Rob")

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Ali")
        myMixedArrayList.add(10)
        myMixedArrayList.add(true)

        //Set listelerden farkli olarak ayni deger tekrarlanamaz
        val myExampleArray = arrayOf(1,1,2,3,4)
        println("element 1: ${myExampleArray[0]}")

        val mySet = setOf<Int>(1,1,2,3) // set oldugu icin 1 rakamini bir kez gorecek
        //For Each listedeki her bir elemana yapmak istediğimiz islemi yazmaya yarar
        mySet.forEach { println(it) }  // it degeri her elemani temsil eder
        val myStringSet = HashSet<String>()
        myStringSet.add("Ali")

        //Map - HashMap
        //Key - Value anahtar deger eslesmesini tutmaya yarayan sistemler

        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"])

        val myNewMap = hashMapOf<String,Int>("A" to 1,"B" to 2,"C" to 3)

        //Operator

        var m=5
        m = m + 1 //m=6
        m++ //m=7
        m-- //m=6
        // && ve kosulu 1 && 1 = 1 / 1 && 0 = 0 / 0 && 1 = 0 / 0 && 0 = 0
        // || veya kosulu 1 || 1 = 1 / 1 || 0 = 1 / 0 || 1 = 1 / 0 || 0 = 0

        println(10+2) // toplam 12
        println(10-2) // cikarma 8
        println(10*2) // carpma 20
        println(10/2) // bolme 5
        println(10%2) // kalan 0

        // if - else if - else
        val myNumberAge = 32
        if (myNumberAge < 30){
            //if kontrolu true donerse bu blok calisir
        } else if (myNumberAge >= 30 && myNumberAge < 40){
            //if kontrolu false donerse ve else if kontrolu true donerse bu blok calisir
        } else {
            //if kontrolu false donerse ve else if kontrolu de false donerse bu blok calisir
        }

        //Switch - When

        val day = 3
        var dayString = ""

        if (day == 1){
            dayString = "Monday"
        } else if (day == 2){
            dayString = "Tuesday"
        } else if (day == 3){
            dayString = "Wednesday"
        } else if (day == 4){
            dayString = "Thursday"
        } else if (day == 5){
            dayString = "Friday"
        } else if (day == 6){
            dayString = "Saturday"
        } else if (day == 7){
            dayString = "Sunday"
        } else {
            dayString = ""
        }

        //bu kadar uzun kontrol yerine

        when(day) {
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            4 -> dayString = "Thursday"
            5 -> dayString = "Friday"
            6 -> dayString = "Saturday"
            7 -> dayString = "Sunday"
            else -> dayString = ""
        }


        //Loops Donguler

        // For Loop For Dongusu

        val myArrayofNumbers = arrayOf(12,15,18,21,24,27,30,33)

        for (number in myArrayofNumbers) {
            val z = number / 3 * 5
            println(z)
        }

        for (i in myArrayofNumbers.indices){
            val qz = myArrayofNumbers[i] / 3 * 5
            println(qz)
        }

        for (b in 0..9) {
            println(b)
        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Ali")
        myStringArrayList.add("Can")
        myStringArrayList.add("Doğru")

        for (str in myStringArrayList){
            println(str)
        }

        //While loop While dongusu

        var j = 0
        while (j < 10){
            println(j)
            j = j + 1
        }

















    }
}