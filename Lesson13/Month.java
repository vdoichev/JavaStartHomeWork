package Lesson13;

public class Month {

    static void getCountDaysForMonth(byte numberMonth){
        switch (numberMonth){
            case 2: {
                System.out.println("Количество дней в месяце 28");
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("Количество дней в месяце 31");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.println("Количество дней в месяце 30");
                break;
            }
            default:
                System.out.println("Такой месяц отсутствует в календаре");
        }
    }

    public static void main(String[] args) {
        byte i = 7;
        getCountDaysForMonth(i);
    }
}
