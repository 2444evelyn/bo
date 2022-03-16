fun main(){
  var output = productArray(arrayOf(8,6,4,2))
    println(output)
    println(sumArray(arrayOf(25,2.5, 33.8,68.9,78,"water",true)))
    println(charArray(arrayOf('a','p','o','e','i','u')))
}
fun productArray(numbers:Array<Int>):Int{
   var product = 1
    numbers.forEach{num->
        product*=num

    }
    return product


}
fun sumArray(mixedtype:Array<Any>):Double{
    var sum = 0.0
    mixedtype.forEach { Any->
        if (Any is Double)
            sum+=Any
    }
    return sum

}
fun charArray(vowel:Array<Char>):Int{
    var char = 0
    vowel.forEach {vowel->
        if (vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u')
            char++
    }
    return char


}