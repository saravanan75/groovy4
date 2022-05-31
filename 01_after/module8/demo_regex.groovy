package module8

import groovy.io.FileType

class demo_regex {
    static void main(String[] args) {

        File dir = new File("c:/groovy/logs")
        File output = new File("temp.txt")
        output.setWritable(true)
        output.setText("")
        try {
            dir.eachFileMatch(FileType.FILES, ~/.*.log/) {
                String line
                it.withReader {
                    while((line = it.readLine()) != null){
                        if(line !=~ "(?i)Amex|Visa"){
                            println("Credit Card Not Found")
                            output.withWriterAppend {
                                it.writeLine("Credit Card Not Found")
                            }
                        }
                    }
                }

            }
        }catch(Exception e){
            println("Exception occured ${e.getMessage()}")
        }
    }
}
