package Bean;

// this is a bean class it is also known as POJO class, it contains only Variable and its getter and setter method with its constructor.
public class UserBean 
{
	String name,email,username,password;
	int id;
	
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
		
	public UserBean(String name,  String email,String username,String password) {
		super();
		this.name = name;
		
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public UserBean(int id,String name,  String email,String username,String password) {
		super();
		this.id = id;
		this.name = name;
		
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		
}
