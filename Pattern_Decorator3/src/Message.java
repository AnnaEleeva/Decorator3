
public class Message {
	private String author;
	private String adressed;
	private String text;

	Message(String author, String adressed, String text) {
		this.text = text;
		this.author = author;
		this.adressed = adressed;
	}

	 String getAuthor() {
		return author;
	}

	 void setAuthor(String str) {
		author = str;
	}

	 String getAdressed() {
		return adressed;
	}

	 void setAdressed(String str) {
		adressed = str;

	}

	 String getText() {
		return text;
	}

	 void setText(String str) {
		text = str;
	}

}
