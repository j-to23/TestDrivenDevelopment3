package com.qa.testdrivendevelopment;

import java.util.ArrayList;
import java.util.Arrays;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Write a function which takes 2 integers greater than 0, X,Y as input and
	 * generates a 2-dimensional array. The element value in the i-th row and j-th
	 * column of the array should be i*j. <br>
	 * Note: i=0,1.., X-1; j=0,1,¡­Y-1. <br>
	 * <br>
	 * For Example: <br>
	 * multiply(3,2) → [[0,0,0],[0,1,2]] <br>
	 * multiply(2,1) → [[0,0]] <br>
	 * multiply(3,4) → [[0,0,0],[0,1,2],[0,2,4],[0,3,6]]
	 */
	public int[][] multiply(int arrayLength, int numOfArrays) {
		int[][] ray = new int[numOfArrays][arrayLength];
		int i = 0;
		int j = 0;

		for (j = 0; j < arrayLength; j++) {
			for (i = 0; i< numOfArrays;i++) {
			ray[i][j] = i*j;
			}
		}		
		return ray;
	}

	/**
	 * Write a function that accepts a comma separated sequence of words as input
	 * and prints the words in a comma-separated sequence after sorting them
	 * alphabetically.
	 * 
	 * For Example: sortAlphabetically({"bag","car","dog"}) → {"bag","car","dog"}
	 * sortAlphabetically({"dog","car","bag"}) → {"bag","car","dog"}
	 * sortAlphabetically({"car","bark","bag","dog"}) → {"bag","bark","car","dog"}
	 */
	public String[] sortAlphabetically(String[] wordSequence) {
		int length = wordSequence.length;

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (wordSequence[i].compareTo(wordSequence[j]) > 0) {
					String temp = wordSequence[i];
					wordSequence[i] = wordSequence[j];
					wordSequence[j] = temp;
				}
			}
		}
		return wordSequence;
	}

	/**
	 * Write a function which takes an input, a, and returns the sum a+aa+aaa+aaaa.
	 * So if 2 was the input, the function should return 2+22+222+2222 which is
	 * 2468.
	 * 
	 * For Example: aPlus(5) → 6170 aPlus(9) → 11106
	 */
	public int aPlus(int num) {

		String value = Integer.toString(num);
		String two = value + value;
		String three = two + value;
		String four = three + value;
		int plus = num + Integer.parseInt(two) + Integer.parseInt(three) + Integer.parseInt(four);

		return plus;
	}

	/**
	 * Write a function which takes a string of numbers, separated by commas, and
	 * returns all the odd numbers as a string, separated by commas. If there are no
	 * odd numbers then the function should return "null".
	 * 
	 * Inputs will always be given in ascending order, eg "3,4,5". Outputs should
	 * also be given in ascending order.
	 * 
	 * For Example: oddNum("1,2,3,4,5") → "1,3,5" oddNum("2,4,6,8") → "null"
	 * oddNum("23,48,52,57") → "23,57"
	 */
	public String oddNum(String allNums) {
		String[] splitup = allNums.split(",");
		int[] numbers = new int[splitup.length];

		for (int x = 0; x < numbers.length; x++) {
			numbers[x] = Integer.parseInt(splitup[x]);
		}

		int j = 0;
		ArrayList<Integer> odds = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {

			j = numbers[i] % 2;
			if (j > 0) {
				odds.add(numbers[i]);
			}
		}
		Integer[] oddarray = odds.toArray(new Integer[0]);

		String result = "";

		for (int y = 0; y < oddarray.length; y++) {
			result = result + oddarray[y];
			if (y < oddarray.length - 1) {
				result = result + ",";
			}
		}
		if (result == "") {
			return null;
		}
		return result;
	}

	/**
	 * Define a function that can accept two strings as input and returns the string
	 * of largest length
	 * 
	 * If two strings have the same length, then the function should return both
	 * strings separated by a single space. In this case, the strings should be
	 * returned in the same order in which they were given.
	 * 
	 * For Example: longString("hi","hello") → "hello" longString("three", "two") →
	 * "three" longString("three", "hello") → "three hello"
	 */
	public String longString(String input1, String input2) {
		int in1 = input1.length();
		int in2 = input2.length();
		String longstr = "";

		if (in1 == in2) {
			longstr = input1 + " " + input2;
		} else if (in1 < in2) {
			longstr = input2;
		} else if (in2 < in1) {
			longstr = input1;
		}
		return longstr;
	}

	/**
	 * Given an email address person@company.com, and a parameter "person" or
	 * "company", write a function which returns the corresponding piece of
	 * information. Your function should ignore case.
	 * 
	 * For Example: email("john@google.com", "person") → "john"
	 * email("jane@Microsoft.com", "company") → "microsoft" email("Dave@amazon.com",
	 * "person") → "dave"
	 */
	public String email(String email, String parameter) {
		String result = "";
		if (parameter == "person") {
			result = email.substring(0, email.indexOf("@")).toLowerCase();
		}
		if (parameter == "company") {
			result = email.substring(email.indexOf("@") + 1, email.indexOf(".")).toLowerCase();
		}

		return result;
	}

	/**
	 * The fibonacci sequence is the sum of the last two numbers, with index 0 and 1
	 * having a value of 0 and 1 respectively
	 * 
	 * So fibonacci(5) is the sum of fibonacci(4) + fibonacci(3)
	 * 
	 * For Example: fibbonaci(0) → 0 fibbonaci(1) → 1 fibbonaci(2) → 1 fibbonaci(3)
	 * → 2 fibbonaci(4) → 3 fibbonaci(5) → 5 fibbonaci(8) → 21
	 */
	public int fibonacci(int num) {
		int i = 2;
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = 0;
		if (num == 0) {
			return 0;
		}else if (num == 1) {
			return 1;
		} else {
			for (i = 2; i<=num; i++) {
				fib3 = fib1 + fib2;
				fib1 = fib2;
				fib2 = fib3;
			}
		}
		
		System.out.println(fib3);
		return fib3;
	}

	/**
	 * Write a function which, given a string input, returns a string which contains
	 * only the characters with odd indexes.
	 * 
	 * For Example: oddLetters("Sponge") → "pne" oddLetters("hi") → "i"
	 * oddLetters("0H1e2l3l4o5w6o7r8l9d") → "Helloworld"
	 */
	public String oddLetters(String input) {
		String oddl = "";
		String oddls = "";

		for (int i = 1; i < input.length();) {
			oddl = input.substring(i, i + 1);
			oddls = oddls + oddl;
			i = i + 2;
		}

		return oddls;
	}

	/**
	 * Write a function which solves the following puzzle. A farm has chickens and
	 * rabbits, and scanners are able to detect the number of heads and legs. How
	 * many chickens do we have, if we know the number of heads and legs? The values
	 * for 'heads' and 'legs' will be inputs. If there are no solutions to the
	 * puzzle, return null
	 * 
	 * For Example: chickenAndRabbits(35, 94) → 23 chickenAndRabbits(2, 6) → 1
	 * chickenAndRabbits(12,63) → null
	 */
	public Integer chickenAndRabbits(int heads, int legs) {

		while (heads > 0) {
			heads = heads - 1;
			legs = legs - 4;
			if (legs == heads * 2) {
				return heads;
			}
		}
		return null;
	}

	/**
	 * Write a function which checks the validity of a credit card number. The
	 * function should return a boolean, True if the card is valid, or False if it
	 * is not.
	 * 
	 * A credit card has a valid number if it satisfies the following criteria. - it
	 * must start with a 4, 5 or 6. - it must contain exactly 16 digits. - each
	 * digit must be 0-9 inclusive. - it may contain hyphens ("-"), to separate
	 * groups of 4 digits only, but it cannot contain any other characters. - it
	 * must not have 4 or more consecutive repeated digits.
	 * 
	 * For Example: validCard("4012-3456-7890-1234") → True
	 * validCard("0123-4567-8901-2345") → False validCard("401234567890123") → False
	 * validCard("4012 3456 7890 1234") → False validCard("4444-0123-4567-8901") →
	 * False validCard("4012345678901234") → True
	 */
	public boolean validCard(String cardNumber) {
		String cn = cardNumber;
		int i = 0;
		int quadcheck = 1;
		switch (cn.substring(0, 1)) {
		case "4":
		case "5":
		case "6":
			cn = cn.replace("-", "");
			switch (cn.length()) {
			case 16:
				for (i = 0; i < cn.length() - 5; i++) {
					if (cn.charAt(i) == cn.charAt(i + 1) && cn.charAt(i) == cn.charAt(i + 2)
							&& cn.charAt(i) == cn.charAt(i + 3)) {
						quadcheck = 0;
					}
				}
				switch (quadcheck) {
				case 1:
					return true;
				}
			}
		}

		return false;
	}
}