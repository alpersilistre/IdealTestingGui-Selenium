import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

public class FsmTest {

    private static int addCounter = 0;

    public static void main(String[] args) throws Exception {

        Stopwatch stopwatch = Stopwatch.createStarted();

        // This path should be your local chrome driver folder
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alper Silistre\\Downloads\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebElement element = null;

        String baseUrl = "http://localhost/iselta/";

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        element = driver.findElement(By.id("lang_en"));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        element = driver.findElement(By.xpath("//*[@id=\"page_container\"]/div[4]/form/input[2]"));
        element.sendKeys("heide");
        element = driver.findElement(By.id("qlogin_pwd"));
        element.sendKeys("heide");
        element = driver.findElement(By.xpath("//*[@id=\"page_container\"]/div[4]/form/input[4]"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        // This path should be a local text file
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\PositiveTestSuite.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\NegativeTestSuite.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\0 Original FSM generated test cases.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\1 add with empty boxes FSM generated test cases.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\2 update with empty boxs FSM generated test cases.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\3 add with empty number of packages box FSM .txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\4 add with empty price box FSM generated test cases.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\5 add with empty title box FSM generated test cases.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\6 update with empty title box FSM generated test cases.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\7 update with empty price box FSM generated test cases.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\8 update with empty number box FSM generated test cases.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\9 Add click does not respond FSM generated test cases.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\10 Edit click does not respond FSM generated test cases.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\11 Both Add and Edit click does not respond FSM generated test cases.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\5 Final Test cases\\12 After edit save button move to initial state without saving FSM generated test cases.txt"));

        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\0 Original FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\1 add with empty boxes FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\2 update with empty boxs FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\3 add with empty number of packages box FSM - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\4 add with empty price box FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\5 add with empty title box FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\6 update with empty title box FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\7 update with empty price box FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\8 update with empty number box FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\9 Add click does not respond FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\10 Edit click does not respond FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\11 Both Add and Edit click does not respond FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 90 coverage\\12 After edit save button move to initial state without saving FSM generated test cases - RANDOM.txt"));

        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\0 Original FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\1 add with empty boxes FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\2 update with empty boxs FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\3 add with empty number of packages box FSM - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\4 add with empty price box FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\5 add with empty title box FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\6 update with empty title box FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\7 update with empty price box FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\8 update with empty number box FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\9 Add click does not respond FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\10 Edit click does not respond FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\11 Both Add and Edit click does not respond FSM generated test cases - RANDOM.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\Random Final Test Cases - 60 coverage\\12 After edit save button move to initial state without saving FSM generated test cases - RANDOM.txt"));

        int counter = 1;
        boolean isAdditionalRowsDeleted = false;

        String line;
        while((line = in.readLine()) != null)
        {
            System.out.print(line);
            char[] chars = line.toCharArray();

            boolean testResult = false;

            WebElement input = null;

            input = driver.findElement(By.cssSelector("a[href*='?content=main']"));
            input.click();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            input = driver.findElement(By.cssSelector("a[href*='?content=product']"));
            input.click();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            input = driver.findElement(By.xpath("//*[@id=\"leftBox\"]/div/div/table[1]/tbody/tr/td[4]/input[2]"));
            input.click();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            input = driver.findElement(By.cssSelector("input[name*='btn_gotoStep_5']"));
            input.click();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

            if(!isAdditionalRowsDeleted) {
                for(int i = 0; i < 9; i++) {
                    deleteIfExist(driver, "//*[@id=\"leftBox\"]/div/div[2]/table[1]/tbody/tr[3]/td[8]/input");
                }
                isAdditionalRowsDeleted = true;
            }

            for (char aChar : chars) {
                testResult = ApplyStage(aChar, driver, baseUrl, counter);
                if (!testResult) {
                    System.out.println(" - Fail");
                    break;
                }
            }

            if(testResult) {
                System.out.println(" - Pass");
            }

            //System.out.println("----");
            counter++;
        }

        in.close();

        driver.close();

        stopwatch.stop();

        long millis = stopwatch.elapsed(TimeUnit.SECONDS);

        System.out.println("that took: " + millis);
    }

    private static boolean ApplyStage(char x, WebDriver driver, String baseUrl, int counter) {

        WebElement input;
        boolean isEditInputExist = false;
        boolean isSaveButtonExist = false;
        boolean isCancelButtonExist = false;
        boolean isAddButtonExist = false;
        boolean isTitleErrorExist = false;
        boolean isPriceErrorExist = false;
        boolean isNumberErrorExist = false;
        boolean isItemAdded = false;

        switch (x) {
            case 'k':
                isEditInputExist = isElementExistByXpath(driver, "//*[@id=\"leftBox\"]/div/div[2]/table[1]/tbody/tr[2]/td[7]/input");
                if(isEditInputExist) {
                    input = driver.findElement(By.xpath("//*[@id=\"leftBox\"]/div/div[2]/table[1]/tbody/tr[2]/td[7]/input"));
                    input.click();
                    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                }
                isSaveButtonExist = existsElement(driver, "input[name*='btn_saveSpecial']");
                if(!isSaveButtonExist) {
                    return false;
                }
                break;
            case 'u':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Title]']"));
                input.clear();
                input.sendKeys("Test" + counter);
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'x':
                boolean isEnabled = isEnabled(driver, "input[name*='frm_arr_product[Specials][NumberOfPackages]']");
                if(isEnabled) {
                    input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][NumberOfPackages]']"));
                }
                else {
                    input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][AvailableContingent]']"));
                }

                input.clear();
                input.sendKeys(Integer.toString(counter));
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'y':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Price]']"));
                input.clear();
                input.sendKeys(Integer.toString(counter));
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'z':
                input = driver.findElement(By.cssSelector("textarea[name*='frm_arr_product[Specials][DescriptionNational]']"));
                input.clear();
                input.sendKeys("Test" + counter);
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'l':
                isSaveButtonExist = existsElement(driver, "input[name*='btn_saveSpecial']");
                isCancelButtonExist = existsElement(driver, "input[name*='btn_cancelSpecial']");
                if(!isSaveButtonExist || !isCancelButtonExist) {
                    return false;
                }
                input = driver.findElement(By.cssSelector("input[name*='btn_saveSpecial']"));
                input.click();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Title]']"));
                String a = input.getCssValue("background-color");
                String b = "rgba(153, 0, 0, 1)";
                if(a.equals(b)) {
                    isTitleErrorExist = true;
                }

                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Price]']"));
                a = input.getCssValue("background-color");
                b = "rgba(153, 0, 0, 1)";
                if(a.equals(b)) {
                    isPriceErrorExist = true;
                }

                isAddButtonExist = existsElement(driver, "input[name*='frm_arr_product[Specials][AvailableContingent]");
                if(isAddButtonExist) {
                    input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][AvailableContingent]']"));
                }
                else {
                    input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][NumberOfPackages]']"));
                }

                a = input.getCssValue("background-color");
                b = "rgba(153, 0, 0, 1)";
                if(a.equals(b)) {
                    isNumberErrorExist = true;
                }

                if(isTitleErrorExist || isPriceErrorExist || isNumberErrorExist) {
                    return false;
                }
                break;
            case 'r':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Title]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Price]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                input = driver.findElement(By.cssSelector("textarea[name*='frm_arr_product[Specials][DescriptionNational]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                boolean isEnabledForClear = isEnabled(driver, "input[name*='frm_arr_product[Specials][NumberOfPackages]']");
                if(isEnabledForClear) {
                    input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][NumberOfPackages]']"));
                }
                else {
                    input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][AvailableContingent]']"));
                }
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 't':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Title]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'p':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Price]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'n':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][AvailableContingent]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'v':
                isAddButtonExist = existsElement(driver, "input[name*='btn_addSpecial']");
                if(!isAddButtonExist) {
                    return false;
                }

                if(addCounter > 7) {
                    for(int i = 0; i < 8; i++) {
                        deleteIfExist(driver, "//*[@id=\"leftBox\"]/div/div[2]/table[1]/tbody/tr[3]/td[8]/input");
                    }
                    addCounter = 0;
                }

                setDatePickers(driver);

                String titleToBeAdd = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Title]']")).getAttribute("value");

                driver.findElement(By.cssSelector("input[name*='btn_addSpecial']")).click();
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Title]']"));
                isTitleErrorExist = false;
                String c = input.getCssValue("background-color");
                String d = "rgba(153, 0, 0, 1)";
                if(c.equals(d)) {
                    isTitleErrorExist = true;
                }

                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Price]']"));
                isPriceErrorExist = false;
                c = input.getCssValue("background-color");
                d = "rgba(153, 0, 0, 1)";
                if(c.equals(d)) {
                    isPriceErrorExist = true;
                }

                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][NumberOfPackages]']"));
                isNumberErrorExist = false;
                c = input.getCssValue("background-color");
                d = "rgba(153, 0, 0, 1)";
                if(c.equals(d)) {
                    isNumberErrorExist = true;
                }

                if(driver.getPageSource().contains(titleToBeAdd)) {
                    isItemAdded = true;
                }

                if(isTitleErrorExist || isPriceErrorExist || isNumberErrorExist || !isItemAdded) {
                    return false;
                }
                addCounter++;
                break;
            default:
                break;
        }

        return true;
    }

    private static void setDatePickers (WebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"leftBox\"]/div/div[2]/table[2]/tbody/tr[2]/td[2]/img[1]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]/table/tbody/tr[7]/td[4]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"leftBox\"]/div/div[2]/table[2]/tbody/tr[2]/td[2]/img[2]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]/table/tbody/tr[7]/td[5]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    private static boolean existsElement(WebDriver driver, String id) {
        try {
            driver.findElement(By.cssSelector(id));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    private static boolean isElementExistByXpath(WebDriver driver, String xpath) {
        try {
            driver.findElement(By.xpath(xpath));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    private static void deleteIfExist(WebDriver driver, String id) {
        WebElement input = null;
        try {
            input = driver.findElement(By.xpath(id));
            input.click();
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
            driver.switchTo().alert().accept();
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        } catch (NoSuchElementException ignored) {
        }
    }

    private static boolean isEnabled(WebDriver driver, String id) {
        boolean isEnabled;
        WebElement element = driver.findElement(By.cssSelector(id));
        isEnabled = element.isEnabled();
        return isEnabled;
    }

}
