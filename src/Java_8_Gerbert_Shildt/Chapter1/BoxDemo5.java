package Java_8_Gerbert_Shildt.Chapter1;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double volume;

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        volume = myBox1.volume();
        System.out.println(volume);
        volume = myBox2.volume();
        System.out.println(volume);
    }
}
