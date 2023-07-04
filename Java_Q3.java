//Write a Java program to calculate the average of a list of numbers using a do-while loop.

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Java_Q3 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        ArrayList<Integer> numbers = new ArrayList<>();

	        System.out.println("Enter a list of numbers (-1 to stop):");
	        int num;
	        do {
	            num = input.nextInt();
	            if (num != -1) {
	                numbers.add(num);
	            }
	        } while (num != -1);

	        double sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }

	        double average = sum / numbers.size();
	        System.out.println("Average: " + average);

	        input.close();
	    }
	}

