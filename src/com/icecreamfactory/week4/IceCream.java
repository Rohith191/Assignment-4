package com.icecreamfactory.week4;

public class IceCream {
    public IceCream(String flavour, String description, Boolean hasNuts, Double price){
        this.setFlavour(flavour);
        this.setDescription(description);
        this.setHasNuts(hasNuts);
        this.setPrice(price);
    }
    String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	String getFlavour() {
		return flavour;
	}
	void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	String getDescription() {
		return description;
	}
	void setDescription(String description) {
		this.description = description;
	}
	Boolean getHasNuts() {
		return hasNuts;
	}
	void setHasNuts(Boolean hasNuts) {
		this.hasNuts = hasNuts;
	}
	Double getPrice() {
		return price;
	}
	void setPrice(Double price) {
		this.price = price;
	}
	private String id;
    private String flavour;
    private String description;
    private Boolean hasNuts;
    private Double price;
}