public class NapierUnitConversionTester
{
    // Miles, Yards, Feet, Inches
    private static Length oneInch = new Length(0, 0, 0, 1);
    private static Length twelveInches = new Length(0, 0, 0, 12);
    private static Length thirtySixInches = new Length(0, 0, 0, 36);
    private static Length oneMile = new Length(1, 0, 0, 0);
    private static Length threeHalfYards = new Length(0, 3.5, 0, 0);
  
    // Testing Gallons, Cups, Teaspoon
    private static CookingMeasure oneTsp = new CookingMeasure(0,0,0,0,0,0,1);
    private static CookingMeasure twelveTsp = new CookingMeasure(0,0,0,0,0,0,12);
    private static CookingMeasure eightCups = new CookingMeasure(0,0,0,8,0,0,0);
    private static CookingMeasure oneGallon = new CookingMeasure(1,0,0,0,0,0,0);
    
    // Testing Gallons, Quarts, Pints
    private static DryVolume twoPints = new DryVolume(0,0,2);
    private static DryVolume oneEach = new DryVolume(1,1,1);
    
  public static boolean compareDoubles(double d1, double d2, double delta)
{
    boolean result = false;
    if (Math.abs(d1 - d2) < delta)
    {
         result = true;
    } 
    return result;
}
  
  // ----------------------L E N G T H-----------------------------------  
  /**
   * Various tests on the Length method. These are based upon the specification
   * This is not intended to be a thorough test, but to identify areas that need
   * to be more thoroughly tested
   */
  public static void testLength()
  {
    double percentage = 0;
    
    // ---- Testing toString ------
    System.out.println("---------- Testing Length.toString --------");
    System.out.println("SOP 1 inch: got " + oneInch);
    System.out.println("SOP 12 inches: got " + twelveInches);
    System.out.println("SOP 36 inches: got " + thirtySixInches);
    System.out.println("SOP 1 mile: got " + oneMile);
    System.out.println("SOP 3.5 yards or 3 yards 1 foot 6 inches: got " + threeHalfYards);
    
    
    testLengthRepresent();
    
    // ---- Testing plus method ------
    System.out.println("---------- Testing Length.plus --------");
    System.out.println("1 inch + 12 inches = " + oneInch.plus(twelveInches));
    if (!compareDoubles(oneInch.plus(twelveInches).getBaseAmount(), 13.0, 0.000001))
    {
      System.err.println("Error adding 1 + 12 inches");
    }
    
    System.out.println("1 inch + 36 inches = " + oneInch.plus(thirtySixInches));
    if (!compareDoubles(oneInch.plus(thirtySixInches).getBaseAmount(), 37.0, 0.000001))
    {
      System.err.println("Error adding 1 + 36 inches");
    }

  }
  
  public static void testLengthRepresent()
  {
    // ---- Testing representAsInches ------
    System.out.println("---------- Testing Length.representAsInches --------");
    if (oneInch.representAsInches() != 1.0)
    {
      System.err.println("oneInch.representAsInches() wrong");
    }
    if (twelveInches.representAsInches() != 12.0)
    {
      System.err.println("twelveInches.representAsInches() wrong");
    }
    if (thirtySixInches.representAsInches() != 36.0)
    {
      System.err.println("thirtySixInches.representAsInches() wrong");
    }
    if (oneMile.representAsInches() != 63360.0)
    {
      System.err.println("oneMile.representAsInches() wrong");
    }
    if (threeHalfYards.representAsInches() != 126.0)
    {
      System.err.println("threeHalfYards.representAsInches() wrong");
    }
    
     // ---- Testing representAsMiles ------
    System.out.println("---------- Testing Length.representAsMiles --------");
     if (oneMile.representAsMiles() != 1.0)
    {
      System.err.println("oneMile.representAsMiles() wrong");
    }
    if (!compareDoubles(threeHalfYards.representAsMiles(), 0.00198864, 0.00001))
    {
      System.err.println("threeHalfYards.representAsMiles() wrong. Got: " +
                          threeHalfYards.representAsMiles());
    }
    
    
    // ---- Testing representAsYards ------
    System.out.println("---------- Testing Length.representAsYards --------");
    if (oneMile.representAsYards() != 1760)
    {
      System.err.println("oneMile.representAsYards() wrong");
    }
    if (threeHalfYards.representAsYards() != 3.5)
    {
      System.err.println("threeHalfYards.representAsYards() wrong. Got: " +
                          threeHalfYards.representAsYards());
    }
    
    // ---- Testing generic represent ------
    System.out.println("---------- Testing Length.represent --------");
    if (oneMile.represent(Length.ConvertType.YARDS) != 1760)
    {
      System.err.println("oneMile.represent(YARDS) wrong");
    }
    if (threeHalfYards.represent(Length.ConvertType.YARDS) != 3.5)
    {
      System.err.println("threeHalfYards.represent(YARDS) wrong. Got: " +
                          threeHalfYards.represent(Length.ConvertType.YARDS));
    }
    if (!compareDoubles(threeHalfYards.represent(Length.ConvertType.MILES), 0.00198864, 0.00001))
    {
      System.err.println("threeHalfYards.represent(MILES) wrong. Got: " +
                          threeHalfYards.represent(Length.ConvertType.MILES));
    }
   
  }
  
