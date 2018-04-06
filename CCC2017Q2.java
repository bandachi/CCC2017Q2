import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int test = 5;
    public static void main (String[] args) {
        int i;
        int j = 0;
        int counter = 0;
        Scanner input = new Scanner(System.in);
        int N =  input.nextInt();
        input.nextLine();
        String[] heights = input.nextLine().split(" ");
        Integer[] intheights = new Integer[N];
        int half = N/2-1;
        if (half+1 != (N+1)/2){
            half = half + 2;
            j = 1;
        }
        for (i = 0; i < N; i++) {
           intheights[i] = Integer.parseInt(heights[i]);
        }
        Arrays.sort(intheights);
        if (j == 0){
            for (counter = 0; counter < half + 1;counter++){
                System.out.print(intheights[half-counter]+ " ");
                System.out.print(intheights[half+counter+1] + " ");
            }
            
        }
        if (j == 1){
            for (counter = 0; counter < half - 1;counter++){
                System.out.print(intheights[half-counter-1]+ " ");
                System.out.print(intheights[half+counter] + " ");
            }
            System.out.print(intheights[half-counter-1]+ " ");
        }
        
    }    
}