package Java_8_Gerbert_Shildt.Chapter1;

 class ForVar {
    public static void main(String[] args) {
        boolean done;
        done = false;
        for (int i = 1; !done; i++) {
            done = true;
        }

        done = false;
        int i = 0;
        for (; done; ) {//*1*
            System.out.println("i равно " + i);
            if (i == 10) done = true;
            i++;
        }

        for (; ; ) {
            //бесконечный цикл
        }

    }
}
/*
*1*-
если начальное условие определяется сложным выражением
где-то в другом месте программы или значение переменной управления
циклом изменяется случайным образом в зависимости от действий , выполняемых
в теле цикла, то эти части оператора цикла f o r имеет смысл оставить пустыми
 */