object Day01 {

  fun part1(input: String): Int {
      var prev = ""
      var sum = 0
      var i = 0
      while (i < input.length) {
          val next = input.toCharArray()[i]
          if (prev.isEmpty()) {
              prev = next.toString()
              i++
              continue
          }

          if (prev == next.toString()) {
              sum += prev.toInt()
              prev = next.toString()
              i++
              continue
          }

          prev = next.toString()
          i++
      }

      if (input.toCharArray()[0] == input.toCharArray()[input.lastIndex]) {
          val circle = input[0].toString().toInt()
          sum += circle
      }
      return sum
  }

  fun part2(input: String): Int {
      var sum = 0
      var i = 0
      val half = input.length / 2
      while (i < input.length) {
          val next = input.toCharArray()[i]

          var position_to_check = i + half
          if (position_to_check >= input.length) {
              position_to_check -= input.length
          }

          if (next == input.toCharArray()[position_to_check]) {
              sum += next.toString().toInt()
          }
          i++
      }
      return sum
  }

}