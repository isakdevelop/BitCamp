import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] lottoNumbers = new int [6];
        int [] inputNumbers = new int [6];
        int [] jackpot;

        int tries = 0;


        for (int i = 0; i < lottoNumbers.length; i++)    {
            lottoNumbers[i] = (int) (1 + Math.random() * 46);
            for (int j = 0; j < i; j++)   {
                if (lottoNumbers[i] == lottoNumbers[j]) {
                    i--;
                }
            }
        }


        Arrays.sort(lottoNumbers);
//        for (int i = 0; i < lottoNumbers.length; i++)   {
//            for (int j = 0; j < lottoNumbers.length; j++)   {
//                if (lottoNumbers[i] < lottoNumbers[j])  {
//                    int temp = lottoNumbers[i];
//                    lottoNumbers[i] = lottoNumbers[j];
//                    lottoNumbers[j] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < lottoNumbers.length; i++)   {
//            System.out.print(lottoNumbers[i] + " ");
//        }
//
//        System.out.println();


        int cnt = 0;

        while (true) {
            System.out.println("로또가 생성되었습니다.");
            System.out.println("6개의 로또 번호를 공백으로 입력해 주세요.");

            for (int i = 0; i < inputNumbers.length; i++)   {
                inputNumbers[i] = sc.nextInt();
            }

            Arrays.sort(inputNumbers);

            cnt = 0;

            jackpot = new int[6];

            for (int i = 0; i < lottoNumbers.length; i++)   {
                for (int j = 0; j < inputNumbers.length; j++)   {
                    if (lottoNumbers[i] == inputNumbers[j]) {
                        jackpot[i] = lottoNumbers[i];
                        cnt++;
                    }
                }
            }

            tries++;

            for (int i = 0; i < jackpot.length; i++) {
                if (jackpot[i] != 0) {
                    System.out.print(jackpot[i] + " ");
                }
            }
            System.out.println();
            System.out.println(cnt + "개 맞추셨습니다!");
            System.out.println("총 " + tries + "번 시행하셨습니다.");
            System.out.println();

            if (cnt == 6)
                break;
        }
    }
}
