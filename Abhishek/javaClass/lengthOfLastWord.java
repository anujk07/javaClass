package javaClass;

public class lengthOfLastWord {
	public int lenghtOfLastWord(String s) {
		int len = 0;
		String x = s.trim();
		for(int i = 0; i<x.length(); i++) {
			if(x.charAt(i) == ' ')
				len = 0;
			else len++;
		}
		return len++;
	}

	public static void main(String[] args) {
		String input = "Hello world";
		lengthOfLastWord  gfg = new lengthOfLastWord();
		System.out.println(gfg.lenghtOfLastWord(input));
		
		

	}

}
