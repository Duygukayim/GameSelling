package gameSelling.dataAccess.concretes.jdbcimpls;

import gameSelling.dataAccess.abstracts.GameDao;
import gameSelling.entities.concretes.Game;

public class GameJdbcDao implements GameDao {
	
	@Override
	public void add(Game game) {
		System.out.println(game.getId() + " numaralý " + game.getName() + " adlý oyun jdbc'e baþarýyla eklenmiþtir.");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getId() + " numaralý " + game.getName() + " adlý oyun jdbc'de baþarýyla güncellenmiþtir.");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getId() + " numaralý " + game.getName() + " adlý oyun jdbc'den baþarýyla silinmiþtir.");

	}

}
