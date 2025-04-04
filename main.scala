
@main
def main(): Unit =

  println()
  val fl = "\uD83D\uDEA9"
  val sm = "\uD83D\uDE03"
  val won = "\uD83D\uDE0E"
  val lost = "\uD83D\uDE35"

  print("gitted")
  print("pushed again")
  print("pushed from laptop")
  print("pushed")
  print("hallo")
  print("neu")
  print("neuer1")

  print("manuel neuer")
<<<<<<< HEAD
  print("neuer2")
=======
  print("neuererererer")
<<<<<<< HEAD
>>>>>>> ddb915a4cc62e29da241526a3aabca44f44fdee9
=======
print("nochmal geneuert")
 
>>>>>>> 9348f708d5072cee2cfbcd8e30fcef9213b4fce4
  
  val mine =
    s"""Time for Minesweeper!

        _________________________________________
        |                                       |
        |     Bombs    Play again     Timer     |
        |    _______     _______     _______    |
        |    |     |     |     |     |     |    |
        |    |  0  |     | $won  |     | 155 |    |
        |    |_____|     |_____|     |_____|    |
        |    _______________________________    |
        |    |     |     |     |     |     |    |
        |    |  $fl |  2  |  2  |  4  |  X  |    |
        |    |_____|_____|_____|_____|_____|    |
        |    |     |     |     |     |     |    |
        |    |  1  |  2  |  $fl |  $fl |  $fl |    |
        |    |_____|_____|_____|_____|_____|    |
        |    |     |     |     |     |     |    |
        |    |  1  |  2  |  3  |  5  |  3  |    |
        |    |_____|_____|_____|_____|_____|    |
        |    |     |     |     |     |     |    |
        |    |  $fl |  2  |  $fl |  2  |  $fl |    |
        |    |_____|_____|_____|_____|_____|    |
        |_______________________________________|

        Congratulations, you won!
      """

  print(mine)
