package List;

import shop.Manager;

import java.util.ArrayList;
import java.util.List;

public class ManagerList extends Manager {
   private List<Manager>managers = new ArrayList<>();



    public ManagerList(String login, int password, List<Manager> managers) {
        super(login, password);
        this.managers = managers;
    }

    public  ManagerList(){

    }

    public ManagerList(List<Manager> managers) {
        this.managers = managers;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    @Override
    public String toString() {
        return "ManagerList{" +
                "managers=" + managers +
                '}';
    }
}
