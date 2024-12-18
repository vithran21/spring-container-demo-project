package beanfactory.xmlconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Tester {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("CoreXmlBeanConfiguration.xml"));

		Car car1 = beanFactory.getBean(Car.class);
		System.out.println(car1);
//		
//		Car car2 = beanFactory.getBean(Car.class);
//		System.out.println(car2);
//		
//		Car car3 = beanFactory.getBean(Car.class);
//		System.out.println(car3);
//		
//		Bus bus = (Bus)beanFactory.getBean("bus");
//		System.out.println(bus);

		ApplicationContext context = new ClassPathXmlApplicationContext("CoreXmlBeanConfiguration.xml");
		Car car4 = context.getBean(Car.class);
		System.out.println(car4);

//		Bus bus2 = context.getBean(Bus.class);
//		System.out.println(bus2);
	}

}
