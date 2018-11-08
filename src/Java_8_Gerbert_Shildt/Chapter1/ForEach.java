package Java_8_Gerbert_Shildt.Chapter1;

 class ForEach {
    public static void main(String[] args) {
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int x : num) sum += x;
        System.out.println(sum);
    }
}
