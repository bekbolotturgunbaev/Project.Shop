package wheat.products;

import shop.WheatProducts;

import java.time.LocalDate;

public class Bread extends WheatProducts {
    public Bread(String name, String company, LocalDate from, LocalDate before) {
        super(name, company, from, before);
    }

    @Override
    public String toString() {
        return "WheatProducts:\n"
                + getName()+"\n"
                + getCompany()+"\n"
                + "from: "+getFrom()+"\n"
                + "before: "+getBefore()+ "\n"
                + "_____________________________" + "\n";
    }
}
