
public class Book {
	private int bookid;
	private String bookname;
	private String author;
	public class Lesson{
		public void m1() {
			System.out.println("your id is: "+bookid);
		}
		
		
	}
	public Book() {
		System.out.println("Defalut Constructor");
	}
	public Book(int bookid,String bookname,String author) {
		this.bookid=bookid;
		this.bookname=bookname;
		this.author=author;
		
	}
	public String toString() {
		return "Book id :"+this.bookid +"\nBook Name :"+this.bookname+"\nAuthor Name :"+this.author;
	}
	

}
