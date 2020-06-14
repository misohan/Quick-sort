import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AlgorithmQuicksort quicksort = new AlgorithmQuicksort();

        int[] arr = {80, 30, 75, 78, 89, 57, 74, 36, 1, 17, 89, 56};

        quicksort.quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }



}
