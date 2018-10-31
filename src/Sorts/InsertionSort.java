package Sorts;

//Сортировка вставками,применяется для частично упорядоченных массивов
public class InsertionSort extends Sort {
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            for (int j = i; j > 0; j--)
                if (less(a[j], a[j - 1])) exchange(a, j, j - 1);
                else break;
        assert  isSorted(a);
    }
}