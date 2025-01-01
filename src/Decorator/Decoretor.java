package Decorator;

import Decorator.topping.ExtraCheese;
import Decorator.topping.Panner;

public class Decoretor {
	public static void main(String[] args) {
		System.out.println(new Panner(new ExtraCheese(new VegDelight())).cost());
	}
}
