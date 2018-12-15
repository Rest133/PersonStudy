package Java_8_Gerbert_Shildt.Chapter1;

public class Client implements Callback {
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением: " + p);
    }

    void nonInterfaceMethod() {
        System.out.println("В классах,реализующих интерфейсы, могут определяться и другие члены.");
    }
}
