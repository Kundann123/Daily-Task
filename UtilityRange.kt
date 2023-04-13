fun main() {
    var range:IntRange=1.rangeTo(10)
    for (i in range)
        print(i)
    println()

    var range2=10 downTo 1
    for (i in range2)
        print(i)
    println()

    var range3=10.downTo(1)
    for (i in range3)
        print(i)
    println()

    for (i in  range.reversed())
        print(i)
    println()

    var range4= IntProgression.fromClosedRange(1,10,1)
    for (i in range4)
        print(i)
    println()

    var range5=IntProgression.fromClosedRange(10,1,-2)
    for(i in range5)
        print(i)
    println()
}