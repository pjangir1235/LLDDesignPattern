package wayfair.coupon;

import wayfair.coupon.dto.Coupon;
import wayfair.coupon.dto.Product;
import wayfair.coupon.service.CouponService;

public class mainClass {
	public static void main(String args[]) {
		CouponService service = init();

		/*
		 * "Comforter Sets" => "Comforters Sale" "Bedding" => "Savings on Bedding"
		 * "Bathroom Accessories" => "Low price for Bed & Bath" "Soap Dispensers" =>
		 * "Low price for Bed & Bath" "Toy Organizers" => null
		 */

        System.out.println(service.findCoupon("Comforter Sets"));
        System.out.println(service.findCoupon("Bedding"));
        System.out.println(service.findCoupon("Bathroom Accessories"));
        System.out.println(service.findCoupon("Soap Dispensers"));
        System.out.println(service.findCoupon("Toy Organizers"));

		/*
		 * "Bed & Bath" => "Bed & Bath extravaganza" "Bedding" => "Savings on Bedding" |
		 * "Best Bedding Bargains" "Bathroom Accessories" => "Bed & Bath extravaganza"
		 * "Comforter Sets" => "Comforters Sale" | "Cozy Comforter Coupon"
		 */

        System.out.println(service.findCoupon("Bed & Bath"));
        System.out.println(service.findCoupon("Bedding"));
        System.out.println(service.findCoupon("Bathroom Accessories"));
        System.out.println(service.findCoupon("Comforter Sets"));

		/*
		 * "Cozy Comforter" => "90.00" OR "85.00" "All-in-one Bedding Set" => "32.50" OR
		 * "37.50" "Infinite Soap Dispenser" => "125.001 "Rainbow Tov Box" => "257.00"
		 */

		System.out.println(service.getBestPrice("Cozy Comforter Sets"));
		System.out.println(service.getBestPrice("All-in-one Bedding Set"));
		System.out.println(service.getBestPrice("Infinite Soap Dispenser"));
		System.out.println(service.getBestPrice("Rainbow Toy Box"));

	}

	public static CouponService init() {
		CouponService service = new CouponService();

		// category
		service.addCategory("Comforter Sets", "Bedding");
		service.addCategory("Bedding", "Bed & Bath");
		service.addCategory("Bed & Bath", "None");
		service.addCategory("Soap Dispensers", "Bathroom Accessories");
		service.addCategory("Bathroom Accessories", "Bed & Bath");
		service.addCategory("Toy Organizers", "Baby And Kids");
		service.addCategory("Baby And Kids", "None");

		// coupon

		service.addCoupon("Comforter Sets", new Coupon("Comforter Sets", "Comforters Sale", "2020-01-01", "10%"));
		service.addCoupon("Comforter Sets", new Coupon("Comforter Sets", "Cozy Comforter Coupon", "2020-01-01", "$15"));
		service.addCoupon("Bedding", new Coupon("Bedding", "Best Bedding Bargains", "2019-01-01", "35%"));
		service.addCoupon("Bedding", new Coupon("Bedding", "Savings on Bedding", "2019-01-01", "25%"));
		service.addCoupon("Bed & Bath", new Coupon("Bed & Bath", "Low price for Bed & Bath", "2018-01-01", "50%"));
		service.addCoupon("Bed & Bath", new Coupon("Bed & Bath", "Bed & Bath extravaganza", "2019-01-01", "75%"));

		// product

		service.addProduct("Cozy Comforter Sets", new Product(100.00, "Comforter Sets"));
		service.addProduct("All-in-one Bedding Set", new Product(50.00, "Bedding"));
		service.addProduct("Infinite Soap Dispenser", new Product(500.00, "Bathroom Accessories"));
		service.addProduct("Rainbow Toy Box", new Product(257.00, "Baby And Kids"));

		return service;

	}
}