package spring.Impl;

import spring.interfaces.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getValue() {
        return 13;
    }
}
