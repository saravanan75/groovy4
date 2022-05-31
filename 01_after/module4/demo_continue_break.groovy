package module4

class demo_continue_break {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Diners","Discover", "Master"];
        for(card in cards){
            if(card.equals("Diners")){
                //continue;
                break
            }
            println ("Card Found : $card")
        }
    }
}
