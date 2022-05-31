package module4

class demo_switch {
    static void main(String[] args) {
        def card = System.in.newReader().readLine()
        switch(card.trim().toLowerCase()){
            case("visa"):
                println ("Visa Card Found")
                break
            case("master"):
                println ("master Card Found")
                break
            case("amex"):
                println ("amex Card Found")
                break
            case("discover"):
                println ("discover Card Found")
                break
            default:
                println ("Unrecognized card")
        }
    }
}
