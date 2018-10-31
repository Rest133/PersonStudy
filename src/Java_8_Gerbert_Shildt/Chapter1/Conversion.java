package Java_8_Gerbert_Shildt.Chapter1;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\n Преобразование типа int в byte.");
        b = (byte) i;

        System.out.println(" i и b " + i + " " + b);//257%256=1

        System.out.println("\n Преобразование типа double в тип int.");
        i = (int) d;
        System.out.println(" d и i " + d + " " + i);

        System.out.println("\n Преобразование типа double в тип byte.");//323%256=67

        b = (byte) d;

        System.out.println("\n b и d " + b + " " + d);
    }
}
