package Java_8_Gerbert_Shildt.Chapter1;

 class/*1*/Example/*2*/ {
    public/*3*/ static/*4*/ void/*5*/ main(String[]/*6*/ args) {
        System.out.println("Hello,World");
        System.out.println("Простая программа на Java");
    }
}

//*1* - ключевое слово,которое служит для объявления определяемого класса
//*2* - Идентификатор,обозначающий имя класса
//*3* - модификатор доступа(public потому, что метод main при запуске программы должен вызываться из кода за пределами класса)
//*4* - ключевое слово static позволяет вызывать метод main() без получения его экземляра класса ->
// ->(потому что метод main вызывается вирутальной машиной JVM перед созданием любых объектов)
//*5* - ключевое слово void сообщает компилятору, что метод main() не возвращает никаких значений
//*6* - параметр args принимает любые аргументы командной строки, присутствующие во время выполнения программы ->

//-> Для передачи любой информации, требующейся методу, служат переменные, указываемые
//в скобках вслед за именем метода. Эти переменные называются параметрами


//static для того,чтобы можно было использовать метод без создания конкретного объекта
