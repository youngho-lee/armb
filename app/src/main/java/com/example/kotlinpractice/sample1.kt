package com.example.kotlinpractice

fun main(){
    //helloWorld()

    //3. String Template

    val name = "youngholee"
    println("my name is ${name}")


}

fun helloWorld() : Unit{    //아무 것도 Return 하지 않을 경우  : Unit을 써줌.(자바의 void와 같음)
    println("hello World!")
    println(add(4,5))

}

//1. 기본함수 사용.
fun add(a : Int, b : Int) : Int{        //Return type Int.
    return a+b
}

//2. val,var의 차이점
// - val : 변하지 않는 상수.
// - var : 변할수 있는 변수.