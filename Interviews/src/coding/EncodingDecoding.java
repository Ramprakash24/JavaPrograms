package coding;
// Interview question for BlackRock San Francisco

public class EncodingDecoding {
	public static void main(String args[]) {
		String inputString = "Ramprakash";
		
		EncodingDecoding ed = new EncodingDecoding();
		String encodedString = ed.encodeFn(inputString);
		System.out.println(encodedString);
		String decodedString = ed.decodeFn(encodedString);
		System.out.println(decodedString);
	}

	private String decodeFn(String encodedString) {
		StringBuilder decodedString = new StringBuilder();
		String reversedString = new StringBuilder(encodedString).reverse().toString();
		for (int i = 0; i< reversedString.length(); i++) {
			char c = reversedString.charAt(i);
			c -= i;
			c /= 2;
			decodedString.append(c);
		}
		return decodedString.toString();
	}

	private String encodeFn(String inputText) {
		StringBuilder encodedString = new StringBuilder();
		for(int i = 0 ;i < inputText.length(); i++) {
			char c = inputText.charAt(i);
			encodedString.append(c += c + i);
		}
		return encodedString.reverse().toString();
	}
}
