package exp1;
import java.util.*; 
public class HashTable {
	 public static void main(String args[]){  
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(1201,"Lasya");  
		  hm.put(1202,"Sowji");  
		  hm.put(1203,"Rishitha");  
		  hm.put(1204,"Sita");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  	
}