package com.venkatesh;

import com.venkatesh.coupon.Coupon;
import com.venkatesh.coupon.Mobilecoupon;
import com.venkatesh.coupon.fashion;
import com.venkatesh.item.Item;
import com.venkatesh.order.Order;

public class test {
	public static void main(String []args) {
		Item item1=new Item(1,"samsung",12000.7,2,"mobile");
		Item item2=new Item(2,"iphone",10000,1,"mobile");
		Item item3=new Item(4,"shirt",699,3,"fashion");
		Item[] items=new Item[] {item1,item2,item3};
		Order order=new Order();
		order.setOrderid(23332);
		order.setItem(items);
		Coupon Mobilecoupon=new Mobilecoupon();
		order=Mobilecoupon.applycoupon(order, Mobilecoupon);
		Coupon fashion=new fashion();
		order=fashion.applycoupon(order, fashion);
		System.out.println("totel finalorder"+order.getFinalprice());
	}

}
