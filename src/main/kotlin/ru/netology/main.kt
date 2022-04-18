package ru.netology

fun main() {
    val regularCustomer: Boolean = true

    val oldAmount: Int = 10001_00
    val amount: Int = 100_00

    val standardSale: Int = 100_00
    val topSale: Double = 0.05
    val regularCustomerSale: Double = 0.01

    val minAmountForStandardSale = 1001_00
    val maxAmountForStandardSale = 10000_00
    val minAmountForTopSale = 10000_01

    val amountAfterBaseSale = if (oldAmount >= minAmountForStandardSale && oldAmount <= maxAmountForStandardSale) amount - standardSale else if (oldAmount >= minAmountForTopSale) amount * (1 - topSale) else amount
    val amountAfterRegularCustomerSale = if (regularCustomer) amountAfterBaseSale.toDouble() * (1 - regularCustomerSale) else amountAfterBaseSale

    println(amountAfterRegularCustomerSale.toInt())
}