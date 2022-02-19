package lesson7;

class Box {
	private Object obj;

	public Object get() {
		return obj;
	}

	public void set(Object obj) {
		this.obj = obj;
	}
}

class BoxWrapper {
	private Box box;

	public BoxWrapper() {
		box = new Box();
	}

	public String get() {
		return (String) box.get();
	}

	public void set(String obj) {
		this.box.set(obj);
	}
}
	public class WrapperApplBox {

		public static void main(String[] args) {
			/*-
			Box box = new Box();
			box.set(new Integer(123));
			//box.set("123"); //lead to the runtime error
			int i = (Integer) box.get();
			//box.set("dfg"); // work
			//String i = (String) box.get(); // work
			System.out.println("i= " + i);
			*/
			//
			
			BoxWrapper box = new BoxWrapper();
			//box.set(new Integer(124)); //compile error
			box.set("19");
			//int i = (Integer) box.get();  //compile error
			String i = box.get();
			System.out.println("i= " + i);
			/**/			
		}
	}