package main

import "fmt"

func main() {
	var num1 int
	var num2 int
	var num3 float64
	fmt.Scanln(&num1)
	fmt.Scanln(&num2)
	fmt.Scanln(&num3)
	var result float64 = (float64(num2) * num3)
	fmt.Printf("NUMBER = %d\n", num1)
	fmt.Printf("SALARY = U$ %.2f\n", result)
}
