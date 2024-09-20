import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder binary = new StringBuilder();
        int choice;
        do {
            System.out.println("1. Enter the integer \n2. End the program");
            choice = scanner.nextInt();

            System.out.print("Enter a decimal number: ");
            double decimal = scanner.nextDouble();

            int IntDecimal = (int) decimal;
            double decimal1 = decimal - IntDecimal;

            System.out.println(IntDecimal);
            System.out.println(decimal1);

            if (IntDecimal == 0) {
                binary.append("0");
            } else{
                while (IntDecimal > 0) {
                    int remainder = IntDecimal % 2;
                    if(remainder==1){
                        binary.append("1");
                    }
                    else{
                        binary.append("0");
                    }
                    IntDecimal = IntDecimal / 2;
                }
            }
            binary.reverse();
            if(decimal1>0){
                while (decimal1 > 0) {
                    decimal1 *= 2;
                    if (decimal1 >= 1) {
                        binary.append("1");
                        decimal1 -= 1;
                    } else {
                        binary.append("0");
                    }
                }
            }
            System.out.println(binary);
            binary.setLength(0);
        } while (choice != 2);
    }
}
