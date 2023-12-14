package spring.Impl;

import spring.interfaces.IDao;

public class DaoImpl implements IDao {

    @Override
    public double getValue() {
        return 5;
    }
}
