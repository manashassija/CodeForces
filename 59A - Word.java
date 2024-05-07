import java.util.Scanner;
import java.util.*;
import java.io.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int countu = 0;
        int countl = 0;
        for(char c: arr){
            if(Character.isUpperCase(c)){
                countu++;
            }else{
                countl++;
            }
        }
        if(countu > countl){
            for(int i = 0; i<arr.length; i++){
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        else{
            for(int i = 0; i<arr.length; i++){
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        System.out.println(new String(arr));
        
    }
}
