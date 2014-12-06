package ku.ske.payment.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import ku.ske.payment.entity.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
	
	public List<Payment> findAll();

	public Payment findByID(long id);

}
