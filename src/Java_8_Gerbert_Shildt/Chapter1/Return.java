package Java_8_Gerbert_Shildt.Chapter1;

class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Это строка появится");
        if (t) return;
        System.out.println("Это не появится");
    }
}

/*
оператор return может быть использован в любом месте метода и нужен для возврата управления тому объекту, который вызвал данный метод
Он немедленно прекращает выполнение метода, в теле которого он находится

Здесь опертор return приводит к возврату управления исполняющей системе Java,поскольку именно она вызывает метод main()
 */
