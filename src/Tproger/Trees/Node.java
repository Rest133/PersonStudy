package Tproger.Trees;

//java-master.com
public class Node {
    public int key;//Ключ узла
    public String data;//Какие-то данные в этом узле *1*

    public Node leftChild;//Левый потомок
    public Node rightChild;//Правый потомок

    public void printNode() {
        System.out.println("KEY: " + key + "\n  DATA: " + data);
    }
}

/*
*1* - в идеале здесь должен быть Дженерик(generic) или ссылка на некий объект(Поэтому там стоит неопределенный
                                                                                         тип данных -<T>),
                                                                               но мы ограничились строковой переменной
 */

