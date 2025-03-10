package Pay

class Client(val name: String, val account: Account, val creditCard: CreditCard) {

    fun payOrder(order: Order): Boolean {
        println("Клиент $name пытается оплатить заказ на сумму ${order.amount}.")
        return creditCard.pay(order.amount)
    }

    fun transfer(toAccount: Account, amount: Double): Boolean {
        if (account.withdraw(amount)) {
            toAccount.deposit(amount)
            println("Перевод $amount на другой счет выполнен успешно.")
            return true
        }
        return false
    }

    fun blockCard() {
        creditCard.block()
    }

    fun closeAccount() {
        account.close()
    }
}