package Java_8_Gerbert_Shildt.Chapter1;

public class FixedStack implements IntStack {
    private int stack[];
    private int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int element) {
        if (tos == stack.length - 1) {
            System.out.println("Стек полон");
        } else stack[++tos] = element;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else return stack[tos--];
    }

    public int getLength() {
        return stack.length;
    }
}
