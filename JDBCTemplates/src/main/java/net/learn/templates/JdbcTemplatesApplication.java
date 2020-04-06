package net.learn.templates;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import net.learn.templates.model.ProductModel;
import net.learn.templates.service.ProductService;

@SpringBootApplication
public class JdbcTemplatesApplication {

	public static void main(String[] args) {

		System.out.println("In Main Method ");

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(JdbcTemplatesApplication.class, args);

		System.out.println("Injection Object  "+configurableApplicationContext);

		ProductService productService= configurableApplicationContext.getBean(ProductService.class);

		System.out.println("Prodcut Service  "+ productService);

		ProductModel productModel = new ProductModel();
		productModel.setProductId(467560);
		productModel.setProductName("Xbox-360");
		productModel.setProductOwner("MicroSoft");
		productModel.setProductPrice(new BigDecimal("98786"));
		productModel.setProductQuantity(8);

		System.out.println("Product Info - new "+ productModel);

		int addedCount = productService.addingNewProductInfomation(productModel);

		System.out.println("Newly added Products Count "+addedCount);

		System.out.println("Retriving Products ");

		List<ProductModel> prodModel = productService.getAllProducts();

		prodModel.forEach(product -> System.out.println(product));

	}

}
