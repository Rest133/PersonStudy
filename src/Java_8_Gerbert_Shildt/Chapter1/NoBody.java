package Java_8_Gerbert_Shildt.Chapter1;

public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j) {

        }
        System.out.println("Среднее значение равно " + i);
    }
}
/*
Цикл будет проходить около 50 раз

переменной i присваивается значение +1
переменной j присваивается значение -1
дальше они сравниваются и цикл заканчивается когда переменная i равна или больше j

все необходимые действия выполняет само условие
 */

