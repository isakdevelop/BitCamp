package kaupTest;

public class KaupMain {
    //카우프 지수 구하는 프로그램을 작성해 주세요
    static double returnHeight()   {
        double height = (Math.random() * 1000);

        while(true) {
            if (height < 150 || height > 200)   {
                height = (Math.random() * 1000);
            } else {
                break;
            }
        }

        height = Math.round(height * 10) / 10.0;

        return height;
    }

    static double returnWeight() {
       double weight = (Math.random() * 100);

       while (true) {
           if (weight < 30 || weight > 99) {
               weight = (Math.random() * 100);
           } else {
               break;
           }
       }
       weight = Math.round(weight * 10) / 10.0;

       return weight;
    }

    static double BMI(double height, double weight) {
        double bmi = weight / ((height / 100) * (height / 100));

        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);

        bmi = Math.round(bmi * 10) / 10.0;

        return bmi;
    }

    public static void main(String[] args) {
        System.out.println(BMI(returnHeight(),returnWeight()));
    }
}
