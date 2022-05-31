package module10

import groovy.xml.MarkupBuilder

class demo_xmlbuilder {
    static void main(String[] args) {
        MarkupBuilder builder = new MarkupBuilder()
        builder.cards {
            card(cardnum:1){
                name "Visa"
                digits 16
            }
            card(cardnum:2){
                name "Amex"
                digits 15
            }
        }

        builder.html {
            head {
                title "Card Details"
            }
            body {
                h1 'Card Details in the input file'
            }
            table {
                tr{
                    th "Card Name"
                    th "Number of Digits"
                }
            }
        }
    }
}
