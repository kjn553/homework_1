package ru.netology

fun main() {
    val purchaseAmounts1 = intArrayOf(500, 5000, 50000)
    val purchaseAmounts2 = intArrayOf(500, 5000, 50000)
    val isRegularCustomer1 = true
    val isRegularCustomer2 = false
    println("Постоянный клиент:")
    for (purchaseAmount in purchaseAmounts1) {
        var discountAmount = 0.0
        if (purchaseAmount > 10000) {
            discountAmount = purchaseAmount * 0.05
        } else if (purchaseAmount in 1001..9999) {
            discountAmount = 100.0
        }
        var finalAmount = purchaseAmount - discountAmount
        if (isRegularCustomer1 && purchaseAmount > 1000) {
            finalAmount *= 0.99
        }
        println("Для суммы покупки $purchaseAmount рублей: скидка ${discountAmount.toInt()} рублей, финальная стоимость ${finalAmount.toInt()} рублей.")
        }
    println("Непостоянный клиент:")
    for (purchaseAmount in purchaseAmounts2) {
        var discountAmount = 0.0
        if (purchaseAmount > 10000) {
            discountAmount = purchaseAmount * 0.05
        } else if (purchaseAmount in 1001..9999) {
            discountAmount = 100.0
        }
        var finalAmount = purchaseAmount - discountAmount
        if (isRegularCustomer2) {
            finalAmount *= 0.99
        }
        println("Для суммы покупки $purchaseAmount рублей: скидка ${discountAmount.toInt()} рублей, финальная стоимость ${finalAmount.toInt()} рублей.")
    }
}