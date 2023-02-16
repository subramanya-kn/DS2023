import java.time.LocalDate;

public class BookTest3 {
	public static void main(String[] args) {

		Book book1 = new  Book(101, "JPL", "JG", 890, LocalDate.of(2012, 5, 9));
		Book book2 = new  Book(104, "PLSQL", "SM", 590, LocalDate.of(2009, 5, 9));		
		Book book3 = new  Book(103, "USS", "YPK", 690, LocalDate.of(2023, 3, 13));
		
		
		book1.printBook();
		book2.printBook();
		book3.printBook();

		System.out.println("---------");
		System.out.println("book1 is stored at :" + book1);
		System.out.println("book2 is stored at :" + book2);
		System.out.println("book3 is stored at :" + book3);

	}

}

class WristWatch {

}

/*
 * 
 * 
 * Naming Convention
 * 
 * ClassName <- WristWatch, DrivingLicense
 * 
 * fieldName <- secondArm, hourArm, minuteArm rollNumber
 * 
 * methodName<- tickTick() { } setLookAndFeel() {} CONSTANTS pack1.pack2
 * 
 * 
 * 
 * 
 * 
 */
//class is a design of an object			vs	an object is an instance a class	
class Book {
	private int bookId; // FILEDS / data member
	private String bookName;
	private String authorName;
	private float bookPrice;
	private LocalDate bookPublishingDate;

	// METHODS / member functions
	public Book(int bookId, String bookName, String authorName, float bookPrice, LocalDate bookPublishingDate) {
		System.out.println("setting inital book details....");
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
		this.bookPublishingDate = bookPublishingDate;
	}

	public void printBook() {
		System.out.println("--------------------");
		System.out.println("Book Number  : " + bookId);
		System.out.println("Book Name    : " + bookName);
		System.out.println("Book Author  : " + authorName);
		System.out.println("Book Price   : " + bookPrice);
		System.out.println("Published on : " + bookPublishingDate);
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", bookPrice="
				+ bookPrice + ", bookPublishingDate=" + bookPublishingDate + "]";
	}
	
}

/*
 * 
 * complex number real imag 2 5 = 2+5i
 * 
 * 3 7 = 3+7i ----------------- 5 12 = 5+12i
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
