package Java_8_Gerbert_Shildt.Chapter1.p2;

public class OtherPackage {
    OtherPackage() {
        Java_8_Gerbert_Shildt.Chapter1.p1.Protection p = new Java_8_Gerbert_Shildt.Chapter1.p1.Protection();
        System.out.println("конструктор из другого пакета");

        //доступно только для данного класса или пакета
        //System.out.println("n = " + p.n);

        //доступно только для данного класса
        //System.out.println("pri_n = " + p.pri_n);

        //доступно только для данного класса, подкласса или пакета
        //System.out.println("pro_n = " + p.pro_n);

        System.out.println("n_pub = " + p.n_pub);
    }
}
