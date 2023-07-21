import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int[] twoSum(int[] nums, int target) {
        /*

        Array

        int solution[] = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        return solution;*/
        Map<Integer, Integer> solution = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            solution.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(solution.containsKey(complement) && solution.get(complement) != i){
                return new int[] {i, solution.get(complement)};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(twoSum(A, target)));
    }
}