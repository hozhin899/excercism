class NeedForSpeed {
	private int battery = 100;
	public int speed;
	public int batteryDrain;
	private int distance = 0;

	NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
	}

	public boolean batteryDrained() {
		return battery < batteryDrain;
	}

	public int distanceDriven() {
		return distance;
	}

	public void drive() {
		if (!batteryDrained()) {
			distance += speed;
			battery -= batteryDrain;
		}
	}

	public static NeedForSpeed nitro() {
		return new NeedForSpeed(50, 4);
	}
}

class RaceTrack {
	private int distance;

	RaceTrack(int distance) {
		this.distance = distance;
	}

	public boolean canFinishRace(NeedForSpeed car) {
		int possibleDistance = (100 / car.batteryDrain) * car.speed;
		return possibleDistance >= distance;
	}
}

