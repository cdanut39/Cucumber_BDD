package util;

import base.TestBase;
import com.vimalselvam.cucumber.listener.Reporter;
import config.Constants;
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


    private static Workbook book;
    private static Sheet sheet;

    public static Object[][] getTestData(String sheetName) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(Constants.TESTDATA_SHEET_PATH);
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

    public static String getCurrentDateAndTime() {
        Date now = new Date();

        String strDateFormat = "dd-MMM-yyyy HH:mm:ss";

        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);

        return objSDF.format(now);
    }

//
//    public static String takeScreenshotAtEndOfTest(Scenario scenario) throws IOException {
//
//        TakesScreenshot ts = (TakesScreenshot) driver;
//
//        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//
//
//        String destination = System.getProperty("user.dir") + "/target/" + scenario.getName().replace("\\s", "_").replace("-", "_").replace(":", "_") +
//                getCurrentDateAndTime() + ".png";
//
//        File finalDestination = new File(destination);
//
//        FileUtils.copyFile(sourceFile, finalDestination);
//
//        return destination;
//    }


    public static void takeScreenShot(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }

}
