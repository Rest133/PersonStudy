package Java_8_Gerbert_Shildt.Chapter1.MultiThreading;

public class CallMe {
    void call(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван(метод call)");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {    //Не работает
    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe targ, String message) {
        target = targ;
        msg = message;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}

class Synchronized1 {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target, "в синхронизированный");
        Caller ob3 = new Caller(target, "мир!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Потока прерван");
        }
    }
}
