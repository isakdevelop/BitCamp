package strategy;

import java.util.Scanner;

enum Day {
    MONDAY {
        @Override
        public String thisDay(String day) {
            return "월요일";
        }
    },
    TUESDAY {
        @Override
        public String thisDay(String day) {
            return "화요일";
        }
    },
    WEDNESDAY {
        @Override
        public String thisDay(String day) {
            return "수요일";
        }
    },
    THURSDAY {
        @Override
        public String thisDay(String day) {
            return "목요일";
        }
    },
    FRIDAY {
        @Override
        public String thisDay(String day) {
            return "금요일";
        }
    },
    SATURDAY {
        @Override
        public String thisDay(String day) {
            return "토요일";
        }
    },
    SUNDAY {
        @Override
        public String thisDay(String day) {
            return "일요일";
        }
    };

    public abstract String thisDay(String day);
}
public class Week {
    public static String sayMayDay(Day day) {
        return day.thisDay(String.valueOf(day));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("날짜 입력 : ");
        System.out.println(
                sayMayDay(
                        Day.valueOf(sc.next())
                )
        );
    }
}
