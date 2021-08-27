import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FilePractice {
	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		
		
		try {
			File file = new File("C:\\Users\\3P003\\Desktop\\file1.xlsx");
			FileOutputStream fileout = new FileOutputStream(file);
			
			//sheet 생성
			XSSFWorkbook xworkbook = new XSSFWorkbook();
			XSSFSheet xsheet = xworkbook.createSheet("도서 대여 정보");
			XSSFRow curRow;
			
			//cell 스타일
			CellStyle style = xworkbook.createCellStyle();
			style.setAlignment(HorizontalAlignment.CENTER);
			
			int row = list.size();
			Cell cell = null;
			
			// Sheet Title
			curRow = xsheet.createRow(0);
			cell = curRow.createCell(0);
			cell.setCellValue("전국 메가박스 지점");
			
			// Head
			curRow = xsheet.createRow(1);
			cell = curRow.createCell(0);
			cell.setCellValue("번호");
			cell.setCellStyle(style);
			
			cell = curRow.createCell(1);
			cell.setCellValue("제목");
			cell.setCellStyle(style);
			
			cell = curRow.createCell(2);
			cell.setCellValue("출판사");
			cell.setCellStyle(style);
			
			cell = curRow.createCell(3);
			cell.setCellValue("분류");
			cell.setCellStyle(style);
			
			cell = curRow.createCell(4);
			cell.setCellValue("위치");
			cell.setCellStyle(style);
			
			cell = curRow.createCell(5);
			cell.setCellValue("언어");
			cell.setCellStyle(style);
			
			
			
			xworkbook.write(fileout);
			fileout.close();
			
			
			
			
//			FileWriter fw = new FileWriter(file);
//			PrintWriter writer = new PrintWriter(fw);
//			
//			writer.write("안녕하세요\n");
//			writer.println("Nice to meet you");
//			writer.print("!!");
			System.out.println("작성 완료");
			
//			writer.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

		
	}
}
