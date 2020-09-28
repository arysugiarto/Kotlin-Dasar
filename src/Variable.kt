//const val yaitu variable jenis val yang bisa di akses global
const val APPLICATION="kotlin"
const val VERSION=  233


fun main() {
//    Mutable atau bisa di ubah
    var name="ary"
//    mengubah variable
    name="jakarta"
    println(name)

//    Imutable atau tdak bisa di ubah
    val alamat ="bandung"
    println(alamat)

//    Nullable atau variable kosong
    val age:Int? = null
    println(age)

//    pemanggilan variable cons di luar kelas main
    println("$APPLICATION $VERSION" )
}