    // ----------------------C O O K I N G   M E A S U R E---------------  
  /**
   * Various tests on the CookingMeasure method. These are based upon the specification
   * This is not intended to be a thorough test, but to identify areas that need
   * to be more thoroughly tested
   */
  public static void testCookingMeasure()
  {
    double percentage = 0;
    
    // ---- Testing toString ------
    System.out.println("---------- Testing CookingMeasure.toString --------");
    System.out.println("SOP 1 tsp: got " + oneTsp);
    System.out.println("SOP 12 tsp: got " + twelveTsp);
    System.out.println("SOP 8 cups: got " + eightCups);
    System.out.println("SOP 1 gallon: got " + oneGallon);
    
    testCookingMeasureRepresent();
    
    // ---- Testing minus method ------
    System.out.println("---------- Testing CookingMeasure.minus --------");
    System.out.println("12 tsp - 1 tsp = " + twelveTsp.minus(oneTsp));
    if (!compareDoubles(twelveTsp.minus(oneTsp).getBaseAmount(), 11.0, 0.000001))
    {
      System.err.println("Error subtracting 12 - 1 tsp");
    }
    
    System.out.println("1 gallon - 8 cups = " + oneGallon.minus(eightCups));
    if (!compareDoubles(oneGallon.minus(eightCups).getBaseAmount(), 384.0, 0.000001))
    {
      System.err.println("Error subtracting 1 gallon from 8 cups");
    }

  }
  
  public static void testCookingMeasureRepresent()
  {
    // ---- Testing representAsTeaspoon ------
    System.out.println("---------- Testing CookingMeasure.representAsTeaspoon --------");
    if (oneTsp.representAsTeaspoon() != 1.0)
    {
      System.err.println("oneTsp.representAsTeaspoon() wrong");
    }
    if (twelveTsp.representAsTeaspoon() != 12.0)
    {
      System.err.println("twelveTsp.representAsTeaspoon() wrong");
    }
    if (eightCups.representAsTeaspoon() != 384.0)
    {
      System.err.println("eightCups.representAsTeaspoon() wrong");
    }
    if (oneGallon.representAsTeaspoon() != 768.0)
    {
      System.err.println("oneGallon.representAsTeaspoon() wrong");
    }
    
    
     // ---- Testing representAsQuarts ------
    System.out.println("---------- Testing CookingMeasure.representAsQuarts --------");
     if (!compareDoubles(oneTsp.representAsQuarts(),0.005208, 0.000001))
    {
      System.err.println("oneTsp.representAsQuarts() wrong");
    }
    
    // ---- Testing representAsPints ------
    System.out.println("---------- Testing CookingMeasure.representAsPints --------");
    if (oneGallon.representAsPints() != 8)
    {
      System.err.println("oneGalloon.representAsPints() wrong");
    }
    
    // ---- Testing generic represent ------
    System.out.println("---------- Testing CookingMeasure.represent --------");
    if (eightCups.represent(CookingMeasure.ConvertType.PINTS) != 4)
    {
      System.err.println("eightCups.represent(PINTS) wrong");
    }
    
    if (!compareDoubles(eightCups.represent(CookingMeasure.ConvertType.FLUID_OUNCES), 64, 0.00001))
    {
      System.err.println("eightCups.represent(FLUID_OUNCES) wrong. Got: " +
                          eightCups.represent(CookingMeasure.ConvertType.FLUID_OUNCES));
    }
   
  }
  
  // ----------------------D R Y   V O L U M E---------------  
  /**
   * Various tests on the DryVolume method. These are based upon the specification
   * This is not intended to be a thorough test, but to identify areas that need
   * to be more thoroughly tested
   */
  public static double testDryVolume()
  {
    double percentage = 0;
   
    System.out.println("2 pints asGallon (0.25) " + twoPints.representAsGallons() );
    System.out.println("2 pints asPints (2) " + twoPints.representAsPints() );
    
    System.out.println("oneEach asGallon (1.375) " + oneEach.representAsGallons() );
    System.out.println("oneEach asPints (11) " + oneEach.representAsPints() );
    
    return percentage;
  }
  
  
  public static void main(String[] args)
  {
    testLength();
    testCookingMeasure();
    testDryVolume();
  }
}