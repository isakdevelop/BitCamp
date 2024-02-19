import java.util.Scanner;

public class ExamAvg {
    static int numberOfClasses(Scanner sc) {
        System.out.println("시험에 응시하는 반은 총 몇 개의 반인가요?");

        return sc.nextInt();
    }

    static int numberOfStudents(Scanner sc, int numberOfClasses) {
        for (int i = 1; i <= numberOfClasses; i++)  {
            System.out.println(i + "반에서 시험에 응시한 학생 수는 몇 명 입니까?");
            int numberOfStudents = sc.nextInt();
        }

        return 1;
    }

    static int getMax(int[] arr)    {
        int max = 0;

        for (int i = 0; i < arr.length; i++)    {
            if(max < arr[i])
                max = arr[i];
        }

        return max;
    }

    static int getSum(int[] arr)    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);

            System.out.print("1반 " + (i + 1) + "번째 학생의 점수 : ");
            System.out.println(arr[i]);

            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("다음 시험에서 두 개 반의 평균 점수를 구하시오");
        //System.out.println("시험에 응시한 학생 수는 몇 명 입니까? : ");

        int numberOfClasses = numberOfClasses(sc);

        for (int i = 1; i <= numberOfClasses; i++)  {
            System.out.println(i + "반에서 시험에 응시한 학생 수는 몇 명 입니까?");
            int numberOfStudents = sc.nextInt();
        }

        System.out.println("1반에서 시험에 응시한 학생 수는 몇 명입니까?");
        int numberOfStudent = sc.nextInt();

        System.out.println("2반에서 시험에 응시한 학생 수는 몇 명입니까?");
        int numberOfStudent2 = sc.nextInt();

        int[] scores = new int[numberOfStudent];
        int[] scores2 = new int[numberOfStudent2];

        double avg = ((double)getSum(scores) / numberOfStudent), avg2 = ((double)getSum(scores2) / numberOfStudent2);

        System.out.println("1반의 평균 점수 : " + Math.round(avg) + "점 이고, 최대 점수는 " + getMax(scores) + "점 이다.");
        System.out.println("2반의 평균 점수 : " + Math.round(avg2) + "점 이고, 최대 점수는 " + getMax(scores2) + "점 이다.");
    }
}
