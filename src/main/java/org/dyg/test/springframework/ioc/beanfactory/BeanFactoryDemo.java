package org.dyg.test.springframework.ioc.beanfactory;

import org.dyg.test.springframework.ioc.beanfactory.model.Person;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author dyg
 * 
 *         IOC(inversion of control) 的核心对象BeanFactory 和 BeanDefinition
 * 
 * 
 */
public class BeanFactoryDemo {

	public static void main(String[] args) {
		// 1.需要一个File指向我们的XML文件（本文的配置文件都已XML为例，因为这是我们最熟悉的），专业点可以叫资源定位，简单点可以说我们需要一些工具来完成找到XML文件的所在位置。

		// 2.需要一个Reader来读取我们的XML文件，专业点叫DOM解析，简单点说，就是把XML文件的各种定义都给拿出来。

		// 3.需要将读出来的数据都设置到Map当中。

		// 这三部总结起来就是定位、解析、注册。我们首先按照这个思路来试一下。

		ClassPathResource classPathResource = new ClassPathResource("/springdemo/spring-demo-config.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
		System.out.println("numbers: " + defaultListableBeanFactory.getBeanDefinitionCount());
		((Person) defaultListableBeanFactory.getBean(Person.class)).work();
		
		
		//以上三笔完成的问题 现在一步就能搞定
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/springdemo/spring-demo-config.xml");
        System.out.println("numbers: " + applicationContext.getBeanDefinitionCount());
        ((Person)applicationContext.getBean("person")).work();
        System.out.println("applicationName:"+applicationContext.getApplicationName());
	}

}
