
public class Duck implements Pet
{
	private String name; 
	
	public Duck()
	{
		name = "unknown";
	}

	public Duck(String name)
	{
		this.name = name;
	}
	
	@Override
	public void speak()
	{
		System.out.println("Duck says quack");

	}

	@Override
	public void move()
	{
		System.out.println("Duck waddeles");

	}

}
