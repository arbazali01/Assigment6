package Assigment;

public class InerchangingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "Geekster is my class room";
		
		String[] inputArr = input.split(" ");
		int n = inputArr.length;
		
		String reversedInput = "";
		for(int i = n-1; i>=0; i--) {
			reversedInput += inputArr[i]+ " ";
		}
		
		System.out.println(reversedInput);
		
		
	}

}
