package Java_8_Gerbert_Shildt.Chapter1;

public class NativeTest {
    int i;

    public static void main(String[] args) {
        NativeTest nt = new NativeTest();

        nt.i = 10;
        System.out.println("Содержимое переменной nt.i до метода тест nt.i= " + nt.i);
        nt.test();
        System.out.println("Содержимое переменной nt.i после метода тест nt.i= " + nt.i);
    }
    public native void test(); // объявление платформенно-ориентированного метода
    static {
        System.loadLibrary("NativeTest");
    }
}
