package problems;

public class SumOfArray {
    public static int sum(int arr[]) {
        return sumOfNumbs(arr, 0);
    }
    private static final int sumOfNumbs(int arr[], int ind) {
        if (ind == arr.length)
            return 0;
        return arr[ind] + sumOfNumbs(arr , ind + 1);
    }
}
