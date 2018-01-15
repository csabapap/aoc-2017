package answer

import java.util.*

// All answers, base64 encoded so that you don't accidentally read them
object Answer {
  val DAY01_PART1 = decrypt("MTM0MQ==").toInt()
  val DAY01_PART2 = decrypt("MTM0OA==").toInt()
  val DAY02_PART1 = decrypt("NDMwNzQ=").toInt()
  val DAY02_PART2 = decrypt("MTk3").toInt()
  val DAY03_PART1 = decrypt("Mzcx").toInt()
  val DAY03_PART2 = decrypt("MzY5NjAx").toInt()
  val DAY04_PART1 = decrypt("NDc3").toInt()
  val DAY04_PART2 = decrypt("MTY3").toInt()
  val DAY05_PART1 = decrypt("MzU5MzQ4").toInt()
  val DAY05_PART2 = decrypt("Mjc2ODg3NjA=").toInt()
  val DAY06_PART1 = decrypt("MzE1Ng==").toInt()
  val DAY06_PART2 = decrypt("MTYxMA==").toInt()
  val DAY07_PART1 = decrypt("ZXFndmY=")
  val DAY07_PART2 = decrypt("NzU3").toInt()
  val DAY08_PART1 = decrypt("NTIyMQ==").toInt()
  val DAY08_PART2 = decrypt("NzQ5MQ==").toInt()
  val DAY09_PART1 = decrypt("MTQxOTA=").toInt()
  val DAY09_PART2 = decrypt("NzA1Mw==").toInt()
  val DAY10_PART1 = decrypt("MTM3NjA=").toInt()
  val DAY10_PART2 = decrypt("MmRhOTMzOTVmMWE2YmIzNDcyMjAzMjUyZTNiMTdmZTU=")
  val DAY11_PART1 = decrypt("NzA3").toInt()
  val DAY11_PART2 = decrypt("MTQ5MA==").toInt()
  val DAY12_PART1 = decrypt("MTEz").toInt()
  val DAY12_PART2 = decrypt("MjAy").toInt()
  val DAY13_PART1 = decrypt("MjE2MA==").toInt()
  val DAY13_PART2 = decrypt("MzkwNzQ3MA==").toInt()
  val DAY14_PART1 = decrypt("ODIwNA==").toInt()
  val DAY14_PART2 = decrypt("MTA4OQ==").toInt()
  val DAY15_PART1 = decrypt("NTY3").toInt()
  val DAY15_PART2 = decrypt("MzIz").toInt()
  val DAY16_PART1 = decrypt("b2NpZWRwamJtZm5raGxnYQ==")
  val DAY16_PART2 = decrypt("Z25mbGJrb2poaWNwbWVhZA==")
  val DAY17_PART1 = decrypt("MTkxMg==").toInt()
  val DAY17_PART2 = decrypt("MjEwNjY5OTA=").toInt()
  val DAY18_PART1 = decrypt("Mjk1MQ==").toInt()
  val DAY18_PART2 = decrypt("NzM2Ng==").toInt()
  val DAY19_PART1 = decrypt("U1hXQUlCVVpZ")
  val DAY19_PART2 = decrypt("MTY2NzY=").toInt()
  val DAY20_PART1 = decrypt("MTQ0").toInt()
  val DAY20_PART2 = decrypt("NDc3").toInt()
  val DAY21_PART1 = decrypt("MTE3").toInt()
  val DAY21_PART2 = decrypt("MjAyNjk2Mw==").toInt()
  val DAY22_PART1 = decrypt("NTQ2Mg==").toInt()
  val DAY22_PART2 = decrypt("MjUxMjEzNQ==").toInt()
  val DAY23_PART1 = decrypt("ODI4MQ==").toInt()
  val DAY23_PART2 = decrypt("OTEx").toInt()
  val DAY24_PART1 = decrypt("MTg2OA==").toInt()
  val DAY24_PART2 = decrypt("MTg0MQ==").toInt()
  val DAY25_PART1 = decrypt("NTU5Mw==").toInt()

  private fun decrypt(s: String) = Base64.getDecoder().decode(s.toByteArray()).toString(Charsets.UTF_8)

}