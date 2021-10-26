package ex9no28;

import java.util.*;

public class ex9no28 {  //  502p
	public static void main(String[] args) {
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[10];
		
		for(int i = 0; i < number.length ; i++) {
//			System.out.println(number[i] = (int)(Math.random() * 10));
			System.out.print(number[i] = rand.nextInt(10));
		}
		System.out.println();
		
		for(int i =0; i < number.length ; i++) 
			counter[number[i]]++;
		
		for(int i =0; i < counter.length ; i++)
			System.out.println(i + "ÀÇ °³¼ö : " + PrintGraphics('#', counter[i]) + " " + counter[i]);
		
	}

private static String PrintGraphics(char ch, int value) {
	char[] bar = new char[value];
	
	for(int i = 0; i < bar.length; i++)
		bar[i] = ch;
	return new String(bar);
}
}

