import kotlin.math.abs

object Day05 {

    fun part1(input: String): Int {
        val numbers = input.split("\n").map { it.toInt() }.toMutableList()
        var nextIndex = 0
        var steps = 0

        while (nextIndex < numbers.size) {
            val currentIndex = nextIndex
            nextIndex = numbers[currentIndex]
            nextIndex += currentIndex
            numbers[currentIndex] = numbers[currentIndex] + 1
            steps +=1
        }

        return steps
    }

    fun part2(input: String): Int {
        val numbers = input.split("\n").map { it.toInt() }.toMutableList()
        var nextIndex = 0
        var steps = 0

        while (nextIndex < numbers.size) {
            val currentIndex = nextIndex
            val offset = numbers[currentIndex]
            nextIndex = offset + currentIndex
            if (offset >= 3) {
                numbers[currentIndex] = numbers[currentIndex] - 1
            } else {
                numbers[currentIndex] = numbers[currentIndex] + 1
            }
            steps +=1
        }

        return steps
    }

}