package complete;

public class BagTest {
	public static void main(String[] args) {
		//initialize a bag
		BagInterface<String> colorBag = new ArrayBag<String>();
		System.out.println("Initial bag size: " + colorBag.getCurrentSize());
		System.out.println("Before adding objects: isEmpty() - " + colorBag.isEmpty());
		System.out.println("Adding new objects/items to the bags ...");
		colorBag.add("red");
		colorBag.add("blue");
		colorBag.add("green");
		colorBag.add("green");
		colorBag.add("white");
		System.out.println("After adding objects: isEmpty() - " + colorBag.isEmpty());
		System.out.println("Current bag size: " + colorBag.getCurrentSize());
		System.out.println("Removing 1 existing objects ... ");
		colorBag.remove();
		System.out.println("Updated bag size: " + colorBag.getCurrentSize());
		System.out.println("Current frequency of green: " + colorBag.getFrequencyOf("green"));
		System.out.println("Adding 1 occurence of green ...");
		colorBag.add("green");
		System.out.println("Updated frequency of green: " + colorBag.getFrequencyOf("green"));
		System.out.println("Checking whether bag contains blue: " + colorBag.contains("blue"));
		System.out.println("Removing the occurence of blue ...");
		colorBag.remove("blue");
		System.out.println("Now re-checking whether bag still contains blue: " + colorBag.contains("blue"));
		System.out.println("Removing all entries from the bag ...");
		colorBag.clear();
		System.out.println("Final bag size: " + colorBag.getCurrentSize());
	}
}
