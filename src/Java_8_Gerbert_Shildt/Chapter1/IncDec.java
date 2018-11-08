package Java_8_Gerbert_Shildt.Chapter1;

class IncDec {
    public static void main(String[] args) {
        int a = 1, b = 2, c, d;
        c = ++b;
        d = a++; //к А прибавляем 1
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
