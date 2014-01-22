public class Address {
	
	/** Create an address with street, city, state, and zip */
	public Address (String street, String state, String city, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	/** Return street */
	public String getStreet() 
	{
		return street;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() 
	{
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) 
	{
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() 
	{
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) 
	{
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() 
	{
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) 
	{
		this.zip = zip;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	public String getFullAddress() {
		return street + '\n' + city + ", " + state + ' ' + zip + '\n';
	}
	
	// Private attributes of this class
	private String street;
	private String city;
	private String state;
	private String zip;
}
