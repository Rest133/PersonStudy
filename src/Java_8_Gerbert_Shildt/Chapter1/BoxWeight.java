package Java_8_Gerbert_Shildt.Chapter1;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
     /*   width = w;
        height = h;
        depth = d;
        weight = m;
        */
        super(w, h, d);
        weight = m;

    }

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(5, 10, 8, 4.8);
        double vol;

        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myBox2.weight);
        System.out.println();

    }
}
