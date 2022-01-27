package gameSelling.dataAccess.abstracts;

import gameSelling.entities.concretes.Sale;

public interface SaleDao {

	void add(Sale sale);

	void delete(Sale sale);
}
