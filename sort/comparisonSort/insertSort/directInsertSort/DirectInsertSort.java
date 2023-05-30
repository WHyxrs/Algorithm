package comparisonSort.insertSort.directInsertSort;

/**
 * @Title: InsertSort
 * @Author bubuwang
 * @Date 2023/5/30 8:50
 * @description: 插入排序
 * 思想：每个数都与它之前的数倒序比较，如果有个数比它小，就插入在那个比它小和比它大的数的中间
 */
public class DirectInsertSort {
    private static final Integer maxSize = 100;

    /**
     * @param arr 未排序数组
     */
    int[] InsertSort(int[] arr) {
        int length = arr.length;
        int i, j;
        int temp;
        //检查参数
        if (length > maxSize) {
            throw new ArrayIndexOutOfBoundsException("数组长度超过最大限制长度,请检查");
        }
        if (length == 0) {
            return null;
        }
        for (i = 0; i < length; i++) {
            //当此循环需要遍历的数
            temp = arr[i];
            //前一个数从后向前遍历
            for (j = i - 1; j >= 0; j--) {
                //如果当前值比temp大，就把当前数和之后的数向后移一位
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            //此时arr[j]是比temp小的第一个数，应该在它之后进行插入，所以是arr[j+1]
            arr[j + 1] = temp;
        }
        return arr;
    }
}
