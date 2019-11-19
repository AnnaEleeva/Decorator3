
public class Main {

	public static void main(String[] args) {
				
		Message mes=new Message("anya","yana","Hello");
		IClient cl1=new Client(mes);
		cl1=new EncryptionDecorator(cl1);
		cl1=new SecretionDecorator(cl1);
		cl1.sentMessage();

	}

}