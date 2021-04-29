package CatCoding.ProductHW;

import java.util.Arrays;

public class Basket {
 private Product [] butProduct;

 public Product[] getButProduct() {
  return butProduct;
 }

 public void setButProduct(Product[] butProduct) {
  this.butProduct = butProduct;
 }

 @Override
 public String toString() {
  return  Arrays.toString(butProduct);
 }
}
