
public class ExampleBook {

	String bookname;
	String bookwritername;
	int pagenumber;
	
			
	public int ShowPageNumber() {
		
	   return pagenumber;
			
	}	
		
	
	public void ShowBook() {
		
		System.out.println("Rapor...");
		
		System.out.println("-----------------");
		
		System.out.println(("The name of the book : ") +(bookname));
		
		System.out.println(("The writer of the book name : ") + (bookwritername));
		
		System.out.println(("The book of the page number : ") + (pagenumber));
		
		System.out.println();
	}
	public static void main(String args[]) {
		
		ExampleBook book1 = new ExampleBook();
		ExampleBook book2 = new ExampleBook();
		
		book1.bookname = ("learning program");
		book1.bookwritername =("yasar kemal");
		book1.pagenumber = 512;
		
		book2.bookname =("my life");
		book2.bookwritername =("engin ayna");
		book2.pagenumber = 26;
		
	    book1.ShowBook();
		book2.ShowBook();
		
		
	}
}
