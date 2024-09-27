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
		int M = 10000;
		do{
			double r = a + (b - a) * random.nextDouble();
			x=r;
			double function = x*x-2;
			S=S+function;
			i++;
		}while(i<M);
		System.out.println(S/i*c);
	}
}
