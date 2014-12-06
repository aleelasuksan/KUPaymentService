package ku.ske.payment.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {

	private static final long serialVersionUID = 1L;

	@XmlAttribute
	private long id;
//	@XmlTransient
	private String username;
//	@XmlTransient
	private String password;
	
	private String firstName;
	private String lastName;
	private String dob;
	private String address;
	private String phone;
	private String email;
	
	public User() {

	}

	public User(String firstName, String lastName, String dob, String address,
			String phone, String email, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public User(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
	
	
}