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
        var sum = 0
        input.lines().forEach({ line ->
            var lineSum = 0;
            val numbersString = line.split("\\s".toRegex())
            for (i in 0 until numbersString.size - 1) {
                (i + 1 until numbersString.size)
                        .filter {
                            val first = numbersString[i].toInt()
                            val second = numbersString[it].toInt()
                            if (first > second) {
                                first % second == 0
                            } else {
                                second % first == 0
                            }
                        }
                        .forEach {
                            val first = numbersString[i].toInt()
                            val second = numbersString[it].toInt()
                            if (first > second) {
                                lineSum += first / second
                            } else {
                                lineSum += second / first
                            }
                        }
            }
            sum += lineSum
        })
        return sum
    }

}