package ku.ske.payment.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "wallet")
@XmlAccessorType(XmlAccessType.FIELD)
public class Wallet {
	
	private static final long serialVersionUID = 1L;

	@XmlAttribute
	private long id;
	private long ownerID;
	private double balance;
	private String accountNumber;

	public Wallet() {
		
	}

	public Wallet(long id) {
		this.id = id;
	}

	public Wallet(long ownerID, double balance, String accountNumber) {
		this.ownerID = ownerID;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(long ownerID) {
		this.ownerID = ownerID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
