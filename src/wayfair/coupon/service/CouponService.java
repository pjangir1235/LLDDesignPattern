package wayfair.coupon.service;

import wayfair.coupon.dto.Coupon;
import wayfair.coupon.dto.DiscountTypeEnum;
import wayfair.coupon.dto.Product;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CouponService {

    Map<String,String> parentMap =new HashMap<>();
    Map<String, PriorityQueue<Coupon>> categoryCouponMap = new HashMap<>();
    Map<String,String> reverseParentMap =new HashMap<>();
    Map<String, Product> productMap = new HashMap<>();

    public void addCoupon ( String catname, Coupon coupon){
        PriorityQueue<Coupon> queue ;

        queue = categoryCouponMap.containsKey(catname) && categoryCouponMap.get(catname).peek().getCategoryName().equals(catname)?  categoryCouponMap.get(catname) : new PriorityQueue<>((c1,c2)->{
            return (LocalDate.now().compareTo(c1.getModifiedDate())>0)?-1:c1.getModifiedDate().compareTo(c2.getModifiedDate())>0?1:-1;
        });

        queue.add(coupon);

        while(true){
            categoryCouponMap.put(catname,queue);
            if(reverseParentMap.containsKey(catname) && !categoryCouponMap.containsKey(reverseParentMap.get(catname)) ) {
                catname = reverseParentMap.get(catname);
            }
            else{
                break;
            }
        }

    }

    public void addCategory(String category, String parent){
        parentMap.put(category,parent);
        reverseParentMap.put(parent,category);
    }

    public String findCoupon(String category){

        if(categoryCouponMap.containsKey(category)){
            return categoryCouponMap.get(category).peek().getCouponName();
        }
        return null;
    }

    public void addProduct(String productName, Product product) {
        productMap.put(productName,product);

    }

    public double getBestPrice(String productName) {
        Product  product = productMap.get(productName);
        String categoryName = findCoupon(product.getCategoryName());
        if(categoryName==null) return product.getPrice();
        Coupon coupon = categoryCouponMap.get(categoryName).peek();
        if(coupon.getDiscountEnum()== DiscountTypeEnum.FLAT){
            return product.getPrice() - coupon.getDiscountValue();
        }
        else{
            double value = coupon.getDiscountValue();
            return (product.getPrice() - (product.getPrice()*(value/100.00)));
        }

    }
}
