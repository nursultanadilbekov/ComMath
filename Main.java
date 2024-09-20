public class Main {

    public static void main(String[] args) {

            double decimal = 7.6;
            int limit = 1000;
            int n = 0;
            
            int[] binary = new int[32];
            int[] binary1 = new int[limit];

            int IntDecimal = (int) decimal;
            double decimal1 = decimal - IntDecimal;

            if (IntDecimal == 0) {
                binary[n++] = 0;
            } else{
                while (IntDecimal > 0) {
                    int remainder = IntDecimal % 2;
                    if(remainder==1){
                        binary[n++]=1;
                    }
                    else{
                        binary[n++] = 0;
                    }
                    IntDecimal = IntDecimal / 2;
                }
            }

            for(int i = n-1; i>=0; i--) {
                System.out.print(binary[i]);
            }

            if(decimal1!=0){
                System.out.print(".");
            }
            n=0;
            if(decimal1>0){
                while (decimal1 > 0 && n < limit) {
                    decimal1 *= 2;
                    if (decimal1 >= 1) {
                        binary1[n++] = 1;
                        decimal1 -= 1;
                    } else {
                        binary1[n++] = 0;
                    }
                }
            }
            for(int i = 0; i<n; i++){
                System.out.print(binary1[i]);
            }
    }
}
