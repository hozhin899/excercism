import java.util.Arrays;

class BirdWatcher {
	private final int[] birdsPerDay;

	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay.clone();
	}

	public static int[] getLastWeek() {
		int[] lastWeek = new int[]{0, 2, 5, 3, 7, 8, 4};
		return lastWeek;
	}

	public int getToday() {
		return birdsPerDay[birdsPerDay.length - 1];
	}

	public void incrementTodaysCount() {
		birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
	}

	public boolean hasDayWithoutBirds() {
		for (int i = 0; i < birdsPerDay.length; i++) {
			if (birdsPerDay[i] == 0)
				return true;
		}
		return false;
	}

	public int getCountForFirstDays(int numberOfDays) {
		int result = 0;
		if (numberOfDays > birdsPerDay.length)
			return Arrays.stream(birdsPerDay).sum();
		else
			for (int i = 0; i < numberOfDays; i++)
				result += birdsPerDay[i];
		return result;
	}

	public int getBusyDays() {
		int result = 0;
		for (int i = 0; i < birdsPerDay.length; i++)
			if (birdsPerDay[i] >= 5)
				result++;
		return result;
	}
}
