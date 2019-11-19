
public class SecretionDecorator extends ClientDecoratorBase{

	public SecretionDecorator(IClient cl) {
		super(cl);
		cl.getMessage().setAuthor(Secretion(cl.getMessage().getAuthor()));
		cl.getMessage().setAdressed(Secretion(cl.getMessage().getAdressed()));
	}
	private String Secretion(String str) {
		String newStr="";
		for(int i=0;i<str.length();i++) {
			newStr=newStr+(int)str.charAt(i);
		}
		return newStr;
	}

}
