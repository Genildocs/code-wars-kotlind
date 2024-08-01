//Escreva uma função que aceite um inteiro n e uma string s como parâmetros e retorne uma string de vezes exatas repetidas n.
//
//Exemplos (entrada -> saída)
//6, "I"     -> "IIIIII"
//5, "Hello" -> "HelloHelloHelloHelloHello"

fun main(){
    println(repeatStr(6,"L"))
    println(repeatStr(5,"Hello"))
}

fun repeatStr(r:Int, str: String):String {
    return str.repeat(r)
}