package Java_8_Gerbert_Shildt;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10)){
            System.out.println("Число положительное");
        }
        if (nif.isNotNegative(-12)){
            System.out.println("КУКУ");
        }
    }
}

class A {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
