package Java_8_Gerbert_Shildt.Chapter1;

 class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        //Присвоить значение элементам массива nums
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Значение равно: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
/*
----------nums[0]------nums[1]-------nums[2]-----
nums[]==[[1,2,3,4,5], [2,4,6,8,10], [3,6,9,12,15]]
-------------------------------------------------
------x[0]--x[1]--x[2]--x[3]--x[4]
x[]={ 1  ,  2 ,   3 ,   4 ,   5 } и т.д.
 */