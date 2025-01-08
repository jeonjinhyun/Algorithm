package array.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class ArrayControl {
    public static void main(String[] args) {
        int[] testCase0 = {4,2,2,1,3,4};
        int[] testCase1 = {2,1,1,3,2,5,4};
        System.out.println(Arrays.toString(solution0(testCase0)));
        System.out.println(Arrays.toString(solution1(testCase1)));
    }
    public static Integer[] solution0(int[] intArray){
        Integer[] result = Arrays.stream(intArray).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        return result;
    }

    public static int[] solution1(int[] intArray){
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int num : intArray){
            set.add(num);
        }

        int[] result = new int[set.size()];
        for(int i = 0; i<result.length;i++){
            result[i] = set.pollFirst();
        }
        return result;
    }
}
