package com.trade.spring;

import com.trade.spring.service.impl.DowJonsNewsListener;
import com.trade.spring.service.impl.DowJonsNewsRegister;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Created by tiany on 2017/12/20.
 */
public class ForexMain {

    public static void main(String[] args) {
//        ForexNewsProvider newsProvider = new ForexNewsProvider();
//        newsProvider.getAndRegisterNews();
//        System.out.println("执行完成！！");
        /*BeanFactory 方式*/
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        ForexNewsProvider newsProvider = (ForexNewsProvider) beanFactory.getBean("djNewsProvider");
//        newsProvider.getAndRegisterNews();

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ForexNewsProvider newsProvider = (ForexNewsProvider) context.getBean("djNewsProvider");
//        newsProvider.getAndRegisterNews();

        DefaultListableBeanFactory beanRegister = new DefaultListableBeanFactory();
        BeanFactory container = (BeanFactory)bindViaCode(beanRegister);
        ForexNewsProvider provider = (ForexNewsProvider)container.getBean("djNewsProvider");
        provider.getAndRegisterNews();
    }

    public static BeanFactory bindViaCode(BeanDefinitionRegistry beanDefinitionRegistry){
        AbstractBeanDefinition newsProvider = new RootBeanDefinition(ForexNewsProvider.class);
        AbstractBeanDefinition newsListener = new RootBeanDefinition(DowJonsNewsListener.class);
        AbstractBeanDefinition newsRegister = new RootBeanDefinition(DowJonsNewsRegister.class);
        beanDefinitionRegistry.registerBeanDefinition("djNewsProvider", newsProvider);
        beanDefinitionRegistry.registerBeanDefinition("djNewsListener", newsListener);
        beanDefinitionRegistry.registerBeanDefinition("djNewsRegister", newsRegister);
        /**
         * 构造方法注入
         */
        /*ConstructorArgumentValues argValues = new ConstructorArgumentValues();
        argValues.addIndexedArgumentValue(0,newsListener);
        argValues.addIndexedArgumentValue(1,newsRegister);
        newsProvider.setConstructorArgumentValues(argValues);*/
        /**
         * setter方法注入
         */
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("newsListener",newsListener));
        propertyValues.addPropertyValue(new PropertyValue("newsRegister",newsRegister));
        newsProvider.setPropertyValues(propertyValues);
        return (BeanFactory) beanDefinitionRegistry;
    }
}
