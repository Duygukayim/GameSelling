package gameSelling.dataAccess.concretes.jdbcimpls;

import gameSelling.dataAccess.abstracts.CampaignDao;
import gameSelling.entities.concretes.Campaign;

public class CampaignJdbcDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý jdbc'e baþarýyla eklemiþtir.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý jdbc'de baþarýyla güncellenmiþtir.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý jdbc'den baþarýyla silinmiþtir.");

	}
	
}
