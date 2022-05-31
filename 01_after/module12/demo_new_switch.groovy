package module12

class demo_new_switch {
    static void main(String[] args) {
        String processedCard = "VISA";
        switch(processedCard.trim().toLowerCase()){
            case ("visa"):
                println ("Visa Found in Switch");
                break;
            case ("amex"):
                println ("Amex Found in Switch");
                break;
            default :
                println ("Unrecongnized card type");
        }

        switch (processedCard.trim().toLowerCase()){
            case("visa") -> println("Visa Found")
            case ("Amex") -> println ("Amex Found")
            default -> println ("Unrecognized")
        }
    }
}
