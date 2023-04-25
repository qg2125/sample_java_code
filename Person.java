public class Person {
	private String last;
	private String first;
	private String middle;


	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}

	public String getFirst(){return first;}
	public String getLast(){
		return last;
	}
	public String getMiddle(){
		return middle;
	}
}
