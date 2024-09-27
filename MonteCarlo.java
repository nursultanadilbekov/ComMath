import java.util.Random;

public class Main
{
	public static void main(String[] args) {

		Random random = new Random();

		double a = Math.PI*3/2;
		double b = Math.PI;
		double c = a-b;
		double x;
		int i = 0;
		double Sum = 0;
		int M = 100000000;
		do{
			double r = a + (b - a) * random.nextDouble();
			x=r;
			double function = Math.sin(x);
			Sum=Sum+function;
			i++;
		}while(i<M);
		System.out.println(Sum/i*c);
	}
}
