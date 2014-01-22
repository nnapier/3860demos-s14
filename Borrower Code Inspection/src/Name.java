

import java.lang.Comparable;

	public class Name implements Comparable {
	public String firstName;
	public char mi;
	public String lastName;
	
	/**
	 * Construct a name with firstName, middle initial, and last name
	 */
	public Name(String firstName, char mi, String lastName)
	{
		this.firstName = firstName;
		this.mi = mi;
		this.lastName = lastName;
	}

	public String getFullName() {
		return firstName + ' ' + lastName;
	}
	
	/** Implements compareTo in the Comparable interface
	 */
	public int compareTo(Object o){
		
		if (!lastName.equals( ((Name)o).lastName)) {
			return lastName.compareTo(((Name)o).lastName);
		}
		else if (!firstName.equals(((Name)o).firstName)) {
			return firstName.compareTo(((Name)o).firstName);
		}
		else {
			return mi - ((Name)o).mi;
		}		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
