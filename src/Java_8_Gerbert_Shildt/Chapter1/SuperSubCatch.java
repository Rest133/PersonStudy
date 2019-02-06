package Java_8_Gerbert_Shildt.Chapter1;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 10 / a;
        } catch (Exception e) {
            System.out.println("Обработка ошибок класса Exception");
  /*      }catch (ArithmeticException e){
            System.out.println("Это вообще не будет обработано");              //этот оператор catch недостижим,т.к. класс exception суперкласс для класса arithmeticException
        }                                                                      // это означает,что первый оператор catch обработает все исключения класса exception и всех производных от него классов
    */
        }
    }
}