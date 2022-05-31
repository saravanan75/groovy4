package module7

import groovy.io.FileType

class demo_readdir {
    static void main(String[] args) {
        println "Please enter the directory to read the log files from"
        File dir = new File(System.in.newReader().readLine())
        println("You entered $dir")
        try {
            dir.eachFile(FileType.FILES) { println(it) }
            dir.eachFile {
                if (it.name.endsWith("log")) {
                    println("Processing file ${it.name}")
                }
            }
            dir.eachFileMatch(FileType.FILES, ~/.*.log/) {
                println("Processing file ${it.name} using eachFileMatch")
            }
        }catch(Exception e){
            println("Exception occured ${e.getMessage()}")
        }
    }
}
