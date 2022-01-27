package gameSelling.dataAccess.concretes.jdbcimpls;

import gameSelling.dataAccess.abstracts.SaleDao;
import gameSelling.entities.concretes.Sale;

public class SaleJdbcDao implements SaleDao {

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId() + " numaral� sat�� i�lemi jdbc'e ba�ar�yla eklenmi�tir.");

	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() + " numaral� sat�� i�lemi jdbc'den ba�ar�yla silinmi�tir.");

	}

}
