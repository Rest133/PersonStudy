package Java_8_Gerbert_Shildt.Chapter1;

 class DoWhile {
    public static void main(String[] args) {
        int n = 3;
        do {
            System.out.println("Такт " + n);
        } while (--n > 0);
    }
}
/*
Выполняя операцию декремента --n,уменьшая значение переменной n на 1 и возвращая новое значение переменной n, идет сравнение
с нулем.Если полученное значение n больше, то цикл продолжается
 */