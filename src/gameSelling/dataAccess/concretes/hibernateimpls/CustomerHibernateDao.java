package gameSelling.dataAccess.concretes.hibernateimpls;

import gameSelling.dataAccess.abstracts.CustomerDao;
import gameSelling.entities.concretes.Customer;

public class CustomerHibernateDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + "  adlý oyuncu hibernate'e baþarýyla eklemiþtir.");

	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + "  adlý oyuncu hibernate'de baþarýyla güncellenmiþtir.");

	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adlý oyuncu hibernate'den baþarýyla silinmiþtir.");

	}

}
