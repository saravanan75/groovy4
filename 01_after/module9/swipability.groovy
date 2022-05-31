package module9

trait swipability {
    int num_swipes = 0
    void validateSwipe(){
        println("Validating Swipe")
    }
    int getSwipes(){
        num_swipes+=1
        num_swipes
    }

}