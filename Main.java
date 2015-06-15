package main;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
	
	

	public static void main(String[] args) throws IOException, ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String current = new java.io.File( "database.txt" ).getCanonicalPath();
		String currentDir = System.getProperty("user.dir");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Interfaces interfacesObj = new recordImp();
		interfacesObj.loadData(current);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your selection for search !!!");
		System.out.println("1-) Find By Name");
		System.out.println("2-) Find By Department");
		System.out.println("3-) Find By Telephone Number");
		System.out.println("4-) Find By End Date");
		System.out.println("5-) Exit");
		//String selection = scanner.nextLine();
		int selection = scanner.nextInt();
		
		while(selection != 5){
		
		
			if(selection == 1){
				System.out.println("Enter First Name : ");
				String firstname = scanner.next();
				System.out.println("Enter Last Name : ");
				String lastname = scanner.next();
				interfacesObj.findByName(firstname,lastname);
				
			}
			else if(selection == 2){
				System.out.println("Enter Department Name : ");
				String department = scanner.next();
				interfacesObj.findByDepartment(department);
			}
			else if(selection == 3){
				System.out.println("Enter Telephone Number : ");
				String telNumber = scanner.next();
				interfacesObj.findByTelephoneNumber(telNumber);
			}
			else if(selection == 4){
				System.out.println("Enter Interval Start Date : ");
				//String intervalStartDate = scanner.next();
				String tmp1 = scanner.next();
				Date intervalStartDate = formatter.parse(tmp1);
				System.out.println("Enter Interval End Date : ");
				String tmp2 = scanner.next();
				Date intervalEndDate = formatter.parse(tmp2);
				interfacesObj.findByEndDate(intervalStartDate, intervalEndDate);
			}
			else if(selection == 5){
				System.exit(0);
			}
			
			System.out.println("Enter your selection for search !!!");
			System.out.println("1-) Find By Name");
			System.out.println("2-) Find By Department");
			System.out.println("3-) Find By Telephone Number");
			System.out.println("4-) Find By End Date");
			System.out.println("5-) Exit");
			selection = scanner.nextInt();
		
		}
		
	}

}
