import java.util.*;

public class solutionPattern {
    public void pattern1(int n) {
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solutionPattern obj = new solutionPattern();
        obj.pattern1(n);
    }
}
