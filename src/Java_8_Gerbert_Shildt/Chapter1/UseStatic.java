package Java_8_Gerbert_Shildt.Chapter1;

class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Статический блок инициализирован");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }

}

/*
Член класса объявленный как static доступен до создания любых объектов его класса и без ссылки на какой-либо объект
Переменные типа static являются по сути глобальными
Их копии также не создаются,а все экземпляры класса используют одну и ту же статическую переменную

Работа данного класса:
инициализация а, инициализация статического блока, вызов метода main, вызов метода meth

 */
