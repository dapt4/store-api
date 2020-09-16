package com.all.storeapi.model;

import javax.persistence.*;

@Entity
@Table(name="Stores")
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private String market;
    private String description;
    private int badge;
    private double distance;
    private String product;
    private byte rated;
    private int productsFind;
    private int productsTotal;
    private double price;
    private int itemsCart;
    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBadge() {
        return badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public byte getRated() {
        return rated;
    }

    public void setRated(byte rated) {
        this.rated = rated;
    }

    public int getProductsFind() {
        return productsFind;
    }

    public void setProductsFind(int productsFind) {
        this.productsFind = productsFind;
    }

    public int getProductsTotal() {
        return productsTotal;
    }

    public void setProductsTotal(int productsTotal) {
        this.productsTotal = productsTotal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemsCart() {
        return itemsCart;
    }

    public void setItemsCart(int itemsCart) {
        this.itemsCart = itemsCart;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
