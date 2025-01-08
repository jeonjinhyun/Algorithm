package array.test;

import java.util.Arrays;
import java.util.TreeSet;

public class PickTwoAndAddThem {
    public static void main(String[] args) {
        int[] testCase0 = {2, 1, 3, 4, 1};
        int[] testCase1 = {5, 0, 2, 7};
        System.out.println(Arrays.toString(solution(testCase0)));
        System.out.println(Arrays.toString(solution(testCase1)));
    }
    public static int[] solution(int[] arr){
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                set.add(arr[i]+arr[j]);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}

