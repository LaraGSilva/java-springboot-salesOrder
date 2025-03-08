package com.laragoncalves.salesProject.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.laragoncalves.salesProject.entities.Category;
import com.laragoncalves.salesProject.entities.Order;
import com.laragoncalves.salesProject.entities.OrderItem;
import com.laragoncalves.salesProject.entities.Payment;
import com.laragoncalves.salesProject.entities.Product;
import com.laragoncalves.salesProject.entities.User;
import com.laragoncalves.salesProject.enums.OrderStatus;
import com.laragoncalves.salesProject.repositories.CategoryRepository;
import com.laragoncalves.salesProject.repositories.OrderItemRepository;
import com.laragoncalves.salesProject.repositories.OrderRepository;
import com.laragoncalves.salesProject.repositories.ProductRepository;
import com.laragoncalves.salesProject.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "1273456"); 
		userRepository.saveAll(Arrays.asList(u1,u2));
		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.PAID);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.WAITIG_PAYMENT);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.CANCELED);
		orderRepository.saveAll(Arrays.asList(o1, o2,o3));
		
		Category c1 = new Category(null, "Lara G");
		Category c2 = new Category(null, "Luana G");
		Category c3 = new Category(null, "Maria G");
		categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		p1.getCategories().add(c2);
		p2.getCategories().add(c1);
		p3.getCategories().add(c2);
		p4.getCategories().add(c3);
		p5.getCategories().add(c1);
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		OrderItem oi1= new OrderItem(o1,p1,2,p1.getPrice());
		OrderItem oi2= new OrderItem(o1,p3,3,p3.getPrice());
		OrderItem oi3= new OrderItem(o2,p2,1,p2.getPrice());
		OrderItem oi4= new OrderItem(o2,p4,4,p4.getPrice());
		OrderItem oi5= new OrderItem(o3,p5,2,p5.getPrice());
		
		orderItemRepository.saveAll(Arrays.asList(oi1,oi2,oi3,oi4,oi5));
		
		
		Payment pay1 = new Payment(null,Instant.parse("2019-06-20T20:53:07Z"), o1);
		o1.setPayment(pay1);
		orderRepository.save(o1);
	}
	
	

}
