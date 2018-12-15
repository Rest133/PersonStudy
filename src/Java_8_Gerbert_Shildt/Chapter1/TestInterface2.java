package Java_8_Gerbert_Shildt.Chapter1;

public class TestInterface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(15);
        c = ob;
        c.callback(27);

    }
}
//вызываемый вариант метода callback() выбирается в зависимости от типа объекта,на который ссылается переменная с