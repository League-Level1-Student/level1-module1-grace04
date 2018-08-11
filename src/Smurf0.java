
public class Smurf0 {
	public static void main(String[] args) {
		Smurf hs = new Smurf("Handy");
		hs.eat();
		System.out.println(hs.getName());
		Smurf ps = new Smurf("Papa");
		System.out.println(ps.getName());
		System.out.println(ps.getHatColor());
		System.out.println(ps.isGirlOrBoy());
		Smurf sf = new Smurf("Smurfette");
		System.out.println(sf.getName());
		System.out.println(sf.getHatColor());
		System.out.println(sf.isGirlOrBoy());
	}
}
