package com.example.annotations.annotationLearning

import java.lang.annotation.ElementType


@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD, AnnotationTarget.FUNCTION)
annotation class StringAnnotation(val message : String = "Mr Singh")