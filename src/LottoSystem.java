import java.util.Arrays;
import java.util.Scanner;

public class LottoSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Lotto lotto = new Lotto();
        lotto.generateLottoNumbers();

        BuyLotto buyLotto = new BuyLotto(sc);
        LottoMatch matchLotto = new LottoMatch(sc);

        while (true) {
            buyLotto.pickNumbers();
            matchLotto.checkMatch(lotto);
            if (matchLotto.isJackpot()) {
                break;
            }
        }
    }
}

class Lotto {
    protected int[] lottoNumbers;

    public void generateLottoNumbers() {
        lottoNumbers = new int[6];
        for (int i = 0; i < lottoNumbers.length; i++) {


            lottoNumbers[i] = (int) (1 + Math.random() * 46);
            for (int j = 0; j < i; j++) {
                if (lottoNumbers[i] == lottoNumbers[j]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(lottoNumbers);
    }

    public int[] getLottoNumbers() {
        return lottoNumbers;
    }
}

class BuyLotto extends Lotto    {
    public BuyLotto(Scanner sc) {
        lottoNumbers = new int[6];
    }

    public void pickNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("로또 번호 6개를 입력하세요:");
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = sc.nextInt();
        }
        Arrays.sort(lottoNumbers);
    }
}

class LottoMatch extends Lotto  {
    private int[] pickedNumbers;
    private int tries;
    private boolean jackpot;

    public LottoMatch(Scanner sc) {
        pickedNumbers = new int[6];
        tries = 0;
        jackpot = false;
    }
    public void checkMatch(Lotto lotto) {
        int cnt = 0;
        int[] lottoNumbers = lotto.getLottoNumbers();
        int[] jackpotNumbers = new int[6];

        for (int i = 0; i < pickedNumbers.length; i++) {
            for (int j = 0; j < lottoNumbers.length; j++) {
                if (pickedNumbers[i] == lottoNumbers[j]) {
                    jackpotNumbers[cnt++] = pickedNumbers[i];
                }
            }
        }

        tries++;
        System.out.print("맞춘 번호: ");
        for (int i = 0; i < cnt; i++) {
            System.out.print(jackpotNumbers[i] + " ");
        }
        System.out.println("\n맞춘 개수: " + cnt);
        System.out.println("총 시도 횟수: " + tries);
        System.out.println();

        if (cnt == 6) {
            jackpot = true;
            System.out.println("축하합니다! 잭팟에 당첨되셨습니다!");
        }
    }

    public boolean isJackpot() {
        return jackpot;
    }
}
