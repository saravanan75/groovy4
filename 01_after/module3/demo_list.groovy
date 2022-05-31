package module3

class demo_list {
    static void main(String[] args) {
        def intArray = new int[2]
        intArray[0] = 1
        intArray[1] = 2
        //intArray[2] = 3

        def list = [10,12,24,36,48]
        println ("The size of list is ${list.size()}")
        list.add(60)
        println ("The size of list after add is ${list.size()}")
        list.remove(0)
        println ("The size of list after remove is ${list.size()}")
        println("The List values $list")

        def complexList = [10,12,24,36, ["String1","String2"]]
        println ("The size of complexList is ${complexList.size()}")
        println ("The string element is ${complexList[4][0]}")
    }
}
