import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0 ;
        
        for (int i = 1; i <= n; i++) {
            
            sum +=1.0/i;
        }
        
        System.out.printf("Sum of the series: %.2f", sum); 
    }
}