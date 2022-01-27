package gameSelling.business.concretes;

import gameSelling.business.abstracts.CustomerService;
import gameSelling.core.abstracts.MernisService;
import gameSelling.dataAccess.abstracts.CustomerDao;
import gameSelling.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private MernisService mernisService;

	public CustomerManager(CustomerDao customerDao, MernisService mernisService) {
		super();
		this.customerDao = customerDao;
		this.mernisService = mernisService;
	}

	@Override
	public void add(Customer customer) {
		if (this.mernisService.checkIfRealPerson(customer)) {
			this.customerDao.add(customer);
		} else {
			System.out.println("Geçersiz kiþi, ekleme iþlemi baþarýsýz!");
		}
	}

	@Override
	public void update(Customer customer) {
		this.customerDao.update(customer);

	}

	@Override
	public void delete(Customer customer) {
		this.customerDao.delete(customer);

	}

}
