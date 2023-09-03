package lesson6.hw_6_1;
public class HW_6_1 {

	public static void main(String[] args) {
		Bird[] p = { new Eagle(), new Penguin(), new Chicken(), new Swallow() };

		for (int i = 0; i < p.length; i++) {
			p[i].fly();
		}
	}
}
