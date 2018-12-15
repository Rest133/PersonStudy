package Java_8_Gerbert_Shildt.Chapter1.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор этого же пакета");
        System.out.println("n = " + p.n);

        //доступно только для класса
        //System.out.println("pri_n = " + p.pri_n)
        System.out.println("pro_n = " + p.pro_n);
        System.out.println("n_pub = " + p.n_pub);
    }
}
