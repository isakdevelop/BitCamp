import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 1; i < 10; i++)    {
            System.out.println(input + " * " + i + " = " + (input * i));
        }

        /*
        public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
    }
        */
    }
}
