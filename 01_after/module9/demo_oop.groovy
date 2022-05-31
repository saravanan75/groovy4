package module9

import groovy.io.FileType

class demo_oop {
    static void main(String[] args) {

        File dir = new File("c:/groovy/logs")
        List cardsList = []
        try {
            dir.eachFileMatch(FileType.FILES, ~/.*.log/) {
                File out = new File(it.absolutePath)
                String line
                it.withReader {
                    while((line = it.readLine()) != null){
                        def pattern = ~/\d+\s+(\w+)\s+(\d+)/
                        def match = (line =~ pattern)
                        if(match.find()){
                            def cardName = match.group(1)
                            int cardDigits = match.group(2).length()
                            cardGroovyBean c = new cardGroovyBean()
                            c.name = cardName
                            c.num_digits = cardDigits
                            cardsList.add(c)
                            //def str = match.group()
                            //def update = out.text.replaceFirst(pattern, "*"*str.length())
                            //println(update)
                            //out.text = update
                        }
                    }
                }

            }
            cardsList.each { card -> println("$card.name is $card.num_digits digits long")}
        }catch(Exception e){
            println("Exception occured ${e.getMessage()}")
        }
    }
}
