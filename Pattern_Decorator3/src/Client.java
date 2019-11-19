
public class Client implements IClient {
	private Message mes;
	
	Client(Message mes){
		this.mes=mes;
		
	}

	public Message getMessage() {
		return mes;
	}

	public void sentMessage() {
		System.out.println("Message"+"\nAuthor "+mes.getAuthor()+"\nAdressed "+mes.getAdressed()+"\nText "+mes.getText());
	};

}
