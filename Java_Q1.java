//Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.
	import java.util.Scanner;
	public class Java_Q1 {

	      public static void main(String[]args){
	    Scanner sc1= new Scanner(System.in);
	   System.out.println("Enter Number to check whether the number is positive or negative");
	    int no= sc1.nextInt();


	     if(no>0){
	           System.out.println("Number is Positive");
	     }
	   else if(no<0){
	            System.out.println("Number is Negative");
	    }
	   else if(no==0){
	            System.out.println("Number  is Zero");
	    }
	   else{
	          System.out.println("Please write no's only");
	    }

	              

	}


	}
