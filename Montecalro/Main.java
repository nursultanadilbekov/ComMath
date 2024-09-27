import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int a = 10;
		int b = -10;
		int c = a-b;
		double x;
		int i = 0;
		double Sum = 0;
		do{
			double r = random.nextInt(b - a + 1) + a;
			x=r;
			double function = x-2;
			Sum=Sum+r*function;
			i++;
			if (i==99){
				System.out.println(Sum/i*c);
			}
		}while(i<100);
	}
}