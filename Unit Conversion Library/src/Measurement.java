/** Class: Measurement
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
public class Measurement
{
	// Instance variables
	private double baseAmount;
	
	// Constructor
	public Measurement(double baseAmount)
	{
		this.baseAmount = baseAmount;
	}

	/**
	 * @return the baseAmount
	 */
	public double getBaseAmount()
	{
		return baseAmount;
	}

	/**
	 * @param baseAmount the baseAmount to set
	 */
	public void setBaseAmount(double baseAmount)
	{
		this.baseAmount = baseAmount;
	}
	
	// Plus method
	public Measurement plus(Measurement aMeasure)
	{
		Measurement newMeasure = new Measurement(baseAmount);
		newMeasure.setBaseAmount(baseAmount + aMeasure.getBaseAmount());
		return newMeasure;
	}
	// Minus method
	public Measurement minus(Measurement aMeasure)
	{
		Measurement newMeasure = new Measurement(baseAmount);
		newMeasure.setBaseAmount(baseAmount - aMeasure.getBaseAmount());
		return newMeasure;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Measurement [baseAmount=" + baseAmount + "]";
	}
	
	
}
