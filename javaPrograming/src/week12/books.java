package week12;
   
public class books {
	String title;
	String author;
	void show () {System.out.println(title + " " + author); }
	
	public books() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	public books (String title) {
		this(title, "작자미상");
	}
	public books (String title, String author) {
		this.title = title; 
		this.author = author;
	}
	public static void main(String[] args) {
		books littlePrince = new books("어린왕자","생텍쥐페리");
		books loveStory = new books("춘향전");
		books emptybook = new books();
		loveStory.show();
	}
}

