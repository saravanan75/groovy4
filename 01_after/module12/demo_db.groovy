package module12

import groovy.sql.Sql

class demo_db {
    public Sql getConnection(){
        Properties props = new Properties()
        File properties = new File("src/module12/db.properties")
        props.load(properties.newDataInputStream())
        def url = props.getProperty("url")
        def user = props.getProperty("user")
        def pwd = props.getProperty("pwd")
        def driver = props.getProperty("driver")

        def sql = Sql.newInstance(url, user, pwd, driver)
        return sql
    }
}
