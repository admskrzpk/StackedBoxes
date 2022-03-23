object StackedBoxes extends App {

val names = args
val width = names(2).length

names.foreach{ name  =>
    println( " " * ((width - name.length) / 2) + "+" + "-" * name.length + "+")
    // |name|
    println( " " * ((width - name.length) / 2) + s"|$name|")

    if (names.last == name) println( " " * ((width - name.length) / 2) + "+" + "-" * name.length + "+")
    }
}