package Java_8_Gerbert_Shildt.Chapter1;

import java.io.IOException;

class Menu {
    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println("Справка по оператору: ");
            System.out.println("1.if-else");
            System.out.println("2.switch");
            System.out.println("3.while");
            System.out.println("4.do-while");
            System.out.println("5.for\n");
            System.out.println("Выберите нужный пункт");

            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("if(условие){\nоператор\n}else{\nоператор\n}");
                break;
            case '2':
                System.out.println("switch (выражение){\ncase константа: последовательность операторов\ncase константа: последовательность операторов\n..." +
                        "\ncase константа: последовательность операторов\n default: последовательность операторов\n}");
                break;
            case '3':
                System.out.println("while(условие){\nпоследовательность операторов\n}");
                break;
            case '4':
                System.out.println("do{\nпоследовательность операторов\n}while(условие)");
                break;
            case '5':
                System.out.println("for(инициализация;условие;итерация){\nпоследовательность операторов\n}");
                break;
        }

    }

}
