package nika.tutorial.demo;

import nika.tutorial.demo.basic.BinarySearch;
import nika.tutorial.demo.cdi.SomeCDIClass;
import nika.tutorial.demo.scopes.PersonDAO;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication  //--boot. does not need component scan specified
@Configuration //core
@ComponentScan("nika.tutorial.demo")
@PropertySource("classpath:application.properties")
public class  DemoApplication {
	public static void main(String[] args) {

		//ApplicationContext context = SpringApplication.run(DemoApplication.class, args); //--boot
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class); //core

		System.out.println();
		BinarySearch search = context.getBean("binarySearch", BinarySearch.class);           //new BinarySearch(new BubbleSort());
		int[] arr = new int[] {1, 2, 3};
		search.search(arr, 2);
		System.out.println("Task: " + search.getTask());

//		PersonDAO persondao = context.getBean("personDAO", PersonDAO.class);
//		PersonDAO persondao1 = context.getBean("personDAO", PersonDAO.class);
//
//		System.out.println("Person beans: ");
//		System.out.println(persondao);
//		System.out.println(persondao1);
//
//		System.out.println("\nJDBC beans: ");
//		System.out.println(persondao.getJdbc());
//		System.out.println(persondao1.getJdbc());
		//PersonDAO is singleton and JdbcConnection is prototype with a proxy mode

		SomeCDIClass cdi = context.getBean("someCDIClass", SomeCDIClass.class);
		System.out.println("\nA bean with CDI annotations: "+cdi+"\n");

		context.close();


	}

}
