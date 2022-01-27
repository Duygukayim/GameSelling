package gameSelling.entities.concretes;

import gameSelling.entities.abstracts.Entity;

public class Campaign implements Entity {

	private int id;
	private String campaignName;
	private double percentageOfDiscount;

	public Campaign() {
		super();
	}

	public Campaign(int id, String campaignName, double percentageOfDiscount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.percentageOfDiscount = percentageOfDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getPercentageOfDiscount() {
		return percentageOfDiscount;
	}

	public void setPercentageOfDiscount(double percentageOfDiscount) {
		this.percentageOfDiscount = percentageOfDiscount;
	}

}
