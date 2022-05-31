package module3

class demo_operators {
    static void main(String[] args) {
        println "Addition: "+ (5+5)
        println "Multiplication: "+5*5
        println "Division: "+5/5

        println 5 + 5/(5 * 5)

        boolean var1 = 1
        boolean var2 = 0

        println !var2

        int var3 = 2
        int var4 = 2
        println (var3 == var4)

        println "This is a double quoted string with a variable reference $var3"
        println 'This is a single quoted string with a variable reference $var3'
        println """This is
                a multi line
                string with
                a variable reference
                $var3"""
        String cardName = "Visa"
        println "The first two character of the cardname is ${cardName.substring(0,2)}"
    }
}
