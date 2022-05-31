package module11

class demo_meta {
    static void main(String[] args) {
        def mop = new demo_mop()
        println("A non-existing property: ${mop.cardName}")
        mop.implementDynamism = {name ->
            "An updated Closure"
        }
        println("An updated property: ${mop.cardName}")
        mop.getSomeMethod("Visa")
    }
}
