/** Class: LengthTester
 *  @author Nannette Napier
 *  @version 1.0
 *  Course : ITEC 3860 Spring 2014
 *  Written: Mar 3, 2014
 *
 *  This class ---
 *  Purpose: --
 */

/**
 * @author nnapier
 *
 */
public class LengthTester
{

	/** Method: main
	 *  *description*
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*LengthTester: Has main method
		-Create 3 Length objects
		-SOP each object
		-Add length1 plus length2. SOP the answer
		-Subtract length2 from length3. SOP the answer
		*/
		Length length1 = new Length(0,0,0,12);
		Length length2 = new Length(0,0,0,36);
		Length length3 = new Length(0,0,0,48);
		
		Length tempLength = length1.plus(length2);
		System.out.println(tempLength);
		
		System.out.println( length3.minus(length2));
		System.out.println( length3.representAsMiles());
		System.out.println( length3.representAsYards());
		

	}

}