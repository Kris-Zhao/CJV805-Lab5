import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 * 
 * @author Yuhang Zhao
 *
 */
@ManagedBean(name="orderBean")
public class OrderBean implements Serializable{
	private String comboQuantity;
	private String coffeeQuantity;
	private String teaQuantity;
	
	//getter methods
	public String getComboQuantity() {
		return this.comboQuantity;
	}
	public String getCoffeeQuantity() {
		return this.coffeeQuantity;
	}
	public String getTeaQuantity() {
		return this.teaQuantity;
	}
	
	//setter methods
	public void setComboQuantity(String comboQuantity) {
		this.comboQuantity = comboQuantity;
	}
	public void setCoffeeQuantity(String coffeeQuantity) {
		this.coffeeQuantity = coffeeQuantity;
	}
	public void setTeaQuantity(String teaQuantity) {
		this.teaQuantity = teaQuantity;
	}
	
	//return results
	public String getResult() {
		if(comboQuantity!=null && (coffeeQuantity!=null || teaQuantity!=null)) {
			return "<p style=\"background-color:yellow;width:250px;" +
		            "padding:5px\">Thank you, your order is placed. </p>";
		}else return "";
		
	}
}
