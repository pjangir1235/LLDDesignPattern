package wayfair.coupon.dto;


import java.time.LocalDate;

public class Discount {

    DiscountTypeEnum discountEnum;
    double discountValue;

    public Discount(String discountValue) {
        if(discountValue.contains("$")){
            this.discountValue = Double.parseDouble(discountValue.substring(1));
            this.discountEnum = DiscountTypeEnum.FLAT;
        }
        else{
            this.discountValue = Double.parseDouble(discountValue.substring(0, discountValue.length()-1));
            this.discountEnum = DiscountTypeEnum.PERCENTAGE;
        }
    }

    public DiscountTypeEnum getDiscountEnum() {
        return discountEnum;
    }

    public void setDiscountEnum(DiscountTypeEnum discountEnum) {
        this.discountEnum = discountEnum;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }
}
