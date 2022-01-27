package gameSelling.dataAccess.concretes.hibernateimpls;

import gameSelling.dataAccess.abstracts.CampaignDao;
import gameSelling.entities.concretes.Campaign;

public class CampaignHibernateDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� hibernate'e ba�ar�yla eklemi�tir.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� hibernate'de ba�ar�yla g�ncellenmi�tir.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� hibernate'den ba�ar�yla silinmi�tir.");

	}

}
