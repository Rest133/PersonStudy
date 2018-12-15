package Java_8_Gerbert_Shildt.Chapter1.p1;

public class Protection {
    int n = 1;
    private int pri_n = 2;
    protected int pro_n = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("Конструктор базового класса");
        System.out.println("n = " + n);
        System.out.println("pri_n = " + pri_n);
        System.out.println("pro_n = " + pro_n);
        System.out.println("n_pub = " + n_pub);
    }
}
