package module6

class demo_closures_methods_collections {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Master", "Discover"]
        String date = new Date().format('MMdd')
        iterateCard(cards, {println("$it read at $date")})

        def match = cards.find{(it.length() > 4)}
        println("Matched cards : $match")

        def matches = cards.findAll{(it.length() > 4)}
        matches.each {  println("$it found by findAll method")}

        def cardsMap = [visa:16, amex:15, discover:16]
        cardsMap.collect {
            print it.key.toUpperCase()
            println(it.value * 2)
        }
        cardsMap.eachWithIndex { Map.Entry<String, Integer> entry, int i ->
            println("$i ${entry.key.toUpperCase()} ${entry.value*2}")
        }
    }
    def static iterateCard(cards, chunk){
        for (int i = 0; i < cards.size(); i++) {
            chunk(cards[i])
        }
    }
}
