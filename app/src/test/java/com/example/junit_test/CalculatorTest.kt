package com.example.junit_test

import org.junit.Test
import kotlin.test.assertEquals

//membuat class untuk melakukan pengetesan class calculator
class CalculatorTest {

//    membuat variabel calculator berdasarkan class Calculator()
    val calculator = Calculator()

    @Test //digunakan untuk mendefinisikan bahwa ini merupakan class pengetesan
//    function untuk pengetesan
    fun testAddSuccess(){
//        variabel result yang merupakan hasil dr penambahan angka first dan second
        val result = calculator.add(5, 5)
//        mengecek apakah jika result itu hasilnya 10 maka testnya berhasil
        assertEquals(10, result)
//        jika angka 10 diganti 11 maka akan error karena 5+5 harusnya hasilnya 10
    }
}