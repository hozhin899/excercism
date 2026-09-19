public class CarsAssemble {

	public double productionRatePerHour(int speed) {
		double result = 0.0;
		if (speed == 0) {
			result = 0.0;
		} else if (speed > 0 && speed < 5) {
			result = ((speed * 221) * 100.0) / 100.0;
		} else if (speed > 4 && speed < 9) {
			result = ((speed * 221) * 90.0) / 100.0;
		} else if (speed == 9) {
			result = ((speed * 221) * 80.0) / 100.0;
		} else if (speed == 10) {
			result = ((speed * 221) * 77.0) / 100.0;
		}
		return result;
	}

	public int workingItemsPerMinute(int speed) {
		return (int) (productionRatePerHour(speed) /60.0);
	}
}
