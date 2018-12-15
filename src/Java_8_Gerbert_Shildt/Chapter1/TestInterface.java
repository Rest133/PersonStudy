package Java_8_Gerbert_Shildt.Chapter1;

public class TestInterface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
