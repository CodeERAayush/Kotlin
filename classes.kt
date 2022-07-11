class Rectangle(
    val a:Double,
    val b:Double
){
    init{
        println("Rectangle created with a is $a and b is $b")
    }
    fun area()=a*b

}
fun main(){
    val myRect =Rectangle(4.0,5.0)
    println("Area= ${myRect.area()}")
}