package spring.Impl;

import spring.interfaces.IDao;
import spring.interfaces.IMetier;

public class MetierImpl implements IMetier {
    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculate() {
        double nb=(dao.getValue())*5;
        return nb;
    }
}
