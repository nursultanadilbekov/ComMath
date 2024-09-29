public class lcd
{
	public static void main(String[] args) {

		double numberOfInterval = 100;
		double a = Math.PI;
		double b = 3*Math.PI/2;
		double c = b-a;
		double x;
		double interval = c/numberOfInterval;
		
		int i = 0;
		double UCD = 0;
		x=a;
		do{
            double function = Math.sin(x);
			UCD += function*interval;
			x += interval;
			i++;
			System.out.println(function);
		}while(i<=numberOfInterval);
		System.out.println(UCD);
	}

}