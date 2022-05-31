package module12


sealed interface ICardService permits test_swipe{
    void swipe()
}

class test_swipe implements ICardService{
    void swipe(){
        println ("Implementation");
    }
}

/*
class test_security implements ICardService{
    void swipe(){
        println("Implementation")
    }
}

 */

