fun main() {
    var myData = mutableListOf(1, 2, 3, 4)
    val newStack = Stack<Int>(myData)
    newStack.pushItem(5)
    println(myData)

    newStack.popItem()
    println(myData)

    newStack.peek()
    newStack.size()


}