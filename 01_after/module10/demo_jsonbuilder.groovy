package module10

import groovy.json.JsonBuilder

class demo_jsonbuilder {
    static void main(String[] args) {
        JsonBuilder builder = new JsonBuilder()
        builder.cards {
            card {
                name "Visa"
                digits 16
            }
            {
                name "Amex"
                digits 15
            }

        }
        println(builder.toPrettyString())
    }
}
