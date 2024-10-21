package com.venkatesh.coupon;

import com.venkatesh.item.Item;
import com.venkatesh.order.Order;

public class fashion extends Coupon {

	@Override
	public Order applycoupon(Order order, Coupon coupon) {
		// TODO Auto-generated method stub
		
		Item[] items=order.getItem();
		double finalorderprice=order.getFinalprice();
	
		for(Item item:items) {
			double price=0;
			if(item.getCategory().equals("fashion")) {
				if(item.getNumberofunits()%2==0) {
					price=item.getNumberofunits()/2*item.getItemprice();
				}
				else
				{
					price=(item.getNumberofunits()/2*item.getItemprice())+(item.getItemprice());
				}
			}
			 finalorderprice += price;
		}
		order.setFinalprice( finalorderprice);
		return order;
	}

}
