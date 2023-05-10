import java.lang.Thread.sleep

fun main(){
    val tune = arrayOf("♫ ♪ What is Log? ♫ ♪", "♫ ♪ Baby, dont hurt meee... ♫ ♪", "♫ ♪ Don't hurt meee... ♫ ♪", "♫ ♪ No mo-oore... ♫ ♪")
    var num = 2147483648
    var tuneCounter = 0
    var counter = 1
    while (num > 1){
        num /= 2
        if (tuneCounter == 4){
            tuneCounter = 0
        }
        println(tune[tuneCounter])
        println("$counter) $num")
        sleep(2000)
        counter += 1
        tuneCounter +=1
    }
    println("♫ ♪ no mo-ore. ♫ ♪")
}
