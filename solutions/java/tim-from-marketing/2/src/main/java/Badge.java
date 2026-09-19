class Badge {
	public String print(Integer id, String name, String department) {
		String newId = "";
		if (id != null)
			newId = "[" + String.valueOf(id) + "] - ";
		if (department == null)
			department = "owner";
		return newId + name + " - " + department.toUpperCase();
	}
}
