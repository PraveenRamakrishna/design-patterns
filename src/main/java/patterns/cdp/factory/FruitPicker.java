package patterns.cdp.factory;

public abstract class FruitPicker {

	protected abstract Fruit makeFruit();
	
	public void pickFruit(){
		final Fruit fruit = makeFruit();
		fruit.taste();
	}
}
