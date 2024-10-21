package com.venkatesh.coupon;

import com.venkatesh.order.Order;

public  abstract class Coupon {
	public abstract Order applycoupon(Order order,Coupon coupon);
     
}
