object Day02 {

    fun part1(input: String): Int {
        var sum = 0
        input.lines().forEach({ line ->
            var min = 0
            var max = 0
            line.split("\\s+".toRegex()).forEach {
                val number = it.toInt()
                if (min == 0 || min > number) {
                    min = number
                }

                if (max == 0 || max < number) {
                    max = number
                }
            }
            sum += max - min
        })
        return sum
    }

    fun part2(input: String): Int {
        TODO()
    }

}