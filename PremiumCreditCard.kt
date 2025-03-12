package Pay

 class PremiumCreditCard(cardNumber: String, account: Account) : CreditCard(cardNumber, account) {
    override fun pay(amount: Double): Boolean {
        if (!isBlocked) {
            val discountedAmount = amount * 0.9
            if (account.withdraw(discountedAmount)) {
                println("Оплата $discountedAmount (после скидки 10%) с премиум карты $cardNumber прошла успешно.")
                return true
            }
        } else {
            println("Премиум карта $cardNumber заблокирована.")
        }
        return false
    }

    override fun block() {
        isBlocked = true
        println("Премиум карта $cardNumber заблокирована.")
    }

    override fun unblock() {
        isBlocked = false
        println("Премиум карта $cardNumber разблокирована.")
    }
}
