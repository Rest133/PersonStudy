package Java_8_Gerbert_Shildt.Chapter1;

class OverLoadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    //Перегружаемый метод,проверяющий наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    //Перегружаемый метод,проверяющий наличие параметра типа double
    double test(double a) {//если б не было перегрузки метода с int a в качестве параметра, то при записи в параметр
//     а  тип данных int он был бы автоматически приобразован в параметр типа double
        System.out.println("double a: " + a);
        return a * a;
    }
}

class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        double result;

        //Вызвать все варианты метода test()
        ob.test();
        ob.test(15);
        ob.test(10, 12);
        ob.test(1.0);

    }
}
