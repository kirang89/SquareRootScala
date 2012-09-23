package progfun

object Arith {

	def sqrt(x: Double) = {

		def abs(x: Double) = if (x < 0) -x else x

		def sq(guess: Double): Double =
			if (isGoodEnough(guess)) guess
			else sq(improve(guess))

		def isGoodEnough(guess: Double) =
			abs(guess * guess - x) / x < 0.001

		def improve(guess: Double) =
			(guess + x / guess) / 2

		sq(1.0)
	}

	def factorial(a: BigInt): BigInt =
		if (a == 0) 1 else a * factorial(a - 1)
}