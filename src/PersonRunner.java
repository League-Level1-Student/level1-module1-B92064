
public class PersonRunner {
public static void main(String[] args) {
	Person joe = new Person();
	Person bob = new Person();
	Person jack = new Person();
	joe.setName("Joe");
	joe.setSuperpower("Fire breathing dragon");
	bob.setName("Bob");
	bob.setSuperpower("freezing power");
	jack.setName("Jack");
	jack.setSuperpower("Flying");
	System.out.println(bob);
	System.out.println(jack);
	System.out.println(joe);
}
}
