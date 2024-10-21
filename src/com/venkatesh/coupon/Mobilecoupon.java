package com.venkatesh.coupon;

import com.venkatesh.item.Item;
import com.venkatesh.order.Order;

public class Mobilecoupon extends Coupon {

	@Override
	public Order applycoupon(Order order, Coupon coupon) {
		// TODO Auto-generated method stub
		Item[] items=order.getItem();
		double finalorderprice=0;
		for(Item item:items) {
			double price=item.getItemprice()*item.getNumberofunits();
			if(item.getCategory().equals("mobile")) {
			           price=price-50;
				finalorderprice+=price;
			}
			
			
		}
		order.setFinalprice(finalorderprice);
		
		return order;
	}
	

}
