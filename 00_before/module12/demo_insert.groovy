package module12

import groovy.io.FileType
import groovy.sql.Sql

class demo_insert {
    static void main(String[] args) {
        File dir = new File("c:\\groovy\\logs\\");
        println "You entered ${dir}"
        dir.eachFileMatch(FileType.FILES, ~/.*\.log/) {
            println "Processing file $it.absolutePath"
            File out = new File(it.absolutePath)
            String line;
            it.withReader {//start with just println(it,readline and show it just print one line
                while ((line = it.readLine()) != null) {
                    def pattern = ~/(\d+)(?=\d{4})/
                    def match = (line =~ pattern)
                    if (match.find()) {
                        def str = match.group()
                        def update = out.text.replaceFirst(pattern, "*" * str.length())
                        println(update);
                        out.text = update;
                    }
                }
            }
        }

    }
}
