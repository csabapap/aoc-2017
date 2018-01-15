object Day03 {

    fun part1(input: Int): Int {
        val closestSquareNumber = closestSquareNumber(input)
        val square = closestSquareNumber * closestSquareNumber

        var x = 0
        var y = 0

        if (input == square) {
            return closestSquareNumber-1
        }

        // even
        if (square % 2 == 0) {
            x = closestSquareNumber / 2 - 1
            y = closestSquareNumber / 2
        } else {
            x = (closestSquareNumber - 1) / 2
            y = x
        }

        if (input > square) {
            x += 1
            y -= input - square - 1
            y = Math.abs(y)
        } else {
            x -= square - input
            x = Math.abs(x)
        }

        val distance = x + y
        println(distance)
        return distance
    }

    fun part2(input: Int): Int {
        TODO()
    }

    private fun closestSquareNumber(number: Int) : Int {
        val squareRoot = Math.sqrt(number.toDouble())
        var squareRootInt = squareRoot.toInt();
        if (squareRoot - squareRootInt > 0.5) {
            squareRootInt += 1
        }
        return squareRootInt
    }

}