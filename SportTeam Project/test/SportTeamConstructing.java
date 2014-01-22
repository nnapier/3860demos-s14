import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SportTeamConstructing
{
	@Before
	public void setUp() throws Exception
	{
		
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testSportTeam()
	{
		SportTeam myTeam = new SportTeam();
		
		assertEquals("Head coach should be unknown", "unknown", myTeam.getHeadCoach());
		assertEquals("Sport type should be baseball", "baseball", myTeam.getSportType());
		assertEquals("Max number of players should be 20", 20, myTeam.getMaxNumPlayers());
	}

	@Test
	public void testSportTeamStringInt()
	{
		fail("Not yet implemented");
	}

}
