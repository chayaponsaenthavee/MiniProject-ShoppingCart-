package Lib;
/*
 * ADT ที่เปลี่ยนเเปลงได้ (Mutable) สำหรับเก็บข้อมูลสินค้า 1 รายการใน
 */
public class CartItem {
    private final Product product;
    private int quantity;

    // Rep Invariant (RI):
    // - product is not null.
    // - quantity > 0.
    //
    // Abstraction Function (AF):
    // - AF(product, quantity) = An item in a shopping ca
    // with the specified 'quantity'.

    /*
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */
    private void checkRep() {
        if (product == null) {
            throw new RuntimeException("RI violat");
        }
         if (quantity <= 0) {
            throw new RuntimeException("RI violat");
        }
    }
    /*
     * สร้างรายการสินค้าในตะกร้า
     */
    public CartItem(Product product, int quantity){
        this.product =product;
        this.quantity = quantity;
        checkRep();
    }
    /**
     * @return อ็อบเจกต์ Product
     */
    public Product geProduct() {return product;}

    public int geQuantity() {return quantity;}

    /**
     * เพิ่มจำนวนสินค้าในรายการนี้
     * @param amount จำนวนที่ต้องการเพิ่ม (ต้องเป็นค่าบวก)
     */
    public void increaseQuantity(int amount){
        if (amount > 0){
            this.quantity += amount;
        }
        checkRep(); //ตรวจสอบหลังการเปลี่ยนเเปลงสถานะ
    }
}
