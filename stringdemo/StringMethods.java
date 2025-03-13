package stringdemo;

public class StringMethods {
	public static void main(String[] args)
	{
		String s1="Rutuja";
		System.out.println("s1 : "+s1); // Rutuja
		
		//here we just use concat method to combine two string 
		//or we not assign new value to s1 
		System.out.println("s1.concat(\" Kumbhar\") : " +s1.concat(" Kumbhar")); // Rutuja Kumbhar 
		System.out.println("s1 : "+s1); // Rutuja
		
		//her we assign new value to s1 which form by combining s1 and "Kumbhar" 
		//so new object created in string pool is which store "rutuja Kumbhar" and point by s1
		//"Rutuja" is still there in String Pool but not point by s1 
		s1=s1.concat(" Kumbhar");
		System.out.println(s1); // Rutuja Kumbhar
	

		//Here s2 is point to "Rutuja" which already in String Pool not created new object 
		String s2="Rutuja";
		
		//the references of both s1 nd s2 are different 
		//== operator work with memory location rather than content(Value)
		System.out.println("s1==s2 : "); 
		System.out.println(s1==s2); // False

		//here s3 point to same as s2 
		String s3="Rutuja";
		System.out.println("s2: "+s2); // Rutuja
		System.out.println("s3: "+s3); // Rutuja

		//the memory location of both is same 
		System.out.println("s2==s3 : "); // True

		System.out.println(s2==s3); // True
		
		//here "Rutuja" already store in String Pool it does not change her memory location
		//thats why s2 and "Rutuja" literal points same memory location
		System.out.println("s2==\"Rutuja\" : " );
		System.out.println(s2=="Rutuja"); // True
		
		String s4="Sayali";
		System.out.println("s4==\"Sayali\" : "); 
		System.out.println(s4=="Sayali"); //true
		System.out.println(); 
		System.out.println(); 

		System.out.println("String creating by new keyword "); 


		//now string created by using new where new object created 
		//either  it contend same value or not 
		String str1=new String("String");
		String str2=new String("String");
		System.out.println("Str :"+str1);
		System.out.println("str1==str2 :");
		System.out.println(str1==str2);// false  coz having different location
		
		//euals uses to comapre contend of string not location 
		System.out.println("str1.equals(str2):");
		System.out.println(str1.equals(str2));//true 
		System.out.println(); 
		System.out.println(); 

		
		//compareto() to comapre letter with lexiographically manner (by unicode value)
		//-ve value if 2nd string greater letter than 1st
		//+ve value if 2nd string lesser than 1st (alphabets)
		//0 if both values are same
		
		
		String str3="AAA";
		String str4="AAA";
		System.out.println("St3: "+str3+" str4 :"+str4);
		System.out.println("str3.compareTo(str4) : "+str3.compareTo(str4));//0
		String str6="BAA";
		System.out.println("str6 : "+str6);
		System.out.println("str3.compareTo(str6) : "+str3.compareTo(str6));//-1
		String str7="CAA";
		System.out.println("str7 : "+str7);
		System.out.println("str7.compareTo(str6) : "+str7.compareTo(str6));//1
		System.out.println("str3.compareTo(str7) : "+str3.compareTo(str7));//-2
		System.out.println("str7.compareTo(str3) : "+str7.compareTo(str3));//2

		String str8="Kriti";
		String str9="Sidharth";
		System.out.println("str8 : "+str8+" str9 : "+str9);
		System.out.println("str8.compareTo(str9) : "+str8.compareTo(str9));//-8
		
		String str10="AAAA";
		String str11="aAAA";
		String str12="aaa";
		String str13="AAAAAA";
		System.out.println("str10 : "+str10+" str11 : "+str11+" str12 : "+str12 +" str13 : "+str13);
		System.out.println("str10.compareTo(str3) : "+str10.compareTo(str3));//1 here leght of AAAA is greater than AAA
		System.out.println("str13.compareTo(str3) : "+str13.compareTo(str3));//3
		System.out.println("str11.compareTo(str3) : "+str11.compareTo(str3));//32 here a=97 and A=65 (97-65)
		System.out.println("str12.compareTo(str3) : "+str12.compareTo(str3));//32




		

		
		

		


		//toLower and toUpper
		System.out.println();
		String s5="Sakshi";
		System.out.println("Before any operation :");
		System.out.println("s5 :"+s5);
		s5=s5.toLowerCase();
		System.out.println("After toLower() operation :");
		System.out.println("s5 :"+s5);
		s5=s5.toUpperCase();
		System.out.println("After toUpper() operation :");
		System.out.println("s5 :"+s5);

		System.out.println();
		System.out.println("At 0 index : "+s5.charAt(0));
		System.out.println("At 1 index : "+s5.charAt(1));
		System.out.println("At 2 index : "+s5.charAt(2));
		System.out.println("At 3 index : "+s5.charAt(3));
		System.out.println("At 4 index : "+s5.charAt(4));
		System.out.println("At 5 index : "+s5.charAt(5));
		
		System.out.println();
		System.out.println();

		//trim method 
		String string1="		Rutuja";
		System.out.println("string1 : ");
		System.out.println(string1);
		System.out.println("Using trim method : ");
		System.out.println(string1.trim());
		System.out.println();

		String string2="		Rutuja Kumbhar		";	
		System.out.println("string2 : ");
		System.out.println(string2);
		System.out.println("Using trim method : ");
		System.out.println(string2.trim());
		
		
		//combine charAt() and toUpper
		String string3="Sonal";
		System.out.println("string3.charAt(3).toUpper() : "+string3.toUpperCase().charAt(3));
	    System.out.println(Character.toUpperCase(string3.charAt(3)));
	    System.out.println();
	    System.out.println();
	    
	    
	    //repalce method 
	    System.out.println("Replace Method :");

	    String a1="Hello";
	    String b1="Hello";
	    System.out.println("a1 : "+a1 +" b1 : "+b1);

	    System.out.println("a1==b1 : ");
	    System.out.println(a1==b1);//true
	    
	    a1=a1.replace('e' , 'a');
	    System.out.println("a1==b1 : ");
	    System.out.println(a1==b1);//false

	    System.out.println("a1 :"+a1);//Hallo
	    
	    //index method 
	    String a2="Rutuja Sanjay Kumbhar";
	    System.out.println("Index methods : ");
	    System.out.println("Index of 'a' character :"+a2.indexOf('a'));
	    System.out.println("Index of last 'a' character :"+a2.lastIndexOf('a'));
	    System.out.println(a2.indexOf("Sanjay"));
	    System.out.println();

	    
	    //isempty
	    String a3="";
	    String a4=" ";
	    System.out.println("IsEmpty methods : ");
	    System.out.println("a2 : "+a2+" a3 : "+a3+" a4 : "+a4);

	    System.out.println("a2 : " +a2.isEmpty());
	    System.out.println("a3 : " +a3.isEmpty());
	    System.out.println("a4 : " +a4.isEmpty());
	    
	  



	    
	  



		





	}

}
