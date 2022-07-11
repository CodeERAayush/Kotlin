fun main(){
val input=readLine()?.toInt()
if(input!=null){
println(input.isPrime())
}
}
fun Int.isPrime():Boolean{
    for(i in 2 until this-1){
        if(this%i==0)return false;
    }
    return true;
}