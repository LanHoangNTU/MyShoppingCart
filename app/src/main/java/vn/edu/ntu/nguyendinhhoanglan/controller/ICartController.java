package vn.edu.ntu.nguyendinhhoanglan.controller;

import java.util.List;

import vn.edu.ntu.nguyendinhhoanglan.model.Product;

public interface ICartController {
    List<Product> getAllProducts();
    boolean addToCart(Product product);
    List<Product> getShoppingCart();
    void clearShoppingCart();
}
