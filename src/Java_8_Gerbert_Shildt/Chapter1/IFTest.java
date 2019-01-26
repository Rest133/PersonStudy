package Java_8_Gerbert_Shildt.Chapter1;

public class IFTest {
    public static void main(String[] args) {
        FixedStack stack1 = new FixedStack(5);
        FixedStack stack2 = new FixedStack(8);

        for (int i = 0; i < stack1.getLength(); i++) stack1.push(i);
        for (int i = 0; i < stack1.getLength(); i++) stack2.push(i);

        System.out.println("MyStack1");
        for (int i = 0; i < stack1.getLength(); i++) System.out.println("Stack1 element " + i + " = " + stack1.pop());
        for (int i = 0; i < stack2.getLength(); i++) System.out.println("Stack2 element " + i + " = " + stack2.pop());
    }
}
