import java.util.Scanner;
import java.util.*;
import java.io.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            if(n%10==0){
                n = n/10;
            }
            else {
                n = n-1;
            }
        }
        
        System.out.println(n);
        
    }
}
