package gameSelling.dataAccess.concretes.hibernateimpls;

import gameSelling.dataAccess.abstracts.GameDao;
import gameSelling.entities.concretes.Game;

public class GameHibernateDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println(game.getId() + " numaral� " + game.getName() + " adl� oyun hibernate'e ba�ar�yla eklenmi�tir.");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getId() + " numaral� " + game.getName() + " adl� oyun hibernate'de ba�ar�yla g�ncellenmi�tir.");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getId() + " numaral� " + game.getName() + " adl� oyun hibernate'den ba�ar�yla silinmi�tir.");

	}

}
