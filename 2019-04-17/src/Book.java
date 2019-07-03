
public class Book {
protected String title;
protected String ISBN;
public Book(String title,String isbn) {
	this.title=title;
	this.ISBN=isbn;
}

public String getISBN() {
	return ISBN;
}
public String getTitle() {
	return title;
}

public String toString() {
	return ("タイトル"+this.getTitle()+"(isbn = "+this.getISBN()+")");
}
public static void main(String[] args) {
	Book[] books = new Book[6];
	books[0]= new Book ("ミステリと言う勿れ" , "978-4098704064");
			books[1]= new Book ("学習まんが 別巻 世界遺産学習事典","978-4052044434");
			books[2]= new Book ("学習まんが NEW日本の歴史01 国の成り立ち","978-4052035296");
			
	Manga m0 = new Manga ("ダンジョン飯","978-4047351318");
	m0.setVolumeNumber("6");
	books[3]=m0;
	
	Manga m1 = new Manga ("ダンジョン飯","978-4047351318");
	m1.setVolumeNumber("6");
	books[4]=m1;
	Manga m2 = new Manga ("ダンジョン飯","978-4047351318");
	m2.setVolumeNumber("6");
	books[5]=m2;
	
	for (int i=0;i<books.length;i++) {
		System.out.println(books[i]);
	}
}
}
