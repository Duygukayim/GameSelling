package gameSelling.business.concretes;

import gameSelling.business.abstracts.CampaignService;
import gameSelling.dataAccess.abstracts.CampaignDao;
import gameSelling.entities.concretes.Campaign;
import gameSelling.entities.concretes.Game;

public class CampaignManager implements CampaignService {

	private CampaignDao campaignDao;
	private Game game;

	public CampaignManager() {
		super();
	}

	public CampaignManager(CampaignDao campaignDao, Game game) {
		super();
		this.campaignDao = campaignDao;
		this.game = game;
	}

	@Override
	public void add(Campaign campaign) {
		if (this.game.getId() == campaign.getId()) {
			campaign.setPercentageOfDiscount(campaign.getPercentageOfDiscount() / 100);
			this.campaignDao.add(campaign);
		}else {
			System.out.println("Satýþ iþlemi baþarýsýz!---> Oyun, Oyuncu, Kampanya uyumsuzluðu mevcuttur.");
		}

	}

	@Override
	public void update(Campaign campaign) {
		campaign.setPercentageOfDiscount(campaign.getPercentageOfDiscount() / 100);
		this.campaignDao.update(campaign);

	}

	@Override
	public void delete(Campaign campaign) {
		this.campaignDao.delete(campaign);

	}

}
