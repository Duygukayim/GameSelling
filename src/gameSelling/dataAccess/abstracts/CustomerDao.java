package gameSelling.dataAccess.abstracts;

import gameSelling.entities.concretes.Customer;

public interface CustomerDao {

	void add(Customer customer);

	void update(Customer customer);

	void delete(Customer customer);
}
