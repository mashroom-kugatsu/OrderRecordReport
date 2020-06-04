package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.OrderRecordDto;

public class OrderRecordDao {
	// データベース接続に使用する情報
	private final String JDBC_URL = "jdbc:postgresql://localhost/postgres";
	private final String DB_USER = "postgres";
	private final String DB_PASS = "postgres";

	public List<OrderRecordDto> findAll() {
		List<OrderRecordDto> orderRecordList = new ArrayList<OrderRecordDto>();

		// データベース接続
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

			// SELECT文の準備
			String sql =
					"select \r\n" + 
					"    orders.order_id --0\r\n" + 
					"	,orders.order_time --1\r\n" + 
					"	,orders.shop_id --2\r\n" + 
					"	,orders.order_amount --3\r\n" + 
					"	,customers.customer_id --4\r\n" + 
					"	,customers.customer_name --5\r\n" + 
					"	,customers.customer_age --6\r\n" + 
					"	,customers.customer_birthday --7\r\n" + 
					"	,customers.customer_gender --8 \r\n" + 
					"	,customers.customer_location --9\r\n" + 
					"from orders\r\n" + 
					"left join customers on orders.customer_id = customers.customer_id \r\n" + 
					"order by order_time asc\r\n" + 
					"limit 10";		
			
			System.out.println(sql);
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SELECTの実行
			ResultSet rs = pStmt.executeQuery();

			// SELECTの結果をArrayListに格納
			while (rs.next()) {

				int order_id = rs.getInt("order_id");
				String order_time = rs.getString("order_time");
				int shop_id = rs.getInt("shop_id");
				int order_amount = rs.getInt("order_amount");
				int customer_id = rs.getInt("customer_id");
				String customer_name = rs.getString("customer_name");
				int customer_age = rs.getInt("customer_age");
				String customer_birthday = rs.getString("customer_birthday");
				String customer_gender = rs.getString("customer_gender");
				String customer_location = rs.getString("customer_location");

				OrderRecordDto dto = new OrderRecordDto(order_id, order_time, shop_id, order_amount, customer_id,
						customer_name, customer_age, customer_birthday, customer_gender, customer_location);

				orderRecordList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return orderRecordList;
	}

}