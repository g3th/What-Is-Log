import java.lang.Thread.sleep

fun main(){
    val tune = arrayOf("♫ ♪ What is Log? ♫ ♪\n", "♫ ♪ Baby, dont hurt meee... ♫ ♪\n", "♫ ♪ Don't hurt meee... ♫ ♪\n", "♫ ♪ No mo-oore... ♫ ♪\n")
    var num = 2147483648
    var tuneCounter = 0
    var counter = 1
    while (num > 1){
        num /= 2
        if (tuneCounter == 4){
            tuneCounter = 0
        }
        println(tune[tuneCounter])
        println("$counter) $num\n")
        sleep(2000)
        counter += 1
        tuneCounter +=1
    }
    println("\n♫ ♪ no mo-ore. ♫ ♪\n")
}
