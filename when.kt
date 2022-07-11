fun main(){
    myAge(90)
}
fun myAge(age:Int){
when(age){
    in 3..8-> println("hey")
    in 9..16-> println("Hello")
    else ->println("Bye")
}
}