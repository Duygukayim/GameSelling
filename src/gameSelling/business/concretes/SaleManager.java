package gameSelling.business.concretes;

import gameSelling.business.abstracts.SaleService;
import gameSelling.core.abstracts.MernisService;
import gameSelling.dataAccess.abstracts.SaleDao;
import gameSelling.entities.concretes.Customer;
import gameSelling.entities.concretes.Game;
import gameSelling.entities.concretes.Sale;

public class SaleManager implements SaleService {

	private SaleDao saleDao;
	private Customer customer;
	private Game game;
	private MernisService mernisService;

	public SaleManager() {
		super();
	}

	public SaleManager(SaleDao saleDao, Customer customer, Game game, MernisService mernisService) {
		super();
		this.saleDao = saleDao;
		this.customer = customer;
		this.game = game;
		this.mernisService = mernisService;
	}

	@Override
	public void add(Sale sale) {

		double newPrice = 0;

		if (((MernisService) this.mernisService).checkIfRealPerson(customer)) {
			if (this.customer.getId() == sale.getCustomer().getId() && this.game.getId() == sale.getGame().getId()) {
				newPrice = this.game.getPrice() - (this.game.getPrice() * sale.getCampaign().getPercentageOfDiscount());
				System.out.println("Oyuncu " + this.customer.getFirstName() + " " + this.customer.getLastName() + " "
						+ this.game.getName() + " adlý oyunu " + newPrice + "TL fiyatýyla indirimli satýn almýþtýr.");
			} else {
				System.out.println("Satýþ iþlemi baþarýsýz!---> Oyun, Oyuncu, Kampanya uyumsuzluðu mevcuttur.");
			}
		} else {
			System.out.println("Geçersiz kiþi, satýn alma iþlemi baþarýsýz!");
		}

	}

	@Override
	public void delete(Sale sale) {
		this.saleDao.delete(sale);

	}

}
