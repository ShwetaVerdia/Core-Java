
public class Tenor extends Singer{
	public String sing() {
		return "fa";
	}
public static void main(String[] args) {
	Tenor t = new Tenor();
	Singer s = new Tenor();
	System.out.println(t.sing() + " " + s.sing());
}
}

class Singer{
	public String sing(){
		return "la";
	}
}