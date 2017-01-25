

public class E43 {

	public static void main(String[] args) {
	
		Exo43(5);
		System.out.print("SnakeEyes : ");
		SnakeEyes();
		
	}
	public static int Exo43(int n){
		if(n < 2 || n > 12){
			throw new IllegalArgumentException("Impossible total for a pair of dice.");
		}
		int d1;
		int d2;
		int i = 0;
		do{
		d1 = (int)(Math.random()*6) + 1;
		d2 = (int)(Math.random()*6) + 1;
		
		i++;
		}
		while((d1 + d2) != n);
		System.out.println(i);
		return i;
		
	}
	public static void SnakeEyes(){
		Exo43(2);
	}
}
