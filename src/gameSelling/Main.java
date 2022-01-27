package gameSelling;

import java.time.LocalDate;

import gameSelling.business.concretes.CampaignManager;
import gameSelling.business.concretes.CustomerManager;
import gameSelling.business.concretes.GameManager;
import gameSelling.business.concretes.SaleManager;
import gameSelling.core.concretes.MernisManager;
import gameSelling.dataAccess.concretes.hibernateimpls.CampaignHibernateDao;
import gameSelling.dataAccess.concretes.hibernateimpls.CustomerHibernateDao;
import gameSelling.dataAccess.concretes.hibernateimpls.GameHibernateDao;
import gameSelling.dataAccess.concretes.hibernateimpls.SaleHibernateDao;
import gameSelling.entities.concretes.Campaign;
import gameSelling.entities.concretes.Customer;
import gameSelling.entities.concretes.Game;
import gameSelling.entities.concretes.Sale;

public class Main {

	public static void main(String[] args) {

		CustomerManager customer = new CustomerManager(new CustomerHibernateDao(), new MernisManager());

		Customer customer1 = new Customer(1, "Duygu", "Kayým", LocalDate.of(1997, 8, 18), "54687912356");
		Customer customer2 = new Customer(2, "Hüma", "Özdilek", LocalDate.of(2013, 5, 27), "39473575690");
		Customer customer3 = new Customer(3, "Nermin", "Kayým", LocalDate.of(1971, 7, 24), "45869712368");
		customer.add(customer1);

		GameManager game = new GameManager(new GameHibernateDao());

		Game game1 = new Game(1, "World Of Warcraft", 200, "Genç Kategori");
		Game game2 = new Game(2, "Business Tour", 80, "Çocuk Kategori");
		Game game3 = new Game(3, "Never Winter", 300, "Yetiþkin Kategori");
		game.add(game1);

		CampaignManager campaignA = new CampaignManager(new CampaignHibernateDao(), game1);
		CampaignManager campaignB = new CampaignManager(new CampaignHibernateDao(), game2);
		CampaignManager campaignC = new CampaignManager(new CampaignHibernateDao(), game3);

		Campaign campaign1 = new Campaign(1, "Genç Öðrenci", 35);
		Campaign campaign2 = new Campaign(2, "Mini Çocuk", 15);
		Campaign campaign3 = new Campaign(3, "Yetiþkin Plus", 20);
		campaignA.add(campaign1);

		SaleManager saleA = new SaleManager(new SaleHibernateDao(), customer1, game1, new MernisManager());
		SaleManager saleB = new SaleManager(new SaleHibernateDao(), customer2, game2, new MernisManager());
		SaleManager saleC = new SaleManager(new SaleHibernateDao(), customer3, game3, new MernisManager());

		Sale sale1 = new Sale(1, game1, customer1, campaign1);
		Sale sale2 = new Sale(2, game2, customer2, campaign2);
		Sale sale3 = new Sale(3, game3, customer3, campaign3);
		saleA.add(sale1);

		saleA.delete(sale1);
		System.out.println("--------------");
		customer.update(customer3);
		customer.add(customer3);
		game.update(game1);
		campaignC.update(campaign3);
		saleC.add(sale3);

	}

}