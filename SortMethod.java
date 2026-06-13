import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        int arr[] = {9, 5, 6, 1, 2, 7};

        Arrays.sort(arr);

        for (int n : arr)
            System.out.print(n + " ");
    }
}