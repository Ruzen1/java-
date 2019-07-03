
public class Manga extends Book{
	public Manga(String title, String isbn) {
		super(title, isbn);
	}
	protected String volumeNumber;
	public String getVolumeNumber() {
		return this.volumeNumber;
	}
	public void setVolumeNumber(String n) {
		this.volumeNumber=n;
	}
	
	public Manga (String title, String isbn,String vol_num) {
		super(title,isbn);
		this.volumeNumber=vol_num;
	}
	@Override
	public String toString() {
		return super.toString()+"‘æ"+this.getVolumeNumber()+"Šª";
	}
 }
