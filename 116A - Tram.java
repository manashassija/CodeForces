import java.util.Scanner;
import java.util.*;
import java.io.*;
public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currentCapacity = 0;
        int minCapacity = 0;
        int entry = 0; int exit = 0;
        for(int i = 0; i<n; i++){
            exit = sc.nextInt();
            entry = sc.nextInt();
            currentCapacity -= exit;
            currentCapacity += entry;
            if(currentCapacity> minCapacity){
                minCapacity = currentCapacity;
            }
        }
        System.out.print(minCapacity);
    }
}
