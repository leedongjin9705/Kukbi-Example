package chap07.sec012;

public class Child extends Parent{
	public String name;
	
	public Child() {
		this("이동진");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}

}