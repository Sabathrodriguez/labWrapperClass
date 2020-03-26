package labWrapperClassGui;

public class DemoWrapperClass {
	public String minMax() {
//		System.out.println("Byte:");
//		System.out.println("Min:" + Byte.MIN_VALUE);
//		System.out.println("Max:" + Byte.MAX_VALUE);
//		System.out.println();
//		
//		System.out.println("Short:");
//		System.out.println("Min:" + Short.MIN_VALUE);
//		System.out.println("Max:" + Short.MAX_VALUE);
//		System.out.println();
//		
//		System.out.println("Integer:");
//		System.out.println("Min:" + Integer.MIN_VALUE);
//		System.out.println("Max:" + Integer.MAX_VALUE);
//		System.out.println();
//		
//		System.out.println("Long:");
//		System.out.println("Min:" + Long.MIN_VALUE);
//		System.out.println("Max:" + Long.MAX_VALUE);
//		System.out.println();
		return String.format("Byte:%n Min: %d%n Max: %d%n %n"
				+ " Short:%n Min: %d%n Max: %d%n %n"
				+ " Integer:%n Min: %d%n Max: %d%n %n"
				+ " Long:%n Min: %d%n Max: %d%n %n",
				Byte.MIN_VALUE, Byte.MAX_VALUE, 
				Short.MIN_VALUE, Short.MAX_VALUE,
				Integer.MIN_VALUE, Integer.MAX_VALUE,
				Long.MIN_VALUE, Long.MAX_VALUE);
	}
	
	public String toBinary(int num) {
		return String.format("Binary: %s%nOctal: %s%nHex: %s%n",
				Integer.toBinaryString(num),
				Integer.toOctalString(num),
				Integer.toHexString(num));
		
	}
	
	public String charProperties(char ch) {
		String sb1 = "";
		String sb2 = "";
		String sb3 = "";
		
		if (Character.isWhitespace(ch)) {
			sb1 += "white space: true";
		} else {
			sb1 += "white space: " + String.valueOf(false);
		}
		
		if (Character.isDigit(ch)) {
			sb2 += "digit: true";
		} else {
			sb2 += "digit: " + String.valueOf(false);
		}
		
		if (Character.isLetter(ch)) {
			int oppositeChar = Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);	
			sb3 += String.format("letter: %c | %c%n", ch, oppositeChar);
		} else {
			sb3 += "letter: " + String.valueOf(false);
		}
		

		return String.format("%s%n%s%n%s%n", sb1, sb2, sb3);
	}

}
