package module7

import groovy.io.FileType

class demo_readfiles {
    static void main(String[] args) {

        File dir = new File("c:/groovy/logs")

        try {
            dir.eachFileMatch(FileType.FILES, ~/.*.log/) {
                //println(it.text)
                //List contents = it.collect()
                //contents.each { println(it)}
                //List lines = it.readLines()
                //println("Total number of lines ${lines.size()}")
                String line
                it.withReader {
                    while((line = it.readLine()) != null){
                        if(line.contains("Visa"))
                        println(line)
                    }
                }

            }
        }catch(Exception e){
            println("Exception occured ${e.getMessage()}")
        }

        File notepad = new File("c:/windows/notepad.exe")
        byte[] filecontent = notepad.bytes
        println (filecontent.length)
        println(filecontent.size())
    }
}
