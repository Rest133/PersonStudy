package Java_8_Gerbert_Shildt.Chapter1.MultiThreading;

public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        //создаем новый поток, второй поток исполнения
        t = new Thread(this, "Демо-поток");
        System.out.println("Дочерний поток создан: " + t);
        t.start();//запуск потока исполнения
    }

    //Точка входа во второй поток исполнения
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Работа потока прервана");
        }
        System.out.println("Дочерний поток завершен");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();//Создание нового потока
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Работа основного потока прервана");
        }
        System.out.println("Главный поток завершен");

    }
}