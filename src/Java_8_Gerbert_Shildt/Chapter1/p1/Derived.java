package Java_8_Gerbert_Shildt.Chapter1.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор подкласса");
        System.out.println("n = " + n);

        //Доступно только для подкласса
        //System.out.println("pri_n = " + pri_n);
        System.out.println("pro_n = " + pro_n);
        System.out.println("n_pub = " + n_pub);
    }
}
