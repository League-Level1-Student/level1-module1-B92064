
public class SmurfGang {
public static void main(String[] args) {
	Smurf HSmurf = new Smurf("Handy");
	Smurf PSmurf = new Smurf("Papa");
	Smurf Smurfette = new Smurf("Smurfette");
	HSmurf.eat();
System.out.println(HSmurf.getName());	
System.out.println(PSmurf.getName());
System.out.println(PSmurf.getHatColor());	
System.out.println(PSmurf.isGirlOrBoy());
System.out.println(Smurfette.getName());
System.out.println(Smurfette.getHatColor());	
System.out.println(Smurfette.isGirlOrBoy());
}
}
