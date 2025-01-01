package Decorator.topping;

import Decorator.BasePizza;

public class ExtraCheese extends PizzaDecorator implements BasePizza{
	public ExtraCheese(BasePizza basePizza){
		super.basePizza=basePizza;
	}

	@Override
	public int cost() {
		return this.basePizza.cost()+20;
		
	}
	
}
