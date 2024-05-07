import java.util.Scanner;
import java.util.*;
import java.io.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String r = "";
        for(int i = s.length()-1; i>=0; i--){
            r += s.charAt(i);
        }
        if(t.equals(r)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
