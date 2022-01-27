package gameSelling.business.abstracts;

import gameSelling.entities.concretes.Customer;

public interface CustomerService {

	void add(Customer customer);

	void update(Customer customer);

	void delete(Customer customer);
}
