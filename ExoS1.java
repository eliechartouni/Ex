import java.util.Scanner;

public class ExoS1 {

	public static void Exo2 (){
		int maxdiv = 1; 
		int numdiv = 1;

		for (int numero = 1; numero <= 10000; numero++){
			int nbdiv = 0 ;
			for (int i=1;i< numero/2 ; i++){
				if(numero % i == 0){
					nbdiv++;
				}
			}
			if (nbdiv > maxdiv){
				maxdiv = nbdiv;
				numdiv = numero;
			}
		}
		System.out.println("le nb ayant le max de div entre 1 et 1000 est: " +numdiv);
		System.out.println("il a: " + maxdiv + "diviseurs");
	}

	public static void Exo3 (){
		double num1 = 0 ;
		double num2=0;
		double res=0;
		String x="";

		System.out.println("Utilisez les operateurs suivants: +, -, * ou /");
		System.out.println("terminer avec 0");
		System.out.println("Votre calcule:");

		Scanner stdin = new Scanner(System.in);

		while(stdin.hasNext()){  	 

			x = stdin.nextLine();

			boolean sum = x.contains("+");
			boolean dif = x.contains("-");
			boolean mult = x.contains("*");
			boolean div = x.contains("/");


			String[] result = x.split ("[-+*/]");

			num1= Double.parseDouble(result[0]);

			if (num1==0){
				System.out.println("Au revoir !");
				stdin.close();
				break;
			}

			num2= Double.parseDouble(result[1]);

			if (sum){  
				res = num1 + num2;
			} 
			else if (dif){
				res = num1 - num2;
			}
			else if (div) {
				if (num2==0){ System.out.println("Vous ne pouvez pas faire une division par 0");}
				else{
					res = num1 / num2;}
			}
			else if(mult){
				res = num1 * num2;
			}
			else{
				System.out.println("Utilisez les operateurs suivants: +, -, * ou /");
			}

			System.out.println("Votre resultat: " + res);
		}


	}


	public static void Exo4 (){

		String phrase="";
		char car;

		System.out.println("Saisissez votre phrase (pour sortir saississez 0) : ");

		Scanner stdin = new Scanner(System.in);

		phrase = stdin.nextLine();

		for ( int i = 0;  i < phrase.length();  i++ ) {
			car = phrase.charAt(i);
			if ( Character.isLetter(car) ||  car =='\'') {
				System.out.print(car);
			}
			else {
				if ( car==' ') {
					System.out.println();
				}
			}


		}

		stdin.close();

	}


	public static void Exo6 (){
		int maxdiv = 1; 
		int numdiv = 1;

		int[] div= new int[10001];
		for (int numero = 1; numero <= 10000; numero++){
			int nbdiv = 0 ;
			for (int i=1;i< numero/2 ; i++){
				if(numero % i == 0){
					nbdiv++;
				}
			}
			div[numero]=nbdiv;
		}

		for (int k=1; k< div.length ; k++){
			if (div[k] > maxdiv){
				maxdiv = div[k];
			}
		}

		System.out.println("le max de div entre 1 et 1000 est: " +maxdiv);

		for (int k=1; k< div.length ; k++){
			if (div[k] == maxdiv){
				numdiv = k;
				System.out.println("les div sont: " + numdiv);
			}
		}
	}


	public static void main(String[] args){
		Exo4();
	}
}
