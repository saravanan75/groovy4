package module5

class demo_exception {
    static void main(String[] args) {
        try{
            //RandomAccessFile file = new RandomAccessFile("unknownFile.txt", "r")
            def cards = ["Visa", "Amex", "Discover", "Diners"];
            println(cards[0].size())
            int i = 1/1
            def cardLength = [16,14,15,13];
            check(cardLength)
        }/*
        catch(Exception e){
            println (e.getMessage())
            e.printStackTrace()
        }
        catch (NullPointerException e){
            println ("Null pointer exception encountered")
            println (e.getMessage())
            e.printStackTrace()
        }
        catch (ArithmeticException e){
            println (e.getCause())
            println (e.getMessage())
        }
        */
        finally {
            println ("Lets perform resource cleanup")
        }
        println ("After try/catch block")

    }

    static check(List list){
        for(card in list){
            if(card < 14){
                throw new InvalidCardLengthException("Card contains fewer than 14 digits")
            }
            println (card)
        }
    }
}
