package MethodOverloading;

//Method Overloading: changing data type of arguments
class Adder2 {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}
}

class TestOverloading2 {
	public static void main(String[] args) {
		System.out.println(Adder2.add(11, 11)); // if i keep single then it will go to int bcz its specific
	}
}