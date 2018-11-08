package Java_8_Gerbert_Shildt.Chapter1;

 class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }
}
/*
Если значение четное,то есть переход на новую строку
 */