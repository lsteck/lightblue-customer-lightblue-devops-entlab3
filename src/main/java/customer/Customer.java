package customer;

public class Customer {
	private String _id;
	private String _rev;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String imageUrl;
	
	public String getId() {
		return _id;
	}
	public void setId(String id) {
		this._id = id;
	}
	public String getRev() {
		return _rev;
	}
	public void setRev(String rev) {
		this._rev = rev;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}