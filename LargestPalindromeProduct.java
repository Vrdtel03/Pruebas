
public class LargestPalindromeProduct {

	
	public static boolean isPalindrome(int defaultValue) {
	    int reversedNum = 0;           // the reversed number
	    int xValue = defaultValue;         // stores the default value 
	    while (xValue > 0) {
	        reversedNum = 10 * reversedNum + xValue % 10;
	        xValue /= 10;
	    }
	    return defaultValue == reversedNum;           //returns true if the number is palindrome
	}

	public static void main(String[] args) {

		int max1 = 2;
		int max2 = 101110;
		int max3 = 800000;

	    for ( int i = 9999 ; i >= 100 ; i--) {
	        if ( max1 >= i*999999 ) { 
	            break;
	        }
	        
	        if ( max2 >= i*999999 ) { 
	            break;
	        }
	        
	        if ( max3 >= i*999999 ) { 
	            break;
	        }
	        
	        for (int j = 100001 ; j >= i ; j-- ) {             
	            int p = i * j;
	            if ( max1 < p && isPalindrome(p) ) {
	                max1 = p;
	            }
	            
	            else if ( max2 < p && isPalindrome(p) ) {
	                max2 = p;
	            }
	            
	            else if ( max3 < p && isPalindrome(p) ) {
	                max3 = p;
	            }
	        }
	    }    
	    
	    System.out.println(max1);
	    System.out.println(max2);
	    System.out.println(max3);
	
		}
}
