package assignment6; // Package is compulsory.
/*
 * Program to declare array program to find even numbers
 */
import java.util.Scanner; // Importing the Scanner class to take input from user.
public class Assignment6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; 
        Scanner s = new Scanner(System.in); // Using Scanner Class s  to take input frm user
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) // for loop to iterate the process 
        {
            a[i] = s.nextInt(); // taking the input given by the user into array
        }
        
        System.out.print("Even numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 0) // Condition for generating even numbers
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
