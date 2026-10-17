class SqueakyClean {
	static String clean(String identifier) {
		char[] chars = identifier.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < chars.length; i++) {
			if (Character.isWhitespace(chars[i])) {
				sb.append('_');
				continue;
			}

			if (chars[i] == '-') {
				sb.append(Character.toUpperCase(chars[i + 1]));
				i++;
				continue;
			}

			if (Character.isDigit(chars[i])) {
				switch (chars[i]) {
					case '4':
						sb.append('a');
						break;
					case '3':
						sb.append('e');
						break;
					case '0':
						sb.append('o');
						break;
					case '1':
						sb.append('l');
						break;
					case '7':
						sb.append('t');
						break;
				}
			}

			if (Character.isLetter(chars[i])) {
				sb.append(chars[i]);
			}
		}

		return sb.toString();
	}
}
