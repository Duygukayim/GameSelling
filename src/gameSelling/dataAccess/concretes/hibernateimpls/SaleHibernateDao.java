package gameSelling.dataAccess.concretes.hibernateimpls;

import gameSelling.dataAccess.abstracts.SaleDao;
import gameSelling.entities.concretes.Sale;

public class SaleHibernateDao implements SaleDao {

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId() + " numaral� sat�� i�lemi hibernate'e ba�ar�yla eklenmi�tir.");

	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() + " numaral� sat�� i�lemi hibernate'den ba�ar�yla silinmi�tir.");

	}

}
