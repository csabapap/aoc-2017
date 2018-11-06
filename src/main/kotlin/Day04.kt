object Day04 {

    fun part1(input: String): Int {
        val lines = input.split("\n")
        var nmbOfValidPassPhrases = 0
        lines.forEach lines@{line ->
            val wordsList = mutableSetOf<String>()
            val words = line.split(" ")
            words.forEach {
                if (wordsList.contains(it)) {
                    return@lines
                }
                wordsList.add(it)
            }
            nmbOfValidPassPhrases+=1
        }
        return nmbOfValidPassPhrases
    }

    fun part2(input: String): Int {
        TODO()
    }

}