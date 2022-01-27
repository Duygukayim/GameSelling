package gameSelling.business.abstracts;

import gameSelling.entities.concretes.Sale;

public interface SaleService {

	void add(Sale sale);

	void delete(Sale sale);
}
