package Java_8_Gerbert_Shildt;

public class Constr_This {
    int i, j;

    public Constr_This(int a, int b) {
        i = a;
        j = b;
    }

    public Constr_This(int a) {
        this(a, a);
    }

    public static void main(String[] args) {
        Constr_This ct = new Constr_This(5);
    }

}
