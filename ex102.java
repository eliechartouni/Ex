package eliechartouni;
import java.util.Scanner;
import java.util.TreeSet;

public class ex102 {


	@SuppressWarnings("resource")
	private static void calcul() {
		System.out.println("Enter set computations (press return to end):");
		String x="";
		TreeSet<Integer> setA = new TreeSet<Integer>();
		TreeSet<Integer> setB = new TreeSet<Integer>();
		boolean found = false;
		String var ="";
		boolean sum = false;
		boolean mult = false;


		Scanner stdin = new Scanner( System.in );

		while(stdin.hasNext()){
			var = "";
			x = stdin.nextLine();

			if (!x.contains("*") && !x.contains("+") && !x.contains("-") ){
				throw new IllegalArgumentException("Expected *, +, or  - after first set.");
			}	

			else if (x.equals("\n")) {
				System.out.println("BYE");
				stdin.close();
				break;

			}
			else { 

				sum = x.contains("+");
				mult = x.contains("*");

				String[] result = x.split ("[-+*]");

				String A = result[0];
				String B = result[1];
								
				for ( int i = 0;  i < A.length();  i++ ) {

					if (Character.isDigit(A.charAt(i))){
						if (found = true){
							var = var + Character.toString(A.charAt(i));
							found = true;
						}
						else {
							var = Character.toString(A.charAt(i));	
							found = true;
						}
					} 
					else if (A.charAt(i) == ',' || A.charAt(i) == ']'){
						if (var != "") {
							setA.add(Integer.parseInt(var));
							found=false;
							var ="";
						}	
					}

					else if (A.charAt(i) == '[' || A.charAt(i) == ' '){
						found=false;
					}

					else {
						found=false;
						throw new IllegalArgumentException("Input error A");
					}

					System.out.println(A.charAt(i));

				}
				
				System.out.println("A" + setA);

				found = false;
				var = "";
				
				for ( int i = 0;  i < B.length();  i++ ) {

					if (Character.isDigit(B.charAt(i))){
						if (found = true){
							var = var + Character.toString(B.charAt(i));
							found = true;
						}
						else {
							var = Character.toString(B.charAt(i));	
							found = true;
						}
					} 
					else if (B.charAt(i) == ',' || B.charAt(i) == ']'){
						if (var != "") {
							setB.add(Integer.parseInt(var));
							found=false;
							var ="";
						}	
					}

					else if (B.charAt(i) == '[' || B.charAt(i) == ' '){
						found=false;
					}

					else {
						found=false;
						throw new IllegalArgumentException("Input error B");
					}

				}
				System.out.println("B" + setB);
				
				if (sum==true)
					setA.addAll(setB);     // Union.
				else if (mult == true )
					setA.retainAll(setB);  // Intersection.
				else
					setA.removeAll(setB);  // Set difference.

				System.out.print("Value:  " + setA);

			}

		}
		
		stdin.close();

	}
	public static void main(String[] args) {

		try {
			calcul(); 
		}
		catch (IllegalArgumentException e) {

			System.out.println("Error in input: " + e.getMessage());
		}
	}
}