package Java_8_Gerbert_Shildt.Chapter1;

abstract class Incomplete implements Callback {
    int a,b;

    void show(){
        System.out.println(a + " " + b);
    }
}
//любой класс,наследующий класс Incomplete, должен реализовать метод callback()