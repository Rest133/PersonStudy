package Sorts;

import org.jetbrains.annotations.NotNull;

public class Date implements Comparable {
    private int year, month, day;

    Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


   /* @Override
    public int compareTo(Date that) {
        if (this.year < that.year) return -1;
        if (this.year > that.year) return +1;
        if (this.month < that.month) return -1;
        if (this.month > that.month) return +1;
        if (this.day < that.day) return -1;
        if (this.day > that.day) return +1;
        return 0;
    }
*/
    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}
