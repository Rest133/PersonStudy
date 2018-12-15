package Java_8_Gerbert_Shildt.Chapter1;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Еще один вариант реализации метода callback()");
        System.out.println("р в квадрате равно: " + p * p);
    }
}
