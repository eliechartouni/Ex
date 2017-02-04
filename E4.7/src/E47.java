import java.util.Scanner;

public class E47 {
	static int premiernb[] = new int[10];
	static int deuxiemenb[] = new int[10];
	static int resultat[] = new int[10];
	public static void main(String[] args) {

		CreateQuiz();
		Result();
		Score();
	}

	public static void CreateQuiz(){
		System.out.println("Welcome to Addition Quiz !");

		for(int i=0;i<10;i++){
			premiernb[i] = (int)(Math.random()*50) + 1;
			deuxiemenb[i] = (int)(Math.random()*50) + 1;
		}
	}
	public static void Result(){

		Scanner stdin = new Scanner( System.in );

		for(int i = 0;i<10; i++){
			int k=1;
			while (k==1){
				try{

					System.out.println("Question "+ (i+1) +" : What is "+premiernb[i]+" + "+deuxiemenb[i]+" ?");
					stdin = new Scanner( System.in );
					resultat[i] = stdin.nextInt();
					k=0;
				}
				catch(Exception e){
					System.out.println("La valeur saisie n'est pas un entier. Veuillez saisir une valeur entiere");

				}

			}
		}
		stdin.close();

	}

	public static void Score(){
		int count =0;
		for(int i = 0;i<10; i++){
			int res = premiernb[i]+ deuxiemenb[i];
			System.out.print("Question "+ (i+1) +": "+premiernb[i]+" + "+deuxiemenb[i]+" = "+resultat[i]+" ");
			if(res == resultat[i]){
				count++;
				System.out.println("Your answer is right");
			}
			else{
				System.out.println("Your answer is false. The right answer was :"+res);
			}	
		}
		System.out.println("You have "+count+" answers right.");
		System.out.println("Your score is : "+count*10+" points.");
	}
}
