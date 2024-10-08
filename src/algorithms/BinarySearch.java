package algorithms;

public class BinarySearch {
    /**
     * 找到返回索引，找不到返回 -1
     */
    public static int binarySearch(int[] array, int target) {
        // 定义两个指针
        int left = 0, right = array.length - 1;

        // 查找的范围
        while (left <= right) {
            // 中间索引，自动取整了
            // 两个大数相加变成负数问题
            //int mid = (left + right) / 2;
            // 右移一位，二进制的形式
            int mid = (left + right) >>> 1;

            // 目标值小于中间值，说明在中间值的左边
            if (target < array[mid]) {
                right = mid - 1;
            } else if (target > array[mid]) {
                // 目标值大于中间值，说明在中间值的右边
                left = mid + 1;
            } else {
                // 目标值等于中间值 找到,返回索引
                return mid;
            }
        }

        return -1;
    }
}
