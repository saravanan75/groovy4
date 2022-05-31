package module3

class demo_range {
    static void main(String[] args) {
        def range1 = 1..10
        println("Size of range1 is ${range1.size()}")

        def range2 = 1..<10
        println("Size of range2 is ${range2.size()}")

        def alpha = ('a'..'z')
        println("Size of alpha is ${alpha.size()}")
        println("A sublist : ${alpha.subList(2,4)}")
        println("10th element in this range is ${alpha.get(9)}")

    }
}
