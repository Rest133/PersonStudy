package Java_8_Gerbert_Shildt.Chapter1;

class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y;
        void display() {
            System.out.println("Вывод: outer_x = " + outer_x);
        }
    }
    /*
    void showy(){
        System.out.println(y); //переменная у недоступна
    }
    */

}

class InnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
