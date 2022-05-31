package module8

import groovy.io.FileType

class demo_regex_rewrite {
    static void main(String[] args) {

        File dir = new File("c:/groovy/logs")
        try {
            dir.eachFileMatch(FileType.FILES, ~/.*.log/) {
                File out = new File(it.absolutePath)
                String line
                it.withReader {
                    while((line = it.readLine()) != null){
                        def pattern = ~/(\d+)(?=\d{4})/
                        def match = (line =~ pattern)
                        if(match.find()){
                            def str = match.group()
                            def update = out.text.replaceFirst(pattern, "*"*str.length())
                            println(update)
                            out.text = update
                        }
                    }
                }

            }
        }catch(Exception e){
            println("Exception occured ${e.getMessage()}")
        }
    }
}
