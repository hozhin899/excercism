public class CarsAssemble {

	public double productionRatePerHour(int speed) {
		double productionRate = 0.0;
		switch (speed) {
			case 1, 2, 3, 4 -> productionRate = 1.0;
			case 5, 6, 7, 8 -> productionRate = 0.9;
			case 9 -> productionRate = 0.8;
			case 10 -> productionRate = 0.77;
			default -> productionRate = 0.0;
		}
		return speed * 221 * productionRate;
	}

	public int workingItemsPerMinute(int speed) {
		return (int) (productionRatePerHour(speed) /60.0);
	}
}
