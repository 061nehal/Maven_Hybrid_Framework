
package testCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Operation.Abstract;
import Operation.ReadObject;
import Operation.UIOperation;

public class HybridTestCaseTest extends Abstract {
	
	@Test(dataProvider ="hybridData")
	public void ApplicationUnderTest(String testcasseid, String testcasename, String keyword, String objectname,
			
			String objecttype, String data) throws Exception {
		
		ReadObject object=new ReadObject();
		
		Properties allobject=object.getObjectRepository();
		UIOperation  operation=new UIOperation(driver);
		operation.keyWordPerform(allobject, keyword, objectname, objecttype, data);
		
		
	}
	@DataProvider(name="hybridData")
	public Object[][] getDataFromDataProvider() throws IOException{
		Object[][] object=null;
		
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\data\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Data1");
		
		int rowCount=ws.getLastRowNum()-ws.getFirstRowNum();
		int colCount=ws.getRow(0).getLastCellNum();
		
		object=new Object[rowCount][colCount];
		
		for(int i=0; i<rowCount; i=i+1) {
			Row row=ws.getRow(i+1);
			
			for(int j=0; j<row.getLastCellNum(); j=j+1) {
				object[i][j]=row.getCell(j).toString();
			}
		}
		return object;
	}

}
