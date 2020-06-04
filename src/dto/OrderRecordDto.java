package dto;

public class OrderRecordDto {
	int order_id;
	String order_time;
	int shop_id;
	int order_amount;
	int customer_id;
	String customer_name;
	int customer_age;
	String customer_birthday;
	String customer_gender;
	String customer_location;
	
	public OrderRecordDto() {}
	public OrderRecordDto(
			int order_id, 
			String order_time,
			int shop_id,
			int order_amount,
			int customer_id,
			String customer_name,
			int customer_age,
			String customer_birthday,
			String customer_gender,
			String customer_location) 
	
	{	
		    this.order_id = order_id;
		    this.order_time = order_time;
			this.shop_id = shop_id;
			this.order_amount = order_amount;
			this.customer_id = customer_id;
			this.customer_name = customer_name;
			this.customer_age = customer_age;
			this.customer_birthday = customer_birthday;
			this.customer_gender = customer_gender;
			this.customer_location = customer_location;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrder_time() {
		return order_time;
	}

	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}

	public int getShop_id() {
		return shop_id;
	}

	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}

	public int getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(int order_amount) {
		this.order_amount = order_amount;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getCustomer_age() {
		return customer_age;
	}

	public void setCustomer_age(int customer_age) {
		this.customer_age = customer_age;
	}

	public String getCustomer_birthday() {
		return customer_birthday;
	}

	public void setCustomer_birthday(String customer_birthday) {
		this.customer_birthday = customer_birthday;
	}

	public String getCustomer_gender() {
		return customer_gender;
	}

	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}

	public String getCustomer_location() {
		return customer_location;
	}

	public void setCustomer_location(String customer_location) {
		this.customer_location = customer_location;
	}
}
