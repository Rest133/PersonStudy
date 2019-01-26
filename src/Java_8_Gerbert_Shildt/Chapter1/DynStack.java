package Java_8_Gerbert_Shildt.Chapter1;

public class DynStack implements IntStack {
    private int stack[];
    private int tos;

    DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int element) {
        if (tos == stack.length - 1) {
            int temp[] = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++) temp[i] = stack[i];
            stack = temp;
            stack[++tos] = element;
        } else stack[++tos] = element;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек пуст");
            return 0;
        } else
            return stack[tos--];
    }

    public int getSize() {
        return stack.length;
    }
}
