object StackedBoxes2 extends App {

    val names = List("Ala", "Beata", "Cecylia")
    val width = names.last.length

    def christmasTree(ls: List[String], n: Int): Unit = {
        def x = ls(n)
        val spaces = " " * ((width - x.length) / 2)
        val border = spaces + "+" + "-" * x.length + "+"

        println(border)
        println(s"$spaces|$x|")

        if (x != ls.last) christmasTree(ls, n+1)
        else println(border)
    }

    christmasTree(names, 0)
}