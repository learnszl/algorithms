/**
 * @Author szl
 * @Date 2021/2/22 21:12
 * @Description
 */
public class ShellSort {
    public static void sort(int[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && SortMethod.less(a[j], a[j - h]); j -= h) {
                    SortMethod.exchange(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
