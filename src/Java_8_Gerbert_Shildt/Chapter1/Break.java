package Java_8_Gerbert_Shildt.Chapter1;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("До оператора break");
                    if (t) break second;//выход из блока second
                    System.out.println("Это не выполниться");
                }
                System.out.println("Это тоже не выполниться");
            }
            System.out.println("Этот оператор следует за блоком second");
        }
        System.out.println("Этот оператор вне блоков");
    }
}
/*
Одним из наиболее распространенных применений оператора b r e a k с меткой служит выход из вложенных циклов
 */