package module7

class demo_search {
    static void main(String[] args) {

        File dir = new File("c:/groovy/logs")
        File output = new File("temp.txt")
        output.setWritable(true)
        output.setText("")

        dir.traverse(nameFilter: ~/.*\.log/, excludeNameFilter: ~/^20+\.log/) {  println(it)}

    }
}
