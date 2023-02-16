import java.time.LocalDate;

public class BookTest {

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
	 
		bookId3=10;
		bookId2=2000;
		bookId1=-90;
		
		
		System.out.println("--------------------");
		System.out.println("Book Number  : "+bookId1);
		System.out.println("Book Name    : "+bookName1);
		System.out.println("Book Author  : "+authorName2);
		System.out.println("Book Price   : "+bookPrice1);
		System.out.println("Published on : "+bookPublishingDate1);
	
		System.out.println("--------------------");
		System.out.println("Book Number  : "+bookId1);
		System.out.println("Book Name    : "+bookName2);
		System.out.println("Book Author  : "+authorName2);
		System.out.println("Book Price   : "+bookPrice2);
		System.out.println("Published on : "+bookPublishingDate2);
	
		System.out.println("--------------------");
		System.out.println("Book Number  : "+bookId3);
		System.out.println("Book Name    : "+bookName2);
		System.out.println("Book Author  : "+authorName3);
		System.out.println("Book Price   : "+bookPrice3);
		System.out.println("Published on : "+bookPublishingDate1);
	
		
	}

}
