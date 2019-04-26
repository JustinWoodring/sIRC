package sirc;

public class Main {
	public static void main(String[] args) {
		if(args.length < ClientInfo.getMinArgCount()) {
			System.out.print(Messages.returnMessage(0));
			System.exit(0);
		}
		
		String[] ClientArgs = new String[ClientInfo.getArgCount()];
		for(int i = 0; i < ClientInfo.getArgCount(); i++){
			if(i < args.length) {
				ClientArgs[i] = args[i];
			}else {
				ClientArgs[i] = null;
			}
		}
		
		ClientInfo clientInfo = new ClientInfo(ClientArgs);
		UserClient client = clientInfo.connect();
	}

}