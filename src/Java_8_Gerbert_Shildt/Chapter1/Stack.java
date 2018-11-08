package Java_8_Gerbert_Shildt.Chapter1;

class Stack {
    int stck[] = new int[10];
    int tos;

    //Инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    //Добавить элемент в стек
    void push(int item) {
        if (tos == 9) System.out.println("Стек заполнен.");
        else stck[++tos] = item;
    }

    //Извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else return stck[tos--];
    }
}
