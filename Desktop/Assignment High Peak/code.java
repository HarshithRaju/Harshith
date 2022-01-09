import java.util.Arrays;
import java.util.Scanner;

public class GFG {
	public int findMinDiff()
    { Scanner sc= new Scanner(System.in);
       
      int arr[]= {7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
       int n = arr.length;
       int m = sc.nextInt();  // Number of Employees
        
        if (m == 0 || n == 0)
            return 0;
        Arrays.sort(arr);
      
        if (n < m)
           return -1;

        int min_diff = Integer.MAX_VALUE;
      
        for (int i = 0; i + m - 1 < n; i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
                
        }
        return min_diff;
    }
    
    public static void main(String[] args)
    { 
       GFG result = new GFG();
  
       System.out.println("Enter the number of Employees");
       System.out.println(" The difference between the choosen goodie with highest price and lowest price for above mentioned number of Employees is "+ result.findMinDiff());
      
        
             
    }
}
