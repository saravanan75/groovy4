package module6

class demo_closure_parameters {
    static void main(String[] args) {
        Closure cardDetails = {firstName, lastName = "D"->
            println("This card is owned by $firstName and $lastName")
        }
        Closure cardDetails_varArgs = {String... arg ->
            arg.join(' ')
        }
        cardDetails("Sharu")

        println cardDetails_varArgs("Sharu", "D")
        println cardDetails_varArgs("Sharu", "D", "MV")

        def cardLength = [12,13,14,15,16]
        cardLength.each {
            if(it % 2 == 0){
                println("Even number digits ${it*2}")
                return
                println("After return")
            } else {
                println("Odd number of digits $it")
                return
            }
        }
    }
}
