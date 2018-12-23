package patterns.cdp.factory;

public class MangoPicker extends FruitPicker {

	@Override
	protected Fruit makeFruit() {
		return new Mango();
	}

}
