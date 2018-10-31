package Java_8_Gerbert_Shildt.Chapter1;

public class MissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case (0):
                    System.out.println("i равно 0");
                case (1):
                case (2):
                case (3):
                case (4):
                case (5):
                    System.out.println("i меньше либо равно пяти: " + i);
                case (6):
                case (7):
                case (8):
                case (9):
                    System.out.println("i меньше десяти");
                    break;
                default:
                    System.out.println("i равно 10 или 11 или 12");
            }
        }
    }
}
/*
Оператор switch работает следующим образом:
Выполняются ВСЕ ОПЕРАТОРЫ ПОСЛЕ НАХОЖДЕНИЯ СОВПАДЕНИЯ(если нет оператора break);
Если нет совпадений,то выполняется оператор default(если он есть,конечно)
*/