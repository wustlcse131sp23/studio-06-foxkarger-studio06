package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n==0) {
			// FIXME compute the geometric sum for the first n terms recursively
			return 0;
		}
		else {			
			return ((1/(Math.pow(2, n))) + geometricSum(n-1));
		}
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 *  *The greatest common divisor of two numbers, p and q is equal to q if p % q is equal to zero
	 * Otherwise it is equal to the greatest common divisor of q and p % q.
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (p%q==0)
			// FIXME compute the gcd of p and q using recursion
			return q;
		else {
			return gcd(q,p%q);

		}
	}



	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] helper(int[] array, int[] reverseArray, int i) {
		//return reverseArray[i];
		if (i==array.length/2 && array.length%2!=0) {
			reverseArray[i]=array[i];
			return reverseArray;
		}
		else {
			int temp = array[array.length-1-i];
			reverseArray[array.length-1-i]=array[i];
			reverseArray[i]=temp;
		}
		return helper(array, reverseArray,i+1);
	}
	public static int[] toReversed(int[] array) {
		int[] newArray = new int [array.length];
		if (array.length==0||array.length==1)
			return array;
		return helper(array, newArray,0);
		// FIXME create a helper method that can recursively reverse the given array
//		return new int[0];

	}


	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {

		// FIXME
	}
	public static void main (String [] args) {
	int [] steve = {1,2,3,4,5};	
		toReversed(steve);
	}

}
