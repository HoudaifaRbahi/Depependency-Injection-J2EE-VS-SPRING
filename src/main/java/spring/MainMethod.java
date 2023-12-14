package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.interfaces.IDao;
import spring.interfaces.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext(new String[]{"config.xml"});
        IMetier metier= (IMetier) classPathXmlApplicationContext.getBean("metier");
        System.out.println(metier.calculate());

    }
}
