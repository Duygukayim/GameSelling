package gameSelling.dataAccess.concretes.jdbcimpls;

import gameSelling.dataAccess.abstracts.SaleDao;
import gameSelling.entities.concretes.Sale;

public class SaleJdbcDao implements SaleDao {

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId() + " numaralý satýþ iþlemi jdbc'e baþarýyla eklenmiþtir.");

	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() + " numaralý satýþ iþlemi jdbc'den baþarýyla silinmiþtir.");

	}

}
