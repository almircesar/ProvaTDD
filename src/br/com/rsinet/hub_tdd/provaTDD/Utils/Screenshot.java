//package br.com.rsinet.hub_tdd.provaTDD.Utils;


//import java.io.File;

//import org.apache.logging.log4j.core.util.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;

 

//public class Screenshot {
//   public static void printTela(WebDriver driver, String arquivo) {
//        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(screenshot, new File(arquivo));
//            
//        } catch (Exception e) {
//            System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
//        }
//    }
//}