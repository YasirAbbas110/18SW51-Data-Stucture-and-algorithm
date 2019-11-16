import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample
{
	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<>();
		animal.add("Lion"); // 	Appends the specified element to the end of this list.
		animal.add("tiger");
		animal.add("Cat");
		animal.add("hourse");
		animal.add("dog");
		animal.add("human");
		animal.add("Yamin");
		System.out.println(animal);
		animal.add(3,"Elephent"); //add method Inserts the specified element at the specified position in this list
		animal.add(1,"Elephent");
		animal.add(0,"Elephent");
		System.out.println(animal);
		System.out.println(animal.contains("Cat")); // 	Returns true if this list contains the specified element.
		animal.ensureCapacity(10);
		System.out.println(animal.size());
		System.out.println(animal.get(5));
		//System.out.println(animal.indexOf("Cat"));​
		System.out.println(animal.isEmpty());
		System.out.println(animal.iterator());
		animal.remove(3);
		animal.removeRange(1,3);
		System.out.println(animal);
		animal.set(2,"Donkry");
		System.out.println(animal.size());
		removeAll(animal);
		System.out.println(animal.size());
	}
}