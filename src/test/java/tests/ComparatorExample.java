package tests;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample implements Comparable {
	int sid;
	String name;
	static String college="JSS";

	ComparatorExample(int sid, String name,String college) {
		this.sid = sid;
		this.name = name;
		this.college=college;
	}

//	public int compareTo(Object o1) {
//		if (o1 instanceof ComparatorExample) {
//			ComparatorExample ce1 = (ComparatorExample) o1;
//			return this.name.compareTo(ce1.name);
//		}
//		return 0;
//	}
//	
	public int compareTo(Object o1) {
		if (o1 instanceof ComparatorExample) {
			ComparatorExample ce1 = (ComparatorExample) o1;
			return this.name.compareTo(ce1.name);
		}
		return 0;
	}
	


	@Override
	public String toString() {
		return "ComparatorExample [sid=" + sid + ", name=" + name + ", college=" + college + "]";
	}

	public static void main(String[] args) {
		TreeSet tl = new TreeSet();
		tl.add(new ComparatorExample(0, "kritika", college));
		tl.add(new ComparatorExample(2, "Amit", college));
		tl.add(new ComparatorExample(1, "Prakash", college));
		tl.add(new ComparatorExample(9, "Sanju", college));
		tl.add(new ComparatorExample(7, "Garima", college));
		tl.add(new ComparatorExample(6, "Subhi", college));
		System.out.println(tl);
		Iterator it = tl.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

	}

}
