package ru.netology

fun main() {
    val amount = 800
    val commissionRate = 0.0075
    val minCommission = 35.0
    val commission = if ((amount * commissionRate) > minCommission) {
        amount * commissionRate
    } else {
        minCommission
    }
    println("Размер комиссии: $commission рублей")
}