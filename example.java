/* package codechef; // don't place package name! */

import java.util.Arrays;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class example
{
    public static int maxStoneChef(int[] piles){
        int i  = 0; 
        int count = 0;
        
        for (i = 0; i < piles.length ; i++ ){
            if(piles[i]%2 != 0){
                count += (piles[i]/2) + 1;
            }else{
                count += (piles[i]/2);
            }
        } 
        return count;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		
        int[] arr1 = {2 , 5 , 4 , 8 , 1 , 6 , 4};
        int[] arr2 = Arrays.sort(arr1);
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

	    
	}
	
}
