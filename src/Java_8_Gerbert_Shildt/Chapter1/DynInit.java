package Java_8_Gerbert_Shildt.Chapter1;

 class DynInit {
    public static void main(String[] args) {
        double a = 4.0, b = 3.0;

        //динамическая инициализация переменной с
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
