package Pay

class Admin {
    fun blockCardForExcessivePayment(card: CreditCard, maxLimit: Double, paymentAmount: Double) {
        if (paymentAmount > maxLimit) {
            card.block()
            println("Администратор заблокировал карту ${card.cardNumber} за превышение лимита.")
        } else {
            println("Лимит не превышен. Карта ${card.cardNumber} не заблокирована.")
        }
    }
}