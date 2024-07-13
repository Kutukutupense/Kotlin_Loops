//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 //-----------for ile değerleri almak---------------------------------
    for (value in 1..10){
        println("$value")
    }
//--------------for ile indexleri almak------------------------------
    val countryCode = arrayOf("tr","az","uk","ro")
    for (value in countryCode.indices){
        println(value)
    }
//---------------for ile index ve değeri beraber almak---------------
    for ((index,value) in countryCode.withIndex()){
        println("$index - $value")
    }

 // -----------------while döngüsü---------------------
    //1. yol
   var number = 0
    while(number<5){
        println("${number++}")
    }
    // 2. yol
    var number2 = 0
    while (number2<5){
        println("$number2")
        number2++
    }

 //--------------repeat fonksiyonu--------------------------------------------
    repeat(10){
        println("Daha Çok Çalışmam Gerek")
    }

    //---------döngülerde label kullanmak--------------------------------
    //iç içe döngüler kullanıyorsak break ve continue lardan sonra @returnLabel kullanabiliriz

    returnLabel@ for (value1 in 1..10){
        for (value2 in 1..10){
            if(value2 == 5){
                continue@returnLabel
            }
            println("$value1 - $value2")
        }
    }
    // burada normalde value2 değeri 5 e eşit olduğunda 5 i atlayıp yine value2 deki
    // 6 ya geçecekti ama label verdiğimiz  için alt döngüdeki
    // 6 yerine üst döngüye yani value1 e dönüyor ve value1de 2 yazıp yine
    // alt döngüye devam ediyor. returnLabel yerine istediğin şeyi yazabilirsin
    // mesela @geriEtiketi vs gibi.

    println("------------------------------------------------------------------")

    returnLabel@ for (value1 in 1..10){
        for (value2 in 1..10){
            if(value2 == 5){
                break@returnLabel
            }
            println("$value1 - $value2")
        }
    }
    // burada da normalde alt döngü yani value2 5 e eşit olduğunda alt döngüyü kıracak ve
    // üst döngüye yani value1 e devam edecekti. ama biz label ı üst döngü başına koyduğumuz için komple
    // 1. döngüyü de break etmiş oldu.
}