package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShots {
    public static String capture(WebDriver driver , String testName) {
//        Sourse of screenShot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

//        determain path

        String path = "ScreenShots/" + testName + "_"
                + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) +
                "png";
        File dest = new File(path);
//        copy
        try {

            FileUtils.copyFile(src,dest);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
//        return path
        return path;
    }
}
