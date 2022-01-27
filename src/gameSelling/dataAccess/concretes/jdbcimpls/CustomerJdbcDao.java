package gameSelling.dataAccess.concretes.jdbcimpls;

import gameSelling.dataAccess.abstracts.CustomerDao;
import gameSelling.entities.concretes.Customer;

public class CustomerJdbcDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + "  adl� oyuncu hibernate'e ba�ar�yla eklemi�tir.");

	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + "  adl� oyuncu hibernate'de ba�ar�yla g�ncellenmi�tir.");

	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adl� oyuncu hibernate'den ba�ar�yla silinmi�tir.");

	}
	
}
