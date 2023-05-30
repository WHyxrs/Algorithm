package comparisonSort.insertSort.directInsertSort;

import java.util.Arrays;

/**
 * @Title: Test
 * @Author bubuwang
 * @Date 2023/5/30 9:48
 * @description: 测试类
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,16,22,13,6,5,8,9,11,14,13,15,4,6,8,11};
        DirectInsertSort sort = new DirectInsertSort();
        int[] ints = sort.InsertSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
