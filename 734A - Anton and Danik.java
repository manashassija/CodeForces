import java.util.*;
import java.io.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a = 0;
        int d = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                a++;
            }else{
                d++;
            }
        }
        if(a>d){
            System.out.print("Anton");
        }else if(a<d){
            System.out.print("Danik");
        }else{
            System.out.print("Friendship");
        }
    }
}
