package Jee;

import Jee.interfaces.IDao;
import Jee.interfaces.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        File file=new File("src/main/resources/config.txt");
        Scanner scanner=new Scanner(file);
        String daoClassName=scanner.next();
        String metierClassName=scanner.next();
        System.out.println(daoClassName);
        System.out.println(metierClassName);
        Class cDao=Class.forName(daoClassName);
        IDao dao= (IDao) cDao.newInstance();

        Class cMetier=Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.newInstance();
        Method m1= cMetier.getMethod("setDao",new Class[]{IDao.class});
        m1.invoke(metier,new Object[]{dao});
        System.out.println(metier.calculate());
    }
}
