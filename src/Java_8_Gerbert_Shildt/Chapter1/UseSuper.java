package Java_8_Gerbert_Shildt.Chapter1;

class A {
    int i;
}

class B extends A {
    int i;//эта переменная i скрывает переменную i из суперкласса(Класса-родителя) А

    B(int a, int b) {
        super.i = a;// i из А
        i = b;// i из B
    }

    void show() {
        System.out.println("Член i в суперклассе А: " + super.i);
        System.out.println("Член i в подклассе B: " + i);
    }

}

public class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
