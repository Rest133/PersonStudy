package Java_8_Gerbert_Shildt.Chapter1;

enum Apple {
    Jonathan(10),

    GoldenDel(9),

    RedDel(12),

    Winesap(15),

    Cortland(8);

    private int price;

    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

class EnumDemo {
    public static void main(String[] args) {
        Apple apple;
        for (Apple a : Apple.values()) {
            System.out.println(a + " - " + " " + a.getPrice());
        }
    }
}
