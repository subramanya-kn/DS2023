import java.time.LocalDate;

public class BookTest2 {

	public static void main(String[] args) {
		
		int bookId1=100;
		String bookName1="Java Programming Language";
		String authorName1="James Gosling";
		float bookPrice1=890.50f;
		LocalDate bookPublishingDate1 = LocalDate.of(2012,5,30);
	 	
		int bookId2=101;
		String bookName2="Oracle PLSQL";
		String authorName2="Scott M";
		float bookPrice2=590.50f;
		LocalDate bookPublishingDate2= LocalDate.of(2009,3,25);
	 
		
		int bookId3=102;
		String bookName3="Unix Shell Scripting"; 
		String authorName3="Vishhal D";
		float bookPrice3=690.50f;
		LocalDate bookPublishingDate3= LocalDate.of(2023,3,9);
	 
		printBook(bookId1,bookName1,authorName1,bookPrice3,bookPublishingDate1);
		printBook(bookId2,bookName1,authorName2,bookPrice2,bookPublishingDate2);
		printBook(bookId3,bookName3,authorName1,bookPrice3,bookPublishingDate1);
		
	
		
	}
	public static void printBook(int a, String b, String c, float d, LocalDate e) {
		
		System.out.println("--------------------");
		System.out.println("Book Number  : "+a);
		System.out.println("Book Name    : "+b);
		System.out.println("Book Author  : "+c);
		System.out.println("Book Price   : "+d);
		System.out.println("Published on : "+e);
	
	}

}
