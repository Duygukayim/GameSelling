package gameSelling.dataAccess.abstracts;

import gameSelling.entities.concretes.Campaign;

public interface CampaignDao {

	void add(Campaign campaign);

	void update(Campaign campaign);

	void delete(Campaign campaign);
}
