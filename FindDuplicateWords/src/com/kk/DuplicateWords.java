package com.kk;


public class DuplicateWords {

	public static void main(String[] args) {
String sentance = "The quick brown fox jumped over the lazy dog and the dog slept peacefully";
String[] words = sentance.toLowerCase().split(" ");
	for(int i=0; i< words.length; i++) {
		int count=1;
		for(int j=i+1; j< words.length; j++) {
			if(words[i].equals(words[j])){
			count++;
			words[j]="0";
			}
			
		}
		if(!words[i].equals("0") && count>1) {
			System.out.println(words[i]);
			}
		}
	
	}

}
