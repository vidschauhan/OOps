package com.example.misc;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "Vidit"; /* String refrence will be created in String pool memory reserved for Strings */
		s = "Kumar"; /* s will now reference to new memory which contains the value "Kumar" */
		System.out.println(s);

		/***********************************************************************************************/
		String s1 = new String("StringInHeap");
		System.out.println(s1);
		s1 = "StringInHeap"; /*
								 * This will refer to the String present in String pool as the same is created
								 * with the previous line
								 */
		String s2 = new String("StringInHeap"); /* A new object will be created with the same content in HEAP memory */
		s2 = "StringInHeap"; /* This will again point the same s1="StringInHeap"; in String pool. */

		/**********************************************************************************************/

		System.out.println(s1.equals(s2)); // Returns True as it checks content.
		
		System.out.println(s1 == s2); /*
										 * Now it will Return True as it checks the reference allocation in HEAP memory as s1 &
										 * s2 both has the same String constant and are allocated in String Pool memory,
										 * Thus no new reference will be created.
										 * Reason : s1 = "StringInHeap"; // allocated in string pool.
										 * s2 = "StringInHeap"; // will refer the same in string pool.
										 */

	}

}
