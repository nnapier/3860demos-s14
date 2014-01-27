import java.util.ArrayList;

/**
 * Class: WordList
 * @author Nannette Napier
 * @version 1.0
 *
 */
public class WordList
{
	// Instance variables
	private ArrayList<String> wordList;

	// Constructor
	/**
	 * No-arg constructor for the WordList class
	 */
	public WordList()
	{
		wordList = new ArrayList<String>();
	}
	
	/** This method adds a string to the wordList
	 * @param word Word to be added
	 */
	public void add(String word)
	{
		wordList.add(word);
	}
	
	/** This method removes all elements from the wordList
	 */
	public void clear()
	{
		wordList.clear();
	}
	
	/** This method returns the number of words in the wordList
	 */
	public int count()
	{
		return wordList.size();
	}
	
	
}
