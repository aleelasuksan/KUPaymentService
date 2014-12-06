package ku.ske.payment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "payment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Payment {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@XmlAttribute
	private long id;
	private long merchantID;
	private double amount;
	private String status;
	private String datetime;

	public Payment() {

	}

	public Payment(long merchantID, double amount,
			String status, String datetime) {
		this.merchantID = merchantID;
		this.amount = amount;
		this.status = status;
		this.datetime = datetime;
	}

	public Payment(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMerchantID() {
		return merchantID;
	}

	public void setMerchantID(long merchantID) {
		this.merchantID = merchantID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDateTime() {
		return datetime;
	}

	public void setDateTime(String datetime) {
		this.datetime = datetime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void applyUpdate(Payment update) {
		if (update == null)
			return;
		if (update.getId() != 0 && update.getId() != this.getId())
			throw new IllegalArgumentException(
					"Update payment must have same id as payment to update");

		if (update.getMerchantID() != 0)
			this.setMerchantID(update.getMerchantID());

		if (update.getStatus() != null)
			this.setStatus(update.getStatus());

		if (update.getAmount() > 0)
			this.setAmount(update.getAmount());

		if (update.getDateTime() != null)
			this.setDateTime(update.getDateTime());

	}

}