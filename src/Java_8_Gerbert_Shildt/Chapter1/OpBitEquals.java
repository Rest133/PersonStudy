package Java_8_Gerbert_Shildt.Chapter1;

public class OpBitEquals {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int c = 3;

        a |= 4;
        System.out.println("a = " + a);
        b >>= 1;
        c <<= 1;
        a ^= c;// дает 0 при одинаковых сигналах(0и0,1и1)

        System.out.println("c = " + c);

        System.out.println("a = " + a);

    }
}
