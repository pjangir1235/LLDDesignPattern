package wayfair.coupon.dto;

import java.time.LocalDate;

public class Coupon extends Discount{
    String couponName;
    String categoryName;
    LocalDate modifiedDate;

    public Coupon(String couponName, String categoryName,  String modifiedDate, String discountValue) {
        super(discountValue);
        this.couponName = couponName;
        this.categoryName = categoryName;
        this.modifiedDate = LocalDate.parse(modifiedDate);

    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }


    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }


}
