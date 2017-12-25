package com.example.misc;


/*As a side note, when we override equals(), it is recommended to also override the hashCode() method.
If we don’t do so, equal objects may get different hash-values; and hash based collections, including HashMap, HashSet, and Hashtable
*/
public class OverridingEqual {

	public static void main(String[] args) {
	
		OverrideEqual ob = new OverrideEqual(10.2,11.3);
		OverrideEqual ob1 = new OverrideEqual(10.2,11.3);

		System.out.println(ob.equals(ob1));
	}

}


class OverrideEqual {

	double x = 3.5;
	double y = 5.6;
	
	OverrideEqual(double x,double y){
		this.x=x;
		this.y=y;
	}

	// Overriding equals() to compare two Complex objects
	@Override
	public boolean equals(Object obj) {

		// If the object is compared with itself then return true 
		if (obj == this) {
			return true;
		}

		/* Check if o is an instance of Complex or not
        "null instanceof [type]" also returns false */
		
		if (!(obj instanceof OverrideEqual)) {
			return false;
		}


		// typecast o to Complex so that we can compare data members
		OverrideEqual ov = (OverrideEqual) obj;
		 // Compare the data members and return accordingly
		return Double.compare(x, ov.x) == 0 && Double.compare(y, ov.y) == 0;

	}
}
