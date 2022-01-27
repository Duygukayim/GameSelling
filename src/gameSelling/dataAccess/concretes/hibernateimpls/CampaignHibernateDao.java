package gameSelling.dataAccess.concretes.hibernateimpls;

import gameSelling.dataAccess.abstracts.CampaignDao;
import gameSelling.entities.concretes.Campaign;

public class CampaignHibernateDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý hibernate'e baþarýyla eklemiþtir.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý hibernate'de baþarýyla güncellenmiþtir.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý hibernate'den baþarýyla silinmiþtir.");

	}

}
