package service;

import shop.Shop;

public interface Service {
    void addProducts(Shop shop);
    void showCase(String company);
    void delete();
    Boolean manager();
}
