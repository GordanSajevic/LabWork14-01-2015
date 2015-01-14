import java.nio.file.attribute.AclEntry.Builder;
import java.util.Iterator;


public class Test {

	public static void main(String[] args) {
		LinkedList<Character> list = new LinkedList<Character>();
		list.add('E');	
		list.add('G');
		list.add('J');
		list.add('N');
		System.out.println(list.toString());
		list.removeAt(2);
		System.out.println(list.toString());
		System.out.println(list.getSize());
	}

}
