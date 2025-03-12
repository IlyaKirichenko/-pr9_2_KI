package Pay
fun main() {
    val account = Account(1000.0)
    val PremiumcreditCard = PremiumCreditCard("1234-5678-9012-3456", account)
    val client = Client("Иван Иванов", account, PremiumcreditCard)

    val order = Order("ORD123", 500.0)

    client.payOrder(order)

    val anotherAccount = Account()
    client.transfer(anotherAccount, 300.0)

    val admin = Admin()
    admin.blockCardForExcessivePayment(PremiumcreditCard, 1000.0, 500.0)

    client.blockCard()

    client.closeAccount()

}
