import java.util.Scanner;
import java.util.*;
import java.io.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        double sum = 0; 
        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        System.out.println(sum/(n));
    }
}
