package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity//anatasyon //veri tabanı nesnesi
@Table(name="products")//veri tabanında hangi tabloya karşılık geldiğini gösterir
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Tek tek arttırma
	@Column(name="product_id")//kolon olarak neye karşılık geldiğini gösterir
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	
}
