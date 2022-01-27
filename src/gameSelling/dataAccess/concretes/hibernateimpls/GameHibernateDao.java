package gameSelling.dataAccess.concretes.hibernateimpls;

import gameSelling.dataAccess.abstracts.GameDao;
import gameSelling.entities.concretes.Game;

public class GameHibernateDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println(game.getId() + " numaralý " + game.getName() + " adlý oyun hibernate'e baþarýyla eklenmiþtir.");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getId() + " numaralý " + game.getName() + " adlý oyun hibernate'de baþarýyla güncellenmiþtir.");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getId() + " numaralý " + game.getName() + " adlý oyun hibernate'den baþarýyla silinmiþtir.");

	}

}
