package Java_8_Gerbert_Shildt.Chapter1.MultiThreading;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();// получение ссылки на главный поток
        System.out.println("Текущий поток исполнения: " + t);
        //изменить имя потока исполнения
        t.setName("Current thread");
        System.out.println("Имя потока после изменения: " + t);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
