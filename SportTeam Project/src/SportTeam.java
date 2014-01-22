/**
 * This class represents characteristics of a Sports Team.
 */

/**
 * @author nnapier
 *
 */
public class SportTeam
{
	private String headCoach;
	private String sportType;
	private int maxNumPlayers;
	boolean suspended;
	private String[] playerNames;

	public SportTeam() {
		headCoach = "unknown";
		sportType = "baseball";
		maxNumPlayers = 20;
		playerNames = new String[20];  // Make room for max of 20 players
	}
	
	public SportTeam(String coach, int num) {
		headCoach = coach;
		sportType = "baseball";
		maxNumPlayers = num;
		playerNames = new String[maxNumPlayers];
	}
	
	
	public String getHeadCoach() {
		return headCoach;
	}

	/**
	 * @param headCoach the headCoach to set
	 */
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}

	public String getSportType() {
		return sportType;
	}

	/**
	 * @param sportType the sportType to set
	 */
	public void setSportType(String sportType)
	{
		this.sportType = sportType;
	}

	public int getMaxNumPlayers()
	{
		return maxNumPlayers;
	}

	/**
	 * @param maxNumPlayers the maxNumPlayers to set
	 */
	public void setMaxNumPlayers(int maxNumPlayers)
	{
		this.maxNumPlayers = maxNumPlayers;
	}

	
	public boolean getSuspended() {
		return suspended;
	}
	
	public void setSuspended(boolean suspended)
	{
		this.suspended = suspended;
	}

	public String[] getPlayerNames() {
		return playerNames;
	}

	/**
	 * @param playerNames the playerNames to set
	 */
	public void setPlayerNames(String[] playerNames) {
		this.playerNames = playerNames;
	}
	
	/** 
	 * Prints the contents of the object
	 */
	public String toString()
	{
		String value = "Coach is " + headCoach + "\n";
		value += "Sport type is " + sportType + "\n";
		value += "Max number of players is " + maxNumPlayers + "\n";
		
		for (int i=0; i < playerNames.length; i++)
		{
			String name = playerNames[i];
			value += "-- name sub " + i + " = " + name  + "\n";
		}
		
		return value;
	}

}
