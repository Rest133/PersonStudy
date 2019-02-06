package Java_8_Gerbert_Shildt.Chapter1;

public class Exc2 {
    public static void main(String[] args) {

        try {
            int d = 0;
            int a = 10 / d;
            System.out.println("You can't see this :) ");
        }catch (ArithmeticException exc){
            System.out.println("Деление на ноль.");
        }
        System.out.println("Код дальше");

    }
}
