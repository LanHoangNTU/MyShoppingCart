package vn.edu.ntu.nguyendinhhoanglan.controller;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import vn.edu.ntu.nguyendinhhoanglan.model.Product;

public class CartController extends Application implements ICartController{
    List<Product> listProducts = new ArrayList<>();
    List<Product> shoppingCart = new ArrayList<>();

    public CartController() {
        listProducts.add(new Product("Khoai lang", 25000, "Khoai lang tiêu chuẩn Việt Nam"));
        listProducts.add(new Product("Khoai sọ", 30000, "Khoai sọ trồng tại Ninh Hòa"));
        listProducts.add(new Product("Khoai tím", 35000, "Khoai tím đỏ tươi"));
        listProducts.add(new Product("Khoai tây", 40000, "Khoai tây Mỹ"));
        listProducts.add(new Product("Sầu riêng", 45000, "Sầu riêng Khánh Hòa"));
        listProducts.add(new Product("Bưởi", 50000, "Bưởi da xanh"));
    }

    @Override
    public List<Product> getAllProducts() {
        return listProducts;
    }

    @Override
    public boolean addToCart(Product product) {
        if(this.shoppingCart.contains(product))
            return false;
        this.shoppingCart.add(product);
        return true;
    }

    @Override
    public List<Product> getShoppingCart() {
        return this.shoppingCart;
    }

    @Override
    public void clearShoppingCart() {
        shoppingCart.clear();
    }
}
