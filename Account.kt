package Pay

 class Account (var balance : Double = 0.0) {
    fun deposit (amount: Double)
    {
        if (amount > 0)
        {
            balance +=amount
            println("Счет пополнен на $amount. Текущий баланс: $balance")
        }
        else{
            println ("Неккоректная сумма для пополнения")
        }
    }
     fun withdraw (amount: Double) : Boolean {
         if (amount > 0 && balance >= amount){
             balance-= amount;
             println("Со счет списано: $amount. Текущий баланс: $balance")
             return true
         }
         else{
             println ("Недостаточно средств или неккоректная сумма для пополнения")
             return false
         }
     }
     fun close(){
         balance = 0.0
         println("Счёт анулирован. Баланс обнулён")
     }
}