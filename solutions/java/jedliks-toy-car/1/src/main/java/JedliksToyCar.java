public class JedliksToyCar {
	int distance = 0;
	int battery = 100;
	public static JedliksToyCar buy() {
		JedliksToyCar jedliksToyCar = new JedliksToyCar();
		return jedliksToyCar;
	}

	public String distanceDisplay() {
		return "Driven " + distance + " meters";
	}

	public String batteryDisplay() {
		return (battery > 0) ? "Battery at " + battery + "%" : "Battery empty";
	}

	public void drive() {
        if (battery > 0 ){
            distance += 20;
		    battery--;
        }
	}
}
