package com.beeva.Jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.Jpa.dao.UserDao;
import com.beeva.Jpa.impl.UserDaoImpl;
import com.beeva.Jpa.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    	UserDao userdao= (UserDao)context.getBean(UserDaoImpl.class);
    	
        User usr=new User();
        usr.setNombre("Bart Simpson");
        usr.setDirecion("Sprinfield");
        userdao.save(usr);
      
        
    }
    
}
