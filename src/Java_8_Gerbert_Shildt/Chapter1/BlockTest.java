package Java_8_Gerbert_Shildt.Chapter1;

 class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;
        //адресатом этого оператора цикла служит блок кода
        for (x = 0; x < 10; x++) {
            System.out.println("Значение х:" + x);
            System.out.println("Значение у:" + y);
            y = y - 2;
        }

        //Мой код

        y = 20;

        for (x = 0; x < 3; x++, y--) {
            System.out.println("Значение х и у: " + x + " " + y);
        }

    }
}
