object session {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(46); 

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(119); 

  def sq(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sq(improve(guess, x), x);System.out.println("""sq: (guess: Double, x: Double)Double""");$skip(84); 

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(72); 

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(37); 

  def sqrt(a: Double) = sq(1.0, a);System.out.println("""sqrt: (a: Double)Double""");$skip(12); val res$0 = 

  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(4);System.out.println("""res1: Double = """ + $show(res$1));$skip(12); val res$2 = 
  sqrt(100);System.out.println("""res2: Double = """ + $show(res$2))}
}