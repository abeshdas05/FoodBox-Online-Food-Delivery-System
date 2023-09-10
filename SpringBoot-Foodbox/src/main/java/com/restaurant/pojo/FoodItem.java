package com.restaurant.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data 
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodItemId;
    private String name;
    private String description;
    private double actualPrice;
    private double offer;
    private String imagePath;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    
    private int availableQuantity;
    private boolean enabled;
    
    public double getDiscountedPrice() {
    	double discPrice = Math.round(this.actualPrice*(1-this.offer/100) * 100);
    	discPrice = discPrice/100;
    	return (discPrice);
    }
    
    
    
}
