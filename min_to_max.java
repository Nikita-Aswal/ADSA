import java.util.Scanner;
public class min_to_max {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Your code goes here
            int m=a[0];
            int count=0;
            for(int i=0; i<a.length;i++){
                if(a[i]<m){
                    m=a[i];
                }
            }
            for(int i=0; i<a.length;i++){
                if(a[i]!=m){
                    a[i]=m;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}


