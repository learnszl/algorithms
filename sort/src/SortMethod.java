/**
 * @Author szl
 * @Date 2021/2/21 16:52
 * @Description 公用方法
 */
public class SortMethod {
    public static boolean less(int i, int j) {
        return i < j;
    }
    public static void exchange(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
