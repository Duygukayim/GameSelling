package gameSelling.dataAccess.concretes.jdbcimpls;

import gameSelling.dataAccess.abstracts.CampaignDao;
import gameSelling.entities.concretes.Campaign;

public class CampaignJdbcDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası jdbc'e başarıyla eklemiştir.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası jdbc'de başarıyla güncellenmiştir.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyası jdbc'den başarıyla silinmiştir.");

	}
	
}
