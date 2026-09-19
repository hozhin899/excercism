import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
	public LocalDateTime schedule(String appointmentDateDescription) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
		return LocalDateTime.parse(appointmentDateDescription, formatter);
	}

	public boolean hasPassed(LocalDateTime appointmentDate) {
		return appointmentDate.isBefore(LocalDateTime.now());
	}

	public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
		LocalTime time = appointmentDate.toLocalTime();
		return !time.isBefore(LocalTime.of(12, 0)) && time.isBefore(LocalTime.of(18,0));
	}

	public String getDescription(LocalDateTime appointmentDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
		return "You have an appointment on " + appointmentDate.format(formatter) + ".";
	}

	public LocalDate getAnniversaryDate() {
		return LocalDate.of(LocalDate.now().getYear(), 9, 15);
	}
}