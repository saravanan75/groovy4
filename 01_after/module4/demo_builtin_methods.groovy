package module4

class demo_builtin_methods {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Discover", "Master"];

        cards.each {    println ("In Each method $it")}
        cards.size().times {    if(it == 0) println ("In times method ${cards[it]}")}
        cards.eachWithIndex { String entry, int i -> println ("$entry element appears at position $i") }
    }
}
