package Java_8_Gerbert_Shildt.Chapter1;

class Factorial {
    int fact(int n) {
        int result;
        if (n == 1) {
            System.out.println("Факториал 1 равен 1");
            return 1;
        }
        result = fact(n - 1) * n;
        System.out.println("Факториал " + n + " равен " + result);
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.fact(11400));//рандомные числа? стек переполнен( стек - очередь,"первый вошел последним вышел, именно!")
    }
}

/*
Как работает рекурсия
при n=4

fact(4):
result = fact(3) * 4;
    fact(3):
    result = fact(2) * 3;
        fact(2):
         result = fact(1) * 2;
            fact(1):
                result = 1;
Дальше возврат полученных значений result с передачей управления методу

result = (1*2*3) *4

Оператор return можно использовать в любом месте метода для возврата
управления тому объекту, который вызвал данный метод
 */
