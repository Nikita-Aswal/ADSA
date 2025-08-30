import java.util.Scanner;


public class effective_approach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter m");
        int m= sc.nextInt();
        int b[] = new int[m];
        int count1=0;
        int count2=0;
        System.out.println("enter 1st array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter 2nd array");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        
            for(int i=0;i<b.length;i++){
                for(int j=0; j<a.length;j++){
                    if(b[i]== a[j]){
                      count1 += (j + 1);   
                      count2 += (n - j);
                    }
                }
            }
           
          
            

        
        System.out.println(count1);
        System.out.println(count2);
    }
}
