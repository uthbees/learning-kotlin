// Completes all the module requirements.
fun moduleRequirements() {
    var mutable = "mutable"
    val immutable = "immutable"

    println("$mutable $immutable")

    mutable = "mutated"

    println("$mutable $immutable")

    println("Please enter a number.")
    val input = readln().toInt()

    if (input < 10) {
        println("Your number was less than 10.")
    } else {
        println("Your number was not less than 10.")
    }

    println("Now we will loop 10 times.")
    for (i in 1..10) {
        println(i)
    }

    demoFunction("foo")

    val demoClass = DemoClass("asdf")
    demoClass.demoMethod()
}

fun demoFunction(arg: String) {
    println("Printing argument: $arg")
}

class DemoClass(demoString: String) {
    private val demoProp = "demoString: $demoString"

    fun demoMethod() {
        println("demoProp is: $demoProp")
    }
}
