package Pay

class CreditCard(val cardNumber : String, val account: Account) {
    var isBlocked: Boolean = false;
    fun pay(amount: Double): Boolean {
        if (!isBlocked) {
            if (account.withdraw(amount)) {
                println("Оплата $amount с карты $cardNumber прошла успешно.")
                return true
            }
        } else {
            println("Карта $cardNumber заблокирована.")
        }
        return false
    }

    fun block() {
        isBlocked = true
        println("Карта $cardNumber заблокирована.")
    }

    fun unblock() {
        isBlocked = false
        println("Карта $cardNumber разблокирована.")
    }
}