package test;

import java.io.FileWriter;
import java.util.Scanner;


public class re {
	public static void main(String[] args) {
		write();
	}

	private static void write() {
		try{
			String Tabl[] = {"Last Name", "First Name","Title","Year"};
			String tr = "";
			
			Scanner input = new Scanner(System.in);
			
			while(input.hasNext()){
				for ( int i = 0; i < Tabl.length; i++ ) {
					
					System.out.print("Enter" + Tabl[i] + " :");
					
					if (tr != null){
					tr = tr + ";"+ input.nextLine();
					}
					else {tr = input.nextLine();}
				}
			}
		
		String fil = "/users/charel16/workspace-mars-2015/Library_Books";
		FileWriter wr = new FileWriter(fil.trim().toString());
		wr.write(tr);
		wr.close();
		input.close();
	}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
