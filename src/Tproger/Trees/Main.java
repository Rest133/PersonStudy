package Tproger.Trees;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(4, "Sara");
        tree.insert(3, "John");
        tree.insert(8, "T1000");
        tree.insert(9, "T800");
        tree.insert(2, "Conor");
        tree.insert(1, "SkyNet");

        Node findT800 = tree.find(4);
        findT800.printNode();

        tree.print(findT800);
    }
}
