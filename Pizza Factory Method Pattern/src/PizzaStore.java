import java.util.Scanner;

/**
 * 
 */

/**
 * @author nnapier
 *
 */
public abstract class PizzaStore
{
	public abstract Pizza createPizza();

	public Pizza orderPizza()
	{
		// Deferring instantiation to the concrete version
		// of the PizzaStore classes
		Pizza pizza = createPizza();

		// Complete all the steps involved in
		// preparing a pizza for a customer
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		// Finally, return this pizza
		return pizza;
	}

	public Pizza orderPizzaWithToppings(Scanner keyboard)
	{
		// Deferring instantiation to the concrete version
		// of the PizzaStore classes
		Pizza pizza = createPizza();

		// Use the Scanner object to ask which toppings to add
		System.out.println("How many toppings do you want to add?");
		String input = keyboard.nextLine();
		int count = Integer.parseInt( input );
		for (int i=0; i<count; i++)
		{
			System.out.print("Add topping " + i + ": ");
			String topping = keyboard.nextLine();
			pizza.addTopping(topping);
		}

		// Complete remaining steps involved in
		// preparing a pizza for a customer
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;

	}
}
