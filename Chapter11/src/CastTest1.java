class Asia {
	public String country = "Asia";
	public String getC() {
		return country;
	}
}
class China extends Asia {
	public String country = "China";
	public String getC() {
		return super.country;
	}
}
class Korea extends Asia {
	public String country = "Korea";
	public String getC() {
		return super.getC();
	}
}
public class CastTest1 {

	public static void main(String[] args) {
		Asia naC = new China();
		Asia naK = new Korea();
		System.out.println(naC.getC());
		System.out.println(naK.getC());
	}

}
