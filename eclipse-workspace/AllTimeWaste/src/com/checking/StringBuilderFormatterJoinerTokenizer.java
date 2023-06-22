package com.checking;

import java.util.Arrays;
import java.util.Formatter;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringBuilderFormatterJoinerTokenizer {

	public static void main(String[] args) {
		int one = 1;
		String color = "red";
		String strs = color.replace('e', 'x');
		System.out.println(strs);
		
		//string builder
		StringBuilder sb = new StringBuilder();
		
		sb.append("one = ").append(one).append(", color = ").append(color);
		System.out.println(sb);
		
		//formatter
		Formatter formatter = new Formatter();
		System.out.println(formatter.format("color = %s, one = %d",color,one));
		
		System.out.println(String.format("color = %s, one = %d", color, one));
		
		//string joiner
		StringJoiner sj = new StringJoiner(" " , "\"","\"");
		for(String s : new String[] {"sai","krishna", "gedda"})
		{
			sj.add(s);	
		}
		System.out.println(sj);
		
		//string tokenizer
		StringTokenizer st = new StringTokenizer("sai krishna gedda", " ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//splitting a string into fixed length parts
		String str = "abcdefghijklmnopqrstuvwxyz";
		int len = 5;
		String[] chunks = str.split("(?<=\\G.{" + len + "})");
		System.out.println(Arrays.toString(chunks));
		
	}

}
