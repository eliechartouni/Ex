package eliechartouni;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exo77 {

	public static void main(String[] args) {
		read();
	}

	private static void read() {
		ArrayList<String> list = new ArrayList<String>();
		String fil="";

		try {
			System.out.print("Enter the file name with extension : ");

			Scanner input = new Scanner(System.in);

			File file = new File(input.nextLine());

			input = new Scanner(file);

			System.out.print("Enter the file name to save : ");
			Scanner output = new Scanner(System.in);
			fil = output.nextLine();
			if ( fil.equals("")){
				fil ="";}
			
			System.out.println(fil);

			while (input.hasNextLine()) {
				String line = input.nextLine();

				//System.out.println(line);
				for (String retval: line.split(" ")) {
					String mot ="";
					for (int i=0; i< retval.length();i++){
						if (Character.isLetter(retval.charAt(i))) {
							mot = mot+ Character.toString(retval.charAt(i));
						}
					}	
					if(! list.contains(mot)){
						list.add(mot);
					}

				}

			}

			list.sort(String::compareToIgnoreCase);


			if (fil!= ""){
				FileWriter wr = new FileWriter(fil.trim().toString());

				for ( int i = 0;  i < list.size();  i++ ) {
					String tr = list.get(i).toLowerCase();
					if (tr != "") {
						wr.write(tr);
						wr.write("\r\n");
					}
				}  

				wr.close();
				}

			else {
				for ( int i = 0;  i < list.size();  i++ ) {
					String tr = list.get(i).toLowerCase();
					if (tr != "") {
						System.out.println(tr);
					}
				}  
			}
			
			input.close(); 
			output.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
