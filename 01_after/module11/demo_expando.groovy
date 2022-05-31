package module11
import module9.card
class demo_expando {
    static void main(String[] args) {
        String.metaClass.'static'.toUp = {String str1 ->
            str1.toUpperCase()
        }
        println("Uppercase of visa is ${String.toUp("visa")}")
        card.metaClass.secure = { ->
            "Your card will be secured"
        }

        def newCard = new card()
        println(newCard.secure())
    }
}
