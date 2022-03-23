object StackedBoxes extends App {

val names = args.sortBy(x => (x.length, x.head))
val width = names.last.length

names.foreach{ name  =>
    println( " " * ((width - name.length) / 2) + "+" + "-" * name.length + "+")
    println( " " * ((width - name.length) / 2) + s"|$name|")

    if (names.last == name) println( " " * ((width - name.length) / 2) + "+" + "-" * name.length + "+")
    }
}
