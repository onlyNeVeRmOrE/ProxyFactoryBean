package test.edu.javaee.spring.aop;

//import static org.junit.Assert.assertEquals;

//import org.junit.Test;

import dev.edu.javaee.spring.bean.BeanDefinition;
import dev.edu.javaee.spring.bean.PropertyValue;
import dev.edu.javaee.spring.bean.PropertyValues;
import dev.edu.javaee.spring.factory.BeanFactory;
import dev.edu.javaee.spring.factory.XMLBeanFactory;
import dev.edu.javaee.spring.resource.LocalFileResource;

public class TestProxyFactoryBean {

	public static void main(String args[]){
        LocalFileResource resource = new LocalFileResource("fuck.xml");
		
		BeanFactory beanFactory = new XMLBeanFactory(resource);
		// the BeanDefinition doesn`t create the real bean yet
		FooInterface fooImple=(FooInterface) beanFactory.getBean("wtf");
	
		fooImple.printFoo();
		fooImple.dummyFoo();
		
	}

}
