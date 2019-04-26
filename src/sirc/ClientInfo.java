package sirc;

class ClientInfo {
	private String channel;
	private String network;
	private String user;
	private String password;
	//private boolean ssl;
	//private int port;
	
	ClientInfo(String[] ClientArgs){
		this.channel = ClientArgs[0];
		this.network = ClientArgs[1];
		this.user = ClientArgs[2];
		this.password = ClientArgs[3];
		//this.ssl = (ssl.equals("-f")) ? false : true;
		//this.port = (Integer.parseInt(port)!=0) ? Integer.parseInt(port) : 6697;
	}
	
	UserClient connect() {
		return new UserClient(this);
	}

	public String getChannel() {
		return this.channel;
	}
	
	public String getNetwork() {
		return this.network;
	}
	
	public String getUser() {
		return this.user;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	static int getArgCount(){
		return 6;
	}
	static int getMinArgCount(){
		return 3;
	}
}
