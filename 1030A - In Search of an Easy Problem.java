import java.util.Scanner;
import java.util.*;
import java.io.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ishard = false;
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            if(a==1){
                ishard = true;
                break;
            }
        }
        if(ishard){
        System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
        
    }
}
