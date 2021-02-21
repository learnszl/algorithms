/**
 * @Author szl
 * @Date 2021/2/21 16:41
 * @Description
 */

public class SelectSort {
    public static void sort(int[] a){
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i; //最小元素索引
            for (int j = i+1; j < N; j++) {
                if(SortMethod.less(a[j],a[min])){
                    min = j;
                }
            }
            SortMethod.exchange(a,i,min);
        }
    }
}
