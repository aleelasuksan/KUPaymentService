package ku.ske.payment.server;

import ku.ske.payment.entity.Payment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping("payments")
public class PaymentController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value="", method=RequestMethod.GET)
	public Payment getPayment() {
		return new Payment(1, 10000, "pending", "today");
	}
	
}
