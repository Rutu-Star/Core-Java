package collection_vector_demo;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args)
	{
		Vector v=new Vector();
	
		System.out.println(v.capacity());
		System.out.println(v.size());

		v.add(100);
		v.add(100);
		v.add(99);
		v.add(null);
		v.add(null);
		v.add(55.04);
		v.add(true);
		v.add("rutu");
		v.add('R');
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add("Sandhya");
		v.add(4550);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.addElement(45);
		System.out.println(v);
		System.out.println(v.contains("rutu"));
		
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(100);
		v1.add(100);
		v1.add(999);
		System.out.println(v.containsAll(v1));
		System.out.println(v.addAll(0, v1));
		System.out.println(v);



		
		
		



		
		
		
	}

}
