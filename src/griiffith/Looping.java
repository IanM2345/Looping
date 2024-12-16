package griiffith;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
    	/*Scanner input = new Scanner(System.in);
    	System.out.println("Enter number");
    	int num = input.nextInt();
    	
    	if (num<0) {
    		System.out.println("Please enter a non-negative number");
    	}
    	else {
    		for (int i= num ; i>=0; i --) {
    			System.out.println(i);
    		}
    	}*/
    	Scanner scanner= new Scanner(System.in);
    	System.out.println("Enter frst 2 numbers");
    	int first = scanner.nextInt();
    	int second = scanner.nextInt();
    	int n=10;
    	
    	
    	for (int x = 2; x<n; x++) {
    		int next = first + second;
    		System.out.print(next + "");
    		
    		first = second;
    		second = next;
    	}
    	
   
    	
    	
    	
    }
}
