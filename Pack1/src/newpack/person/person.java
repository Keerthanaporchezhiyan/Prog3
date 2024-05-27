package newpack.person;
import newpack.country.Country;
import newpack.state.state;
public class person {

	private String person;
	private Country c1;
	private state s1;
	private int tax;
	public person(String person, Country c1, state s1) {
		this.person = person;
		this.c1=c1;
		this.s1=s1;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public Country getC1() {
		return c1;
	}
	public void setC1(Country c1) {
		this.c1 = c1;
	}
	public state getS1() {
		return s1;
	}
	public void setS1(state s1) {
		this.s1 = s1;
	}
	public String toString() {
		return "person [person=" + person + ", c1=" + c1 + ", s1=" + s1 + "]";
	}
	public static void main(String[] args) {
		Country co = new Country("India");
		state st = new state("Ahmedabad");
		person p = new person("Rohan",co,st);
		System.out.println(p.toString());

	}

}
