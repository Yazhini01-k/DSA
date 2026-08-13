package arrayQuestion;

public class largestString {
	public static void main(String[] args) {
		String str ="i am yazhini";
		String words[] = str.split(" ");
		String largest =" ";
		for(String word : words) {
			if(word.length() > largest.length()) {
				largest = word;
			}
		}
		System.out.print("largest String :" + largest);
	}
}
