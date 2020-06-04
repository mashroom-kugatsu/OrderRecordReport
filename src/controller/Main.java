package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import dto.OrderRecordDto;
import model.GetOrderRecordListLogic;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GetOrderRecordListLogic getOrderRecordListLogic = new GetOrderRecordListLogic();
		List<OrderRecordDto> orderRecordList = getOrderRecordListLogic.execute();

		for (OrderRecordDto dto : orderRecordList) {
			System.out.print(dto.getOrder_id() + ",");
			System.out.print(dto.getOrder_time() + ",");
			System.out.print(dto.getCustomer_name() + ",");
			System.out.print(dto.getCustomer_age() + ",");
			System.out.print(dto.getCustomer_gender() + ",");
			System.out.println("");
		}
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();

		int rowStart = 0;
		int rowEnd = 99999;
		int lastColumn = 5;

		for (int i = rowStart; i <= rowEnd; i++) {
			Row row = sheet.createRow(i);
			for (int j = 0; j < lastColumn; j++) {
				Cell cell = row.createCell(j);
				for (int k= 0; k < orderRecordList.size(); k++) {
					cell.setCellValue(orderRecordList.get(k).toString());
				}
			}
		}

		// ファイルに保存

		String filename = "C:\\Users\\S.Matsukawa\\Desktop\\Java\\デリバリーレポート再現練習用\\workbook.xlsx";

		try (FileOutputStream out = new FileOutputStream(filename);) {
			workbook.write(out);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
