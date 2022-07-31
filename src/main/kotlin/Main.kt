fun discountPrice(
    list: MutableList<Int>,
    discount: Int,
    offset: Int,
    readLength: Int,
){
    val newPrice: MutableList<Int> = mutableListOf()
    val range = offset..readLength
    for(i in list) {
        val new = i.toDouble() - (discount.toDouble() * i.toDouble()/100.0)
        newPrice.add(new.toInt())
    }
    println(newPrice.slice(range))
}

fun main() {
    val discount = 20// %
    val offset = 1
    val readLength = 3
    val price: MutableList<Int> = mutableListOf(5, 100, 20, 66, 16)

    discountPrice(list = price, discount = discount,offset = offset, readLength = readLength)

}