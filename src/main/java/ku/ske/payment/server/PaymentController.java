package ku.ske.payment.server;

import ku.ske.payment.entity.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping(value = "payments")
public class PaymentController {
	
	@RequestMapping(method=RequestMethod.GET)
	public Payment getPayment() {
		return new Payment(1, 10000, "pending", "today");
	}
	
}
