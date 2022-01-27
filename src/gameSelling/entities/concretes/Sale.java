package gameSelling.entities.concretes;

import gameSelling.entities.abstracts.Entity;

public class Sale implements Entity {

	private int id;
	private Game game;
	private Customer customer;
	private Campaign campaign;

	public Sale() {
		super();
	}

	public Sale(int id, Game game, Customer customer, Campaign campaign) {
		super();
		this.id = id;
		this.game = game;
		this.customer = customer;
		this.campaign = campaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
