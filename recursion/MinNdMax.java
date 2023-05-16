package recursion;

public class MinNdMax {
    public static void main(String[] args) throws Exception {
        int[] arr = { -999999, -99999, -9999, -999, -99};
        int n = arr.length;

        // Find minimum and maximum values
        int[] result = findMinMax(arr, 0, n - 1);

        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);
    }

    // Recursive function to find the minimum and maximum values in the array
    public static int[] findMinMax(int[] arr, int start, int end) {
        if (start == end) {
            return new int[] { arr[start], arr[start] };
        }

        int mid = (start + end) / 2;

        int[] leftResult = findMinMax(arr, start, mid);
        int[] rightResult = findMinMax(arr, mid + 1, end);

        int min = Math.min(leftResult[0], rightResult[0]);
        int max = Math.max(leftResult[1], rightResult[1]);

        return new int[] { min, max };
    }
}
