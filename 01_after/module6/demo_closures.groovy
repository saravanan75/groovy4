package module6

class demo_closures {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Master", "Discover"]
        for(int i = 0; i < cards.size(); i++){
            println ("Length of ${cards[i]} is " + cards[i].length())
        }
        for(int i = 0; i < cards.size(); i++){
            println ("${cards[i]} in uppercase is ${cards[i].toUpperCase()}")
        }
        for(int i = 0; i < cards.size(); i++){
            println ("${cards[i]} in lowercase is ${cards[i].toLowerCase()}")
        }
        iterateCard(cards, {println ("Length of $it is ${it.length()}")})
        iterateCard(cards, {println("$it in lowercase is ${it.toLowerCase()}")})
        iterateCard(cards, {println("$it in uppercase is ${it.toUpperCase()}")})
        iterateCard(cards){println(it)}
    }

    def static iterateCard(cards, chunk){
        for(int i = 0; i < cards.size(); i++){
            chunk(cards[i])
        }
    }
}
