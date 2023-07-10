package test;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
class Product {
	private int serialNumber;
    private String productType;
    private String productName;
    private int price;
}