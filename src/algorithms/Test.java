package algorithms;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 31, 45, 65, 67, 89, 91, 98};
        int i = BinarySearch.binarySearch(arr, 91);
        System.out.println(i);

        int i1 = BinarySearch.binarySearchBetter(arr, 98);
        System.out.println(i1);
    }
}
