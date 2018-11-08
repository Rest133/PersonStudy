package Java_8_Gerbert_Shildt.Chapter1;

class VarArgs4 {

    static void vaTest(int... v) {
        System.out.println("vaTest(int...): " + "Количество аргументов: " + v.length + "\n" + "Содержимое: ");
        for (int x : v) {
            System.out.println(x + " ");
            System.out.println();
        }
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(int...): " + "Количество аргументов: " + v.length + "\n" + "Содержимое: ");
        for (boolean x : v) {
            System.out.println(x + " ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
        //  vaTest(); и тот и тот массив подходят
    }

}