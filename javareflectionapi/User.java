package javareflectionapi;

public class User {
	private int user_id;
	private String username;
	private String password;
	
	enum Week{
		SUN,TUE,WED
	};
	
	@interface
	MyAnno{}
	
	//Default constructor
	public User() {
		super();
	}
	
	//Parameterized constructor
	public User(int user_id, String username, String password) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
	}
	
    //setters and getters
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	class A{
		
	}
	
	class B{
		
	}
}
