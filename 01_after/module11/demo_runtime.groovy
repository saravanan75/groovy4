package module11

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.util.logging.Log

@ToString(includePackage = false, ignoreNulls = true)
@EqualsAndHashCode
@TupleConstructor
@Log
class enhancedCard{
    String name
    int num_digits

    def getTotalDigits(){
        log.info("getTotalDigits has been invoked")
    }
}

enhancedCard card1 = new enhancedCard()
//enhancedCard card2 = new enhancedCard(name: "Visa", num_digits: 16)
//enhancedCard card3 = new enhancedCard(name: "Visa", num_digits: 16)
//enhancedCard card4 = new enhancedCard("Visa")
card1.getTotalDigits()

//println("Is card2 equals card3 ${card2 == card3}")

//println("toString : ${card3.toString()}")