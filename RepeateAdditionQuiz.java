//U10416031

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;



public class RepeateAdditionQuiz{
	

	public static void main(String[] args){
		
		ArrayList<Integer> list = new ArrayList<>();
		
//create a random object
		Random ran = new Random();
		int a = ran.nextInt(10)+1;
		int b = ran.nextInt(10)+1;
		
		System.out.println("What is "+ a +"+"+ b +"?");
		
//prompt the user to enter a number
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		

//display the result		
		while(a+b != answer){
	
			int i;
			for(i = 0;i < list.size()-1; i++){
				//if user already entered the number before
				if(list.get(i) == answer){
					System.out.println("You already entered " + answer);
					break;
				}
			}
			
			System.out.print("Wrong answer. Try again. What is " 
					+ a + " + " + b + "? ");
			// Add number to the list
			list.add(answer);
			
			answer = input.nextInt();
			// Add number to the list
			list.add(answer);
		}
		
		System.out.println("You got it!");
		
		
			
	}
}
