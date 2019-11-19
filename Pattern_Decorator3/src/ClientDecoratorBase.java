
public class ClientDecoratorBase implements IClient {
	private IClient Decoratee;

	public ClientDecoratorBase(IClient cl) {
		Decoratee=cl;
	}

	@Override
	public Message getMessage() {
		return Decoratee.getMessage();
	}

	@Override
	public void sentMessage() {
		Decoratee.sentMessage();
		
	}

}
