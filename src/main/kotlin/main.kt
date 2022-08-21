fun main(args: Array<String>){

    // create a simple list.
    // lists are immutable - ie once created you cannot change it.
    var colors = listOf("Green","Yellow","Blue")
    println(colors)

    // If you create an empty list you MUST specify its TYPE
    var cars = listOf<String>()
    var numbers = listOf<Int>()

    // A List can contain duplicate elements.
    // a list item can be accessed by its position, as per usual it starts at zero.

    println(colors[1]) // should return yellow.

    // ARRAYLIST
    // these lists are mutable - ie you can add and remove items.

    val myColors = arrayListOf("Green","Yellow","Blue")
    println(myColors)

    myColors.add("Orange")
    println(myColors)

    myColors.remove("Blue")
    println(myColors)

    // can also be declared by specifying the TYPE
    val myCars = arrayListOf<String>()

    myCars.add("Bmw")

    println(myCars)

    val myFavouriteAnimals = listOf<String>("Wolf","Bear","Tiger","Girraffe")
    println("My Favorite animal count : ${myFavouriteAnimals.size}")
    println("The second element in my favourite animal list is : ${myFavouriteAnimals[1]}")


    val myCustomersList = arrayListOf<String>("Erica","Daisy","Samantha")
    println(myCustomersList)
    myCustomersList.add("Nancy")
    println(myCustomersList)
    myCustomersList.remove("Daisy")
    println(myCustomersList)


    val myDeskItems = arrayListOf<String>("Pen","Mug","Bottle","Pad","Ruler","Lego")
    val removeItems = listOf<String>("Bottle","Mug","Lego")
    println("My Current Items on my desk: $myDeskItems")
    myDeskItems.removeAll(removeItems)
    println("I have cleant my desk and these are the remainding items $myDeskItems")

    // Some functions of the ListArray

    println("listof contains blue : ${colors.contains("Yellow")}") // should yield a true
    println("listof contains blue : ${colors.contains("Magenta")}") // should yield a false

}