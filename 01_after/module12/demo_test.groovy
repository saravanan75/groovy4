package module12

import groovy.test.GroovyTestCase
import module9.card

class demo_test extends GroovyTestCase{
    def sum(x,y){
        return x+y
    }

    void testAdd(){
        assert sum(2, 3) == 5
    }

    void testStringAdd(){
        assertToString(sum("Str1", "Str2"), "Str1Str2")
    }
    void testCheck(){
        def card = new card("Visa", 16)
        assertEquals(card.getTotalDigits(), 19)
    }
}
