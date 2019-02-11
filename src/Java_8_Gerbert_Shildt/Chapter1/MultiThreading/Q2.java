package Java_8_Gerbert_Shildt.Chapter1.MultiThreading;

class Q2 {
    int n;
    boolean valueSet = true;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Прервано и исключение перехвачено");
            }
        }
        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение перехвачено");
            }
            this.n = n;
            valueSet = true;
            System.out.println("Отправлено: " + n);
            notify();
        }
    }
}

class Producer2 implements Runnable {
    Q2 q;

    public Producer2(Q2 q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer2 implements Runnable {
    Q2 q;

    public Consumer2(Q2 q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

class PC2 {
    public static void main(String[] args) {
        Q2 q = new Q2();
        new Producer2(q);
        new Consumer2(q);
        System.out.println("Для остановки ты знаешь,что делать :D");
    }
}