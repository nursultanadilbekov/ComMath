import java.util.Random;

public class Main
{
	public static void main(String[] args) {

		Random random = new Random();

		double a = 10;
		double b = -10;
		double c = a-b;
		double x;
		int i = 0;
		double S = 0;
		do{
			double r = a + (b - a) * random.nextDouble();
			x=r;
			double function = x*x-2;
			S=S+r*function;
			i++;
			if (i==99){
				System.out.println(S/i*c);
			}
		}while(i<100);
	}
}
