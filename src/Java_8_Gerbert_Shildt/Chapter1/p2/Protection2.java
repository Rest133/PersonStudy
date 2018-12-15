package Java_8_Gerbert_Shildt.Chapter1.p2;

public class Protection2 extends Java_8_Gerbert_Shildt.Chapter1.p1.Protection {
    Protection2() {
        System.out.println("Конструктор,унаследованный из другого пакета");

        //доступно только для данного класса или пакета
        //System.out.println("n = " + n);

        //доступно только для данного класса
        //System.out.println("pri_n = " + pri_n);

        System.out.println("pro_n = " + pro_n);
        System.out.println("n_pub = " + n_pub);
    }
}
