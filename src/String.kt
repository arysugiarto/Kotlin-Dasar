fun main() {
//    petik 2 untuk satu baris petik 3 utuk ada enter guys

    var name: String ="Ary"
    var usia: String = "20"

    var alamat: String = """
        kebonwaru,
        ciracap,
        sukabumi
    """

    print(name)
    println(usia)
    println(alamat)

    var alamat2: String = """
        |saya
        |kepasar
    """.trimIndent()

    println(alamat2)

    var fullname   : String ="$name $usia"
    var desc: String = "$fullname length= ${fullname.length}"
    println(desc)
}