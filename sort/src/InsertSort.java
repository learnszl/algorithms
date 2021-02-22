

/**
 * @Author szl
 * @Date 2021/2/22 12:50
 * @Description
 */
public class InsertSort {
    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && SortMethod.less(a[j], a[j - 1]); j--) {
                SortMethod.exchange(a, j, j -1);
            }

        }


    }
}