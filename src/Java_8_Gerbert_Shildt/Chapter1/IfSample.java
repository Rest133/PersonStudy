package Java_8_Gerbert_Shildt.Chapter1;

public class IfSample {
    public static void main(String args[]) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("X меньше Y");

        x = x * 2;

        if (x == y) System.out.println("Х теперь равен Y");

        x = x * 2;

        if (x > y) System.out.println("X теперь больше Y");

        if (x < y) System.out.println("Вы этого не увидите");

    }
}
