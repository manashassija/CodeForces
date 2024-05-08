import java.util.Scanner;
import java.util.*;
import java.io.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<4; i++){
            if(set.add(sc.nextInt())){
            count++;}
        }
        System.out.print(4-count);
    }
}
