/** Class: VehicleTester
 *  @author Nannette Napier
 *  @version 1.0
 *  Course : ITEC 3860 Spring 2014
 *  Written: Mar 7, 2014
 *
 *  This class ---
 *  Purpose: --
 */

/**
 * @author nnapier
 *
 */
public class VehicleTester
{

	/** Method: main
	 *  *description*
	 * @param args
	 */
	public static void main(String[] args)
	{
		// 1) Create VehicleBuilder
		Vehicle.VehicleBuilder builder = new Vehicle.VehicleBuilder();
		
		// 2) Use to create Vehicle
		Vehicle myCar = builder.setHasGPS(true).setIs4By4(true).setMake("Honda").
							setModel("Accord").setManual(false).getResult();

		// 3) Display the Vehicle
		myCar.drive(100);
		myCar.drive(50);
		
		System.out.println("Description of my car follows:\n" + myCar);
	}

}
