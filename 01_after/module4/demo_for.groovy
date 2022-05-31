package module4

class demo_for {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Discover", "Master"];
        def numbers = 1..5
        for(card in cards){
            println ("Card Found : $card")
        }
        for(num in numbers){
            println (num)
        }
        for(int i =0; i < 3; i++){
            //println ("Numbers in the for loop $i")
            println ("Processed card : ${cards[i]}")
        }

    }
}
