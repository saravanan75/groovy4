package module12

class demo_builtin {
    static void main(String[] args) {
        def name = "Visa"
        def digits =16;
        def digitranges = 14..17
        println SV(name, digits, digitranges)

        def nvl = NVL(name, digits)
        println(nvl)
        println(nvl.name)
    }
}
