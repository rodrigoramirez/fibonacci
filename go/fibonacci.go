// This code calculates the fibonacci of some large number many times and
// each time prints the total time it took to calculate the value
// @author Rodrigo Ramirez
package main

import (
	"time"
)


// Calculates the Fibonacci of n
func f(n int) int {
	if n <= 2 {
		return 1
	}

	n1 := 1
	n2 := 1
	result := 0

	for i := 3; i <= n; i++ {
		result = n1 + n2
		n2 = n1
		n1 = result
	}

	return result
}


// Prints the average time it takes to calculate f(n)
func trackExecutionSpeed() {
	println("Average time to execute f(90) in nanoseconds")
	for i := 0; i < 200; i++ {
		startTime := time.Now()
		for j := 0; j < 50; j++ {
			f(90)
		}
		totalTime := time.Since(startTime)
		println(totalTime.Nanoseconds() / 50.0)
	}

	return
}

func main() {
	trackExecutionSpeed()
	return
}
