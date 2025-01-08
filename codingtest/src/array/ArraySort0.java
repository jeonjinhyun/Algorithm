package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort0 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n= scan.nextInt();
        int[] data = new int[n];
        for(int i=0;i<n;i++){
            data[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(solution(data)));
    }
    public static int[] solution(int[] intArray){
        int[] clone = intArray.clone();
        Arrays.sort(clone);
        return clone;
    }
}

