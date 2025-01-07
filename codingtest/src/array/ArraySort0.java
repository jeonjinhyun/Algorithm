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
        solution(data);
        System.out.println(Arrays.toString(data));
    }
    public static void solution(int[] intArray){
        Arrays.sort(intArray);
    }
}

