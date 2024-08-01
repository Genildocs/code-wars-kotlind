//Escreva uma função que remova os espaços da string e depois retorne a string resultante.
//
//Exemplos:
//
//Input -> Output
//"8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
//"8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
//"8aaaaa dddd r     " -> "8aaaaaddddr"

fun main(){
    val str1 = "8 j 8   mBliB8g  imjB8B8  jl  B"
    println("Entrada: $str1 |-> Saida: ${noSpace(str1)}")
    println(noSpace("8aaaaa dddd r     " ))
    println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"))
}

//fun noSpace(x: String): String {
//    val newString = StringBuilder()
//    newString.append(x)
//    return newString.toString().replace(" ", "")
//}

fun noSpace(x: String): String {
    return x.replace(" ", "")
}