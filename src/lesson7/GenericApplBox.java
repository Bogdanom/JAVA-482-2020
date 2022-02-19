package lesson7;

class BoxGen<T> {
	private T obj;

	public T get() {
		return obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}
}

public class GenericApplBox {

	public static void main(String[] args) {
				
		BoxGen<String> box = new BoxGen<>();
		//box.set(new Integer(124)); //compile error
		box.set("18");
		//int i = (Integer) box.get();  //compile error
		String i = box.get();
		System.out.println("i= " + i);
	}
}