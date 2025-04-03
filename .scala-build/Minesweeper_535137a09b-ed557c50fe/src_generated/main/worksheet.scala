

final class worksheet$_ {
def args = worksheet_sc.args$
def scriptPath = """c:\HTWG_Module\Minesweeper_SE\Minesweeper\worksheet.sc"""
/*<script>*/
// Create Minefield with a 2D array
val row = 9
val col = 9
val mineField = Array.ofDim[Int](row, col) // 2D array of Ints

val mine = "ðŸ’£"
val mineCount = 10 // Number of mines
val settedFlags = 0 // Number of flags to set
val empty = "â¬œï¸" // Empty cell
val flag = "\uD83D\uDEA9" // Flag cellg
val directions = List((-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 1), (1, -1), (1, 0), (1, 1))

val currentSetFlag = mineCount - settedFlags


if (currentSetFlag == 0) print("YOU WON!")



print("------------MINE SWEEPER------------- \n"+
      "=====================================\n"+
      "|   |   |   |   |   |   |   |   |   |  \n"+
      "=====================================\n"+
      "|   |   |   |   |   |   |   |   |   |  \n"+
      "=====================================\n"+
      "|   |   |   |   | "+flag+" |   |   |   |   |  \n"+
      "=====================================\n"+
      "|   |   |   |   |   |   |   |   |   |  \n"+
      "=====================================\n"+
      "|   |   |   |   |   |   |   |   |   |  \n"+
      "=====================================\n"+
      "|   |   |   |   |   |   |   |   |   |  \n"+
      "=====================================\n"+
      "---Flags to set:"+ currentSetFlag+"---- \n")
/*</script>*/ /*<generated>*//*</generated>*/
}

object worksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new worksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export worksheet_sc.script as `worksheet`

