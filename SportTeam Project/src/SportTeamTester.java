/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class SportTeamTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SportTeam fakeTeam1 = new SportTeam("Bob Jones", 30);
		String[] names1 = { "Anthony", "Bill", "Carol", "David", "Ethan"};
		fakeTeam1.setPlayerNames(names1);
		System.out.println(fakeTeam1);

		SportTeam fakeTeam2 = new SportTeam("Sally Joe", 23);
		String[] names2 = { "Fred", "Gavin", "Hether", "Irma", "Jackson"};
		fakeTeam1.setPlayerNames(names2);
		System.out.println(fakeTeam2);
	}

}
