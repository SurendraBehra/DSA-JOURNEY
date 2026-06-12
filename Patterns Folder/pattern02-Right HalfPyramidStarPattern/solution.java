import java.util.*;

public class solution {
    public void pattern2(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  
     int n = sc.nextInt();
     
     solution obj = new solution();
     obj.pattern2(n);
    }

}