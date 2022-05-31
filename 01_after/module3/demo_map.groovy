package module3

class demo_map {
    static void main(String[] args) {
        def cardsMap = [visa:16, amex:15, discover:16]
        println("Visa card contains ${cardsMap["visa"]} digits")
        println (cardsMap.get("visa"))
        cardsMap['diners'] = 16
        println("Total number of elements in the maps ${cardsMap.size()}")
        println (cardsMap.containsKey("visa"));
    }
}
