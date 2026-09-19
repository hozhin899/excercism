class Badge {
	public String print(Integer id, String name, String department) {
		String newId = "";
		if (id != null)
			newId = String.format("[%d] - ", id);
		if (department == null)
			department = "owner";
		return String.format("%s%s - %s", newId, name, department.toUpperCase());
	}
}
