package Java_8_Gerbert_Shildt.Chapter1;

public class ForTest {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 10; x/*1*/ = x + 1)// Инкремент - знак плюс, декремент - знак минус
            System.out.println("Значение х: " + x);
    }
}

//*1* - операнд
