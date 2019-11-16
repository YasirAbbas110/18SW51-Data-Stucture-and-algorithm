import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample
{
	public static void main(String[] args) {
		LinkedList<String> animal = new LinkedList<>();
		animal.add("Lion"); // 	Appends the specified element to the end of this list.
		animal.add("tiger");
		animal.addLast("Cat");
		animal.addFirst("hourse");
		animal.add(2,"dog");
		animal.offer("Sarwan");
		animal.add("human");
		animal.add("Yamin");
		System.out.println(animal);
		animal.remove("human");
		animal.remove(2);
		System.out.println(animal);
		System.out.println(animal.peek());
		System.out.println(animal.peekFirst());
		System.out.println(animal.peekLast());
		System.out.println(animal.poll());
		System.out.println(animal);
		System.out.println(animal.pop());
		animal.push("Awais");
		System.out.println(animal.poll());
	}
}