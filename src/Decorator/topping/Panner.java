package Decorator.topping;

import Decorator.BasePizza;

public class Panner extends PizzaDecorator implements BasePizza{
	public Panner(BasePizza basePizza){
		super.basePizza=basePizza;
	}

	@Override
	public int cost() {
		return this.basePizza.cost()+30;
		
	}
}
