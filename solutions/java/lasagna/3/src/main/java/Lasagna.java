public class Lasagna {
	private static final int expectedMinutesInOven = 40;
	private static final int preparationTimeInMinutes = 2;

	public int expectedMinutesInOven() {
		return expectedMinutesInOven;
	}

	public int remainingMinutesInOven(int minutes) {
		return expectedMinutesInOven() - minutes;
	}

	public int preparationTimeInMinutes(int layers) {
		return layers * preparationTimeInMinutes;
	}

	public int totalTimeInMinutes(int layers, int minutes) {
		return preparationTimeInMinutes(layers) + minutes;
	}
}
