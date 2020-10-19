package Day_14_Methods_Part2;

public class Lab1_Question1 {

	public static void main(String[] args) {
//		Write a method that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String
//
//		stringTimes("Hi", 2); = > HiHi
//		stringTimes("Hi", 3); = > HiHiHi
//		stringTimes("Hi", 1); = > Hi

		greeting("Hi", 2);

	}

	public static void greeting(String greet, int num1) {
		String str = "";
		for (int i = 0; i < num1; i++) {

			str = str + greet;
		}
		System.out.println(str);
	}
}
