package com.example.Enum;
import com.example.Enum.EnumSwitch.Days;

/*Every enum constant is always implicitly public static final. 
Since it is static, we can access it by using enum Name. 
Since it is final, we can’t create child enums.

#enum can contain constructor and it is executed separately for each enum constant 
at the time of enum class loading.
#We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.

# If we define a constructor inside Enum,
it will be automatically called as many times as Constants are defined in that Enum.

# The constructor inside Enum can't be Public;
*/

public class EnumSwitch {

	public static void main(String[] args) {
		EnumTest et = new EnumTest(Days.MONDAY);
		et.callDays();
		Days d = Days.FRIDAY;
		d.Daysmethod();
	}

	
	enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
		
		//constructor in Enum.
		private Days() {
			System.out.println("Inside Enum's Constructor");
		}
		
		//Simple method in Enum
		public void Daysmethod(){
			System.out.println("Inside Enum's Method.");
		}
	}
}

class EnumTest {

	Days day;

	EnumTest(Days day) {
		this.day = day;
	}

	public void callDays() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}

	}

}
