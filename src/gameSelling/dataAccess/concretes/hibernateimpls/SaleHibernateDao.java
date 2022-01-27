package gameSelling.dataAccess.concretes.hibernateimpls;

import gameSelling.dataAccess.abstracts.SaleDao;
import gameSelling.entities.concretes.Sale;

public class SaleHibernateDao implements SaleDao {

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId() + " numaralý satýþ iþlemi hibernate'e baþarýyla eklenmiþtir.");

	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() + " numaralý satýþ iþlemi hibernate'den baþarýyla silinmiþtir.");

	}

}
