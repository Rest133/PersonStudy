package Java_8_Gerbert_Shildt.Chapter1;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        for (int i = 0; i < 10; i++) {
            System.out.println("Содержимое стека 1:" + mystack1.pop());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Содержимое стека 2:" + mystack2.pop());
        }


    }
}
