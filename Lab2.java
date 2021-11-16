package lab2;
import java.util.*;
public class Lab2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,String> hmap = new HashMap<String,String>();
		Map<String,String> tmap = new TreeMap<String,String>();
		String state,cap;
		int ch;
		while(true) {
			System.out.println("1. Insert data\n2. Display HashMap\n3. Display TreeMap\n4. Sort HashMap");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter State: ");
				state = sc.next();
				System.out.println("Enter Capital: ");
				cap = sc.next();
				hmap.put(state, cap);
				tmap.put(state, cap);
				break;
			case 2:
				System.out.println("******HashMap*****");
				for(Map.Entry<String,String> e:hmap.entrySet()) {
					System.out.println("State: "+e.getKey()+"-->"+e.getValue());
				}
				break;
			case 3:
				System.out.println("******TreeMap*****");
				for(Map.Entry<String,String> e:tmap.entrySet()) {
					System.out.println("State: "+e.getKey()+"-->"+e.getValue());
				}
				break;
			case 4:
				hmap = new TreeMap<String,String>(hmap);
				System.out.println("******Sorted HashMap*****");
				for(Map.Entry<String,String> e:hmap.entrySet()) {
					System.out.println("State: "+e.getKey()+"-->"+e.getValue());
				}
			}
		}
	}
}
