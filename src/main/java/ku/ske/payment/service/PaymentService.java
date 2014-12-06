package ku.ske.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("paymentService")
@Transactional
public class PaymentService {

	private final PaymentRepository paymentRepository;
	
	@Autowired
	public PaymentService(PaymentRepository payRep) {
		this.paymentRepository = payRep;
	}
	
}
