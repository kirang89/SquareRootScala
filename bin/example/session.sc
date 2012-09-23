object session {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet

	def abs(x: Double) = if (x < 0) -x else x //> abs: (x: Double)Double

	def sqrt(a: Double) = {

		def sq(guess: Double, x: Double): Double =
			if (isGoodEnough(guess, x)) guess
			else sq(improve(guess, x), x)

		def isGoodEnough(guess: Double, x: Double) =
			abs(guess * guess - x) / x < 0.001

		def improve(guess: Double, x: Double) =
			(guess + x / guess) / 2

		sq(1.0, a)
	}                                         //> sqrt: (a: Double)Double

	sqrt(2)                                   //> res0: Double = 1.4142156862745097
	sqrt(4)                                   //> res1: Double = 2.000609756097561
	sqrt(100)                                 //> res2: Double = 10.000052895642693
	sqrt(1e60)                                //> res3: Double = 1.0000788456669446E30
}