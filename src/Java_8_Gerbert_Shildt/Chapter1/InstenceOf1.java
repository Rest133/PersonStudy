package Java_8_Gerbert_Shildt.Chapter1;

class AA {
    int i, j;
}

class BB {
    int i, j;
}

class CC extends AA {
    int k;
}

class DD extends AA {
    int k;
}

public class InstenceOf1 {
    public static void main(String[] args) {
        AA a = new AA();
        BB b = new BB();
        CC c = new CC();
        DD d = new DD();

        if (a instanceof AA) {
            System.out.println("a является экземляром класса АА");
        }
        if (b instanceof BB) {
            System.out.println("b является экземляром класса ВВ");
        }
        if (c instanceof CC) {
            System.out.println("с является экземляром класса СС");
        }
        if (c instanceof AA) {
            System.out.println("с можно привести к классу АА");
        }
        if (a instanceof CC) System.out.println("а можно привести к классу СС");
        System.out.println();

        AA ob;
        ob = d;
        //.... итак понятно,что он делает
    }
}
