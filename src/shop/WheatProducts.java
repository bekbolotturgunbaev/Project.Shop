package shop;

import java.time.LocalDate;

public class WheatProducts extends Shop {
    public WheatProducts(String name, String company, LocalDate from, LocalDate before) {
        super(name, company, from, before);
    }

    public WheatProducts() {
    }

    @Override
    public String toString() {
        return "WheatProduct:\n"
                + getName()+"\n"
                + getCompany()+"\n"
                + "from: "+getFrom()+"\n"
                + "before: "+getBefore()+ "\n"
                + "_____________________________" + "\n";
    }
}
