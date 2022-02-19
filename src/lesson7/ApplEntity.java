package lesson7;

interface Entity {
	void id();
}
class OneEntity implements Entity {
public void id() {
	System.out.println("OneEntity : id()");
}}
class MyEntity<T extends Entity> {
	public void run(T entity) {
		entity.id();
}}
public class ApplEntity {

	public static void main(String[] args) {
		MyEntity<OneEntity> me = new MyEntity<>();
        me.run(new OneEntity());
	}

}