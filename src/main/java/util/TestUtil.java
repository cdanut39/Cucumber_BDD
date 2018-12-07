package util;

import base.TestBase;
import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtil extends TestBase {

    public static long IMPLICIT_WAIT = 15;
    public static long PAGE_LOAD_TIMEOUT = 15;

    public static String TESTDATA_SHEET_PATH = "*.com/app/qa/testData/AppTestData.xlsx";

    private static Workbook book;
    private static Sheet sheet;

    public static Object[][] getTestData(String sheetName) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetName);

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
            }
        }
        return data;
    }

    public static String getCurrentDateAndTime()
    {
        Date now = new Date();

        String strDateFormat = "dd-MMM-yyyy HH:mm:ss";

        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);

        return objSDF.format(now);
    }




//    public static String takeScreenshotAtEndOfTest(String testName) throws IOException {
//
//        TakesScreenshot ts = (TakesScreenshot) driver;
//
//        File source = ts.getScreenshotAs(OutputType.FILE);
//
//
//        String destination = System.getProperty("user.dir") + "/FailedTestsScreenshot/" + testName +
//                getCurrentDateAndTime() + ".png";
//
//        File finalDestination = new File(destination);
//
//        FileUtils.copyFile(source, finalDestination);
//
//        return destination;
//    }
//
//
//
//    public static void takeScreenShotOnFAILURE(Scenario scenario) throws IOException {
//
//        if (scenario.isFailed()) {
//
//            takeScreenshotAtEndOfTest(scenario.getName());
//        }

//    }
    public static void takeScreenShot(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }  
    }

}
