package Day09;

public class Qus_03 {
        public static void main(String[] args) {
                int n=14;
                        for (int i = 0; i < n; i++) {
                                for (int j = 0; j < n+1; j++) {
                                        if(j==0||i+j<=n/2||j-i>=n/2||j==n||i==n-1){
                                                System.out.print(" * ");
                                        }
                                        else{
                                                System.out.print("   ");
                                        }
                                }
                                System.out.println();
                        
                }
        }
        
}
