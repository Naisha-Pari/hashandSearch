package hashmap;

import java.util.HashMap;

public class hashfreq {
	 public static void main(String[] args) {
	      String str = "to be or not to be";
	 
	      HashMap<Character,Integer> charFreqMap = new HashMap<>();
	      //iterate
	      for(int i= 0 ; i< str.length() ; i++) {
	          Character ch=str.charAt(i);
	          //count 1 if hashmap do not have a character.
	         if(charFreqMap.containsKey(ch)) {
	            int count = charFreqMap.get(ch);
	            charFreqMap.put(ch,count+1);// if already have character in hashmap then increment it by 1.
	         } else {
	             charFreqMap.put(ch,1);
	         }
	      }
	      System.out.println(charFreqMap);
	   }
	}
	 
 
