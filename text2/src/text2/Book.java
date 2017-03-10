package text2;

	public class Book {
		private String name, isbn;
	public Book(String name1,String isbn1){
		name = name1;
		isbn = isbn1;
	}
	public void setName(String name1){
		name=name1;
	}
	public String getNane(){
		return name;
	}
	public void setIsbn(String isbn1){
		isbn=isbn1;
	}
	public String getIsbn(){
		return isbn;
	}

	}
