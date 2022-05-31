package module3

class demo_dynamictype {
    static void main(String[] args) {
        def cardLength = 15
        def lastThree = 3
        def cardName = "Visa"

        println ("Card $cardName has $cardLength digits and $lastThree as last three")
        println cardLength + cardName
        assert cardLength+lastThree == 19 : "Error"
    }
}
