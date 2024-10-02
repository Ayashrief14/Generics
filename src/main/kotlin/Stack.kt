class Stack <T> (private val mutableList: MutableList<T>){
    fun pushItem (item : T){
        mutableList.add(0, item)

    }
    fun popItem(){
        val removedItem = mutableList[0]
        mutableList.removeAt(0)
        println(" $removedItem is removed ")
    }
    fun peek (){
        val firstItem = mutableList[0]
        println(firstItem)
    }
    fun isEmpty (){
        println(mutableList.isEmpty())
    }
    fun size (){
        println(mutableList.size)
    }
}
