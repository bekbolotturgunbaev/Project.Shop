package List;

import myExeption.MyExeption;
import shop.DairyProducts;
import shop.Shop;

import java.util.List;

public class ArrayList extends Shop {
    private List<Shop> arrayList = new java.util.ArrayList<>();



    public List<Shop> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<Shop> arrayList) {
        this.arrayList = arrayList;
    }


    @Override
    public String toString() {
        return "Products"
                + arrayList
                + "_____________________________" + "\n";
    }
}
