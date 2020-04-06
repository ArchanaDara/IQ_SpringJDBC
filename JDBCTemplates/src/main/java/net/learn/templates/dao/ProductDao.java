package net.learn.templates.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import net.learn.templates.daoMapper.ProductDaoMapper;
import net.learn.templates.model.ProductModel;

@Repository
@Component
public class ProductDao implements ProductDAOOperations {

	@Autowired NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public int addProduct(ProductModel productModel) {
		// TODO Auto-generated method stub
		
		System.out.println("In Product Dao of add");

		String insertSQL = "INSERT INTO PRODUCT_TABLE"
				+ "(PRODUCT_ID, PRODUCT_NAME,PRODUCT_OWNER,PRODUCT_QUANTITY,PRODUCT_PRICE)"
				+ "VALUES(:product_id,:product_name,:product_owner,:product_quantity,:product_price)";

		MapSqlParameterSource sourceMap = new MapSqlParameterSource();

		sourceMap.addValue("product_id", productModel.getProductId());
		sourceMap.addValue("product_name", productModel.getProductName());
		sourceMap.addValue("product_owner", productModel.getProductOwner());
		sourceMap.addValue("product_quantity", productModel.getProductQuantity());
		sourceMap.addValue("product_price", productModel.getProductPrice());

		return namedParameterJdbcTemplate.update(insertSQL, sourceMap);

	}

	@Override
	public ProductModel retriveProductById(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductModel> retriveAllProducts() {
		// TODO Auto-generated method stub
		
		System.out.println("PRODCUT_TABLE records ");
		
		return namedParameterJdbcTemplate.query("SELECT * FROM PRODUCT_TABLE", new ProductDaoMapper());
	}



}
