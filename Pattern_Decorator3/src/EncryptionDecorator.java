
public class EncryptionDecorator extends ClientDecoratorBase{

	public EncryptionDecorator(IClient cl) {
		super(cl);
		cl.getMessage().setText(Encrypte(cl.getMessage().getText()));
		
	}
	private String Encrypte(String str){
		return "*encrypted* "+str+" *encrypted*";
	}
	

}
