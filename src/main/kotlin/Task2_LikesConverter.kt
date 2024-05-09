package ru.netology

fun main() {
    val likes = intArrayOf(32, 41)
    for (likesCount in likes) {
        val peopleCount = when {
            likesCount % 10 == 1 && likesCount % 100!= 11 -> "человеку"
            else -> "людям"
        }
        println("Понравилось $likesCount $peopleCount")
    }
}