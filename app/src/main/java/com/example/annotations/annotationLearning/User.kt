package com.example.annotations.annotationLearning


fun main() {

    val user = User("Mr Singh", "1999-01-121")
    println(user)

}


data class User(
    val name: String,
    @VeryRegex("\\d{4}-\\d{2}-\\d{2}") val dob: String
) {
    init {
        val fields = this::class.java.declaredFields
        fields.forEach { field ->
            field.annotations.forEach { annotation ->
                if (annotation is VeryRegex) {
                    val regex = field.getAnnotation(VeryRegex::class.java)?.regex
                    if (regex?.toRegex()?.matches(dob) == false) {
                        throw IllegalArgumentException("Invalid date format or date was wrong")
                    }
                }
            }
        }
    }
}

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class VeryRegex(val regex: String)
