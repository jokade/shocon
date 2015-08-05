import eu.unicredit.shocon.ConfigParser
import org.parboiled2._

object Main {
  def main(args: Array[String]): Unit = {

    print(new ConfigParser(
      """
        |foobar [
        |
        |
        |   1 #cmt
        |     // ssss
        |
        |   2, # SD
        |
        |  {
        |      x = "test val", //as
        |      
        |y = foo
        |
        |      k = 12
        |
        | anobj {
        |   k: 123
        |   z = 4444
        |       }
        |
        |      z = 23232
        |      }
        |
        |      {
        |
        |          option = true,
        |
        |          other = truebar
        |
        |      }
        |]
      """.stripMargin.trim()).InputLine.run()) // evaluates to `scala.util.Success(2)`
  }
}