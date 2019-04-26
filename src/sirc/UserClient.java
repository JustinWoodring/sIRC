package sirc;

import org.kitteh.irc.client.library.Client;
import org.kitteh.irc.client.library.feature.auth.SaslPlain;

class UserClient {
	private ClientInfo info;
	private Client client;
	
	UserClient(ClientInfo info){
		this.info = info;
		
		Client tempClient = Client.builder().nick(this.info.getUser()).server().host(this.info.getNetwork()).then().buildAndConnect();
		if(info.getPassword()!=null) {
			tempClient.getAuthManager().addProtocol(new SaslPlain(tempClient, this.info.getUser(), this.info.getPassword()));
		}
		tempClient.addChannel(this.info.getChannel());
		this.client = tempClient;
		
		this.mainloop();
	}

	private void mainloop() {
		//FIXME
		this.client.sendMessage(this.info.getChannel(), "testing");
		System.out.print("You connected fool!");
		//Wait is needed for connection.
	}
}
