package Java_8_Gerbert_Shildt.Chapter1;

 class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num = 27;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Число простое");
        else System.out.println("Число не является простым");
    }
}
