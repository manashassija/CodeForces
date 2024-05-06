import java.util.Scanner;
import java.util.HashSet;
import java.util.*;
import java.io.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char s1 = s.charAt(0);
        int count = 0;
        for(int i = 1; i<n; i++){
            if(s.charAt(i) == s1){
                count++;
            }else{
                s1 = s.charAt(i);
            }
        }
        System.out.println(count);
    }
}
