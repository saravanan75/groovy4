package module6

class demo_closure_scope {
    static void main(String[] args) {
        def processedCard = "Visa"

        def process = {String cardType ->
            println this
            println owner
            println delegate
            def sub_process = {
                println "$it found"
                println this
                println owner
                println delegate
            }
            switch(cardType){
                case ("Visa"):
                    sub_process ("Visa");
                    break;
                case ("Amex"):
                    sub_process ("Amex");
                    break;
                default :
                    sub_process ("Unrecongnized card type");
            }
        }
        process(processedCard)

        def testDelegate = {
            deleteCharAt(10)
        }
        StringBuffer build = new StringBuffer("This is a test String");
        testDelegate.delegate = build
        testDelegate.resolveStrategy = Closure.DELEGATE_FIRST

        println testDelegate()
    }

    static String deleteCharAt(int i){
        return "This is a custom deleteCharAt method"
    }

}
