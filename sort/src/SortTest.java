import org.junit.Test;

import java.util.Random;

/**
 * @Author szl
 * @Date 2021/2/21 17:24
 * @Description
 */
public class SortTest {
    @Test
    public void SelectSortTest() {
        int[] num = {2, 4, 22, 56, 34, 75, 44, 2, 673, 39};
        SelectSort.sort(num);
        SortMethod.show(num);
    }

    @Test
    public void InsertSortTest() {
        int[] num = {2, 4, 22, 56, 34, 75, 44, 2, 673, 39};
        InsertSort.sort(num);
        SortMethod.show(num);

    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[100000];
        for (int i = 0; i < 100000; i++) {
            num[i] = r.nextInt(10000000);
        }
        long startTime = System.currentTimeMillis();    //获取开始时间
        ShellSort.sort(num);
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
        SortMethod.show(num);

    }

}
