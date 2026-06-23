import java.util.ArrayList;

public class Subsets {

    static void generate(int[] arr,
                         int index,
                         ArrayList<Integer> subset) {

        if(index == arr.length) {
            System.out.println(subset);
            return;
        }

        // Include
        subset.add(arr[index]);

        generate(arr,
                index + 1,
                subset);

        // Backtrack
        subset.remove(subset.size() - 1);

        // Exclude
        generate(arr,
                index + 1,
                subset);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2};

        generate(arr,
                0,
                new ArrayList<>());
    }
}