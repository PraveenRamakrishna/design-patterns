package patterns.sdp.flyweight;

import java.util.HashMap;
import java.util.Map;

interface Vehicle {
	void start();

	void stop();

	Color getColor();
}

class Color {
	String red;
	String green;
	String blue;
}

class Car implements Vehicle {
	public void start() { }

	public void stop() { }

	public Color getColor() {
		return new Color();
	}
}

public class VehicleFactory {

	private static Map<Color, Vehicle> vehiclesCache = new HashMap<Color, Vehicle>();

	public static Vehicle createVehicle(Color color) {
		Vehicle newVehicle = vehiclesCache.computeIfAbsent(color, newColor -> {
			return new Car();
		});
		return newVehicle;
	}
}