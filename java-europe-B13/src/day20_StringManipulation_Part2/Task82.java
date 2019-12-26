package day20_StringManipulation_Part2;

import java.util.Scanner;

public class Task82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName,password;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter username=");
		String username = scan.nextLine();
		
		System.out.println("Enter password=");
		String password1 = scan.nextLine();
			
		if(username.equals("") && password1.equals(""))
            System.out.println("Username and Passowrd fields cannot be empty");
        
        else if(username.equals("") && !password1.equals(""))
            System.out.println("Username cannot be empty");
        
        else if(!username.equals("")  && password1.equals(""))
            System.out.println("Password cannot be empty");
        
        else {
            System.out.println("User Logged in successfully");
            return;
        }
        
        System.out.println("Username or password is not valid.Please verify");

		}
		
	}

