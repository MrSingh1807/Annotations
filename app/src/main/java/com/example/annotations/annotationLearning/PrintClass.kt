package com.example.annotations.annotationLearning


class DemoClass {

    @StringAnnotation("Mr Singh")
    var str = "Str"


}

fun main() {

    val field = DemoClass::class.java.getDeclaredField("str")
    val annotation = field.getAnnotation(StringAnnotation::class.java)
    println(annotation.message) // Output: World

    val demoStr =  DemoClass().str
    println(demoStr)


}