package gameSelling.dataAccess.concretes.jdbcimpls;

import gameSelling.dataAccess.abstracts.GameDao;
import gameSelling.entities.concretes.Game;

public class GameJdbcDao implements GameDao {
	
	@Override
	public void add(Game game) {
		System.out.println(game.getId() + " numaral� " + game.getName() + " adl� oyun jdbc'e ba�ar�yla eklenmi�tir.");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getId() + " numaral� " + game.getName() + " adl� oyun jdbc'de ba�ar�yla g�ncellenmi�tir.");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getId() + " numaral� " + game.getName() + " adl� oyun jdbc'den ba�ar�yla silinmi�tir.");

	}

}
