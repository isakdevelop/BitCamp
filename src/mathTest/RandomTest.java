package mathTest;

public class RandomTest {
    static int returnRandomNumber()    {
        int randomNumber = (int)(Math.random() * 100);
        System.out.printf("랜덤 값 : %d",randomNumber);

        return randomNumber;
    }

    public static void main(String[] args) {
        final int randomNumber =returnRandomNumber();
        System.out.println("리턴된 값 : " + randomNumber);
    }
}
