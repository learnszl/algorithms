import jdk.jfr.StackTrace;
import org.junit.Test;

/**
 * @Author szl
 * @Date 2021/2/21 17:24
 * @Description
 */
public class SortTest {
    @Test
    public void SelectSortTest(){
        int[] num = {2,4,22,56,34,75,44,2,673,39};
        SelectSort.sort(num);
        SortMethod.show(num);
    }

}
