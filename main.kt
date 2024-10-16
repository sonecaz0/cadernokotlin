fun main() {
  println("digite um número inteiro:")
  var num1:Int=readLine()?.toIntOrNull()?:0
  println("digite um número inteiro:")
  var num2:Int=readLine()?.toIntOrNull()?:0
  var result= num1+num2
  println ("A soma é:$result")
}