package Java_8_Gerbert_Shildt.Chapter1;

public class Exc0 {
    public static void main(String[] args) {
        int d = 0;
        int r = 42;
        System.out.println(r/d);//при попытке деления на ноль создается исключение,а затем оно генерируется, процесс метода прерывается так как исключение должно быть "перехвачено" и неотложно обработано
    }// в данном случае обработчик стандартный (т.к. он не указан в методе), если вдруг будет что-то необработано программистом, это будет обработано стандартным обработчиком java
}

///слева путь до метода; в скобочках название файла и строчка