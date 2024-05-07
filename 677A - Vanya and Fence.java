import java.util.Scanner;
import java.util.*;
import java.io.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = n;
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            if(a>h){
                w++;
            }
        }
        System.out.print(w);
    }
}
