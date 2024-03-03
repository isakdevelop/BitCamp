package LottoSystem;

import java.util.Random;
import java.util.Scanner;

    /*
     로또 발급은 1 - 8 까지 중복없는 숫자 6개이다. 하나는 구매한 로또이다.
     추가 로직은 추첨된 로또이다.
     두 로또의 일치여부에 따라
     다음과 같은 메시지를 출력한다.
     단 구매로또 번화와 추첨 로또 번호 모두 같이 출력한다.

     1등 - 6개 맞춤
     2등 - 5개 맞춤
     3등 - 4개 맞춤
     4등 - 3개 맞춤
     꽝 - 2개 이하
     */

public class LottoMatching {
    public static void main(String[] args) {
        // 1 ~ 45 범위 내의 서로 겹치지 않는 숫자 6개를 생성
        int[] arr = new int[6];
        int[] checkLottoNumber = new int[6];
        // 중복되지 않은 상태
        arr = createArrayWithoutDuplicates(arr);
        // 오름차순 정렬
        arr = sortAscending(arr);

        checkLottoNumber = createArrayWithoutDuplicates(checkLottoNumber);
        checkLottoNumber = sortAscending(checkLottoNumber);

        // 출력
        System.out.println("정답 로또 번호");
        printLotto(arr);
        System.out.println();
        System.out.println("사용자 로또 번호");
        printLotto(checkLottoNumber);

        System.out.println();
        int number = numberMatchResults(arr, checkLottoNumber);
        String result = AnnouncementOfResults(number);

        System.out.println(result);
    }

    private static void printLotto(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d \t", arr[i]);
        }
    }

    private static int[] sortAscending(int[] arr) {
        // 버블 정렬이 들어갈 부분
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] createArrayWithoutDuplicates(int[] arr) {
        for (int i = 0; i < 6; i++) {
            int randomNumber = createRandomNumber(1, 8);
            boolean check = false;
            for (int j = 0; j < 6; j++) {
                if (arr[j] == randomNumber) {
                    // 중복되면  check 를 true 로 바꿔라..
                    check = true;
                }
            }
            if (check == false) {
                arr[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
            } else {
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
            }

        }
        return arr;
    }

    private static int createRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end) + start;
    }

    private static int numberMatchResults(int[] arr1, int[] arr2)   {
        int cnt = 0;
        for (int i = 0; i < arr1.length; i++)   {
            for (int j = 0; j < arr2.length; j++)   {
                if (arr1[i] == arr2[j])   {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    private static String AnnouncementOfResults(int numberMatchResults) {
        String message = "";
        switch (numberMatchResults) {
            case 0, 1, 2:
                message = "꽝 - 2개 이하";
                break;
            case 3:
                message = "4등 - 3개 맞춤";
                break;
            case 4:
                message = "3등 - 4개 맞춤";
                break;
            case 5:
                message = "2등 - 5개 맞춤";
                break;
            case 6:
                message = "1등 - 6개 맞춤";
                break;
            default:
                message = "잘못된 입력값";
        }

        return message;
    }


}
