import java.util.Scanner;
import java.util.*;
import java.io.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] levels = new boolean[n];
        int p = sc.nextInt();
        for(int i = 0; i<p; i++){
            int level = sc.nextInt();
            levels[level-1] = true;
        }
        int q = sc.nextInt();
        for(int i = 0; i<q; i++){
            int level = sc.nextInt();
            levels[level-1] = true;
        }
        boolean allpassed = true;
        for(boolean passed:levels){
            if(!passed){
                allpassed = false;
                break;
            }
        }
        if(allpassed){
            System.out.println("I become the guy.");
        }else{
            System.out.println("Oh, my keyboard!");
        }
    }
}
