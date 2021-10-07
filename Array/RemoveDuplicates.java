/* Author: Aarya Khodke
 * Date: 07/10/2021
 * Question: To remove duplicates from a sorted array.
 * Algorithm: Iterating through the loop and comparing adjacent elements, 
 * 			  and storing them in a temporary array. Storing the last element separately. 
 * 			  Then modifying the original array with the elements from temporary array. 
 *		      	  			
 */


//package hacktober;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		duplicates(arr);
		//System.out.println("Array after removing duplicates: ");
		for(int i = 0; i < n; i++)
		{
			if(arr[i]==0)
				break;
			System.out.println(arr[i]);
		}
	}
	static void duplicates(int[] nums)
	{
		int j = 0;
		int[] temp = new int[nums.length];
		for(int i = 0; i < nums.length-1; i++)
		{
			if(nums[i]!=nums[i+1])
				temp[j++] = nums[i];
		}
		temp[j++] = nums[nums.length-1];
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = temp[i];
		}
	}
}
/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Test case 1:
 * INPUT:
 * Enter number of array elements: 
 * 7
 * Enter array elements: 
 * 10 13 13 17 19 19 21
 * OUTPUT:
 * 10
 * 13
 * 17
 * 19
 * 21
 * 
 * Test case 2:
 * INPUT:
 * Enter number of array elements: 
 * 6
 * Enter array elements: 
 * 78 -30 24 -30 98 78
 * OUTPUT:
 * -30
 * 24
 * 78
 * 98
 */
