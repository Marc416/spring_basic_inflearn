package hello.core.order;

public class Order {
    private Long memberId;
    private String item;
    private int price;
    private int discountPrice;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Order(Long memberId, String item, int price, int discountPrice) {
        this.memberId = memberId;
        this.item = item;
        this.price = price;
        this.discountPrice = discountPrice;

    }

    public int calculatePrice() {
        return price - discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", item='" + item + '\'' +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
