package Java_8_Gerbert_Shildt.Chapter1;
public class Switch {
    public static void main(String[] args) {
        int month = 4;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Относятся к зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Относятся к весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Относятся к лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Относятся к осени");
                break;
            default:
                System.out.println("Относятся к несуществующим месяцам");

        }

    }
}
/*
Компилятор будет работать быстрее,т.к. ему необходимо сравнить одинаковые типы данных.(В оперторе switch нельзя использовать разные типы данных, и ежу понятно :D)
 */