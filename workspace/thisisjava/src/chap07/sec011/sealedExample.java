package chap07.sec011;

public class sealedExample {

	public static void main(String[] args) {
		Person p = new Person();
		p.work();
		
		Employee e = new Employee();
		e.work();
		
		Manager m = new Manager();
		m.work();
		
		Director d = new Director();
		d.work();

	}

}
