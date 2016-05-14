/**
 * 
 */
/**
 *  Life, the Universe, and Everything
 * 
 * Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything
 * More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42
 * All numbers at input are integers of one or two digits.
 * 
 * 
 * 
 *
 */

package classicalProblems;

import java.util.*;

public class LifeTheUniverseAndEverything {
	
	public static void main(String [] args) throws java.lang.Exception {
		
		Scanner sc = new Scanner(System.in);
		
		while ( sc.hasNextLine()) {
			
			int curentInteger = sc.nextInt();
			
			if ( curentInteger != 42) {
				System.out.println(curentInteger);
			}else {
				break;
			}
			
		}
	}
	
		
}
