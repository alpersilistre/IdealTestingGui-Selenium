import com.google.common.base.Stopwatch;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FsmTest {

    private static String loginCredential = "heide";
    private static int counter = 1;
    private static String errorColor = "rgba(153, 0, 0, 1)";

    private static void OpenArrangementsPage(WebDriver driver) {
        WebElement input = driver.findElement(By.cssSelector("a[href*='?content=main']"));
        clickAndWaitASecond(driver, input);
        input = driver.findElement(By.cssSelector("a[href*='?content=product']"));
        clickAndWaitASecond(driver, input);
        input = driver.findElement(By.xpath("//*[@id=\"leftBox\"]/div/div/table[1]/tbody/tr/td[4]/input[2]"));
        clickAndWaitASecond(driver, input);
        input = driver.findElement(By.cssSelector("input[name*='btn_gotoStep_5']"));
        clickAndWaitASecond(driver, input);
    }

    public static void main(String[] args) throws Exception {
        // This path should be your local chrome driver folder
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alper Silistre\\Downloads\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebElement element;

        String baseUrl = "http://localhost/iselta/";

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        element = driver.findElement(By.id("lang_en"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        element = driver.findElement(By.xpath("//*[@id=\"page_container\"]/div[4]/form/input[2]"));
        element.sendKeys(loginCredential);
        element = driver.findElement(By.id("qlogin_pwd"));
        element.sendKeys(loginCredential);
        element = driver.findElement(By.xpath("//*[@id=\"page_container\"]/div[4]/form/input[4]"));
        element.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        // This path should be a local text file

        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-0.txt"));

        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-1.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-2.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-3.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-4.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-5.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-6.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-7.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-8.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-9.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-10.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-11.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\SpecialsModule\\4-TestGeneratorResults\\CompactTestCases-12.txt"));


        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-0.txt"));

        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-1.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-2.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-3.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-4.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-5.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-6.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-7.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-8.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-9.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-10.txt"));
        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-11.txt"));
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Alper Silistre\\Desktop\\SoftwareTesting-January2020\\AdditionalServicesModule\\4-TestGeneratorResults\\CompactTestCases-12.txt"));

        Stopwatch stopwatch = Stopwatch.createStarted();

        String line;
        while((line = in.readLine()) != null)
        {
            System.out.print(line);
            char[] chars = line.toCharArray();

            boolean testResult = false;

            OpenArrangementsPage(driver);

            for (int i = 0; i < chars.length; i++) {
                if (i + 1 < chars.length) {
                    testResult = ApplyStage(chars[i], driver, chars[i + 1]);
                }
                else {
                    testResult = ApplyStage(chars[i], driver, chars[i]);
                }
                if (!testResult) {
                    System.out.println(" - Fail");
                    break;
                }
            }

            if(testResult) {
                System.out.println(" - Pass");
            }

            counter++;
        }

        in.close();

        driver.close();

        stopwatch.stop();

        long millis = stopwatch.elapsed(TimeUnit.SECONDS);

        System.out.println("that took: " + millis);
    }

    private static boolean ApplyStage(char x, WebDriver driver, char secondChar) {

        WebElement input;
        boolean isEditInputExist;
        boolean isSaveButtonExist;
        boolean isCancelButtonExist;
        boolean isAddButtonExist;
        boolean isItemSaved;

        switch (x) {
            case 'k': // Click the Specials' Edit button
                isEditInputExist = isElementExistByXpath(driver, "/html/body/div/div[2]/form/div[2]/div/div[2]/table[1]/tbody/tr[2]/td[7]/input");
                if(!isEditInputExist) { return false; }

                input = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/table[1]/tbody/tr[2]/td[7]/input"));
                clickAndWaitASecond(driver, input);

                isSaveButtonExist = existsElement(driver, "input[name*='btn_saveSpecial']");
                if(!isSaveButtonExist) { return false; }
                break;
            case 's': // Click the Additional's Edit button
                isEditInputExist = isElementExistByXpath(driver, "/html/body/div/div[2]/form/div[2]/div/div[1]/table[1]/tbody/tr[2]/td[6]/input");
                if(!isEditInputExist) { return false; }

                input = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[1]/table[1]/tbody/tr[2]/td[6]/input"));
                clickAndWaitASecond(driver, input);

                isSaveButtonExist = existsElement(driver, "input[name*='btn_saveAdditionalService']");
                if(!isSaveButtonExist) { return false; }
                break;

            case 'u': // Set text to the Specials' Title box
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Title]']"));
                input.clear();
                counter += 1;
                input.sendKeys("Special Test" + counter);
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'd': // Set text to the Additional's Title box
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][Title]']"));
                input.clear();
                counter += 1;
                input.sendKeys("Additional Test" + counter);
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;

            case 'x': // Set text to the Specials' Number box
                boolean isEnabled = isEnabled(driver, "input[name*='frm_arr_product[Specials][NumberOfPackages]']");
                if(isEnabled) {
                    input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][NumberOfPackages]']"));
                }
                else {
                    input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][AvailableContingent]']"));
                }

                input.clear();
                counter += 1;
                input.sendKeys(Integer.toString(counter));
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'f': // Set text to the Additional's Number box
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][NumberOfPackages]']"));
                input.clear();
                counter += 1;
                input.sendKeys(Integer.toString(counter));
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;

            case 'y': // Set text to the Specials' Price box
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Price]']"));
                input.clear();
                counter += 1;
                input.sendKeys(Integer.toString(counter));
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'g': // Set text to the Additional's Price box
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][Price]']"));
                input.clear();
                counter += 1;
                input.sendKeys(Integer.toString(counter));
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;

            case 'z': // Set text to the Description box
                input = driver.findElement(By.cssSelector("textarea[name*='frm_arr_product[Specials][DescriptionNational]']"));
                input.clear();
                counter += 1;
                input.sendKeys("Test" + counter);
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'w': // Set text to the Description box
                input = driver.findElement(By.cssSelector("textarea[name*='frm_arr_product[AdditionalServices][DescriptionNational]']"));
                input.clear();
                counter += 1;
                input.sendKeys("Test" + counter);
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;

            case 'l': // Click to the Special's Save button in an edit state
                isSaveButtonExist = existsElement(driver, "input[name*='btn_saveSpecial']");
                isCancelButtonExist = existsElement(driver, "input[name*='btn_cancelSpecial']");
                if(!isSaveButtonExist || !isCancelButtonExist) { return false; }

                String aktuellToBeSaved = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][AvailableContingent]']")).getAttribute("value");
                String priceToBeSaved = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Price]']")).getAttribute("value");
                String titleToBeSaved = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Title]']")).getAttribute("value");

                driver.findElement(By.cssSelector("input[name*='btn_saveSpecial']")).click();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

                isItemSaved = IsItemSavedFromSpecialEdit(driver, aktuellToBeSaved, priceToBeSaved, titleToBeSaved);

                if(secondChar == 'e' && !isItemSaved) {
                    return true;
                }
                else if (secondChar == 'e' && isItemSaved) { // Positive testing, error is expected but the system does not gave one
                    return false;
                }

                if(!isItemSaved) {
                    return false;
                }

                break;
            case 'h': // Click to the Additional's Save button in an edit state
                isSaveButtonExist = existsElement(driver, "input[name*='btn_saveAdditionalService']");
                isCancelButtonExist = existsElement(driver, "input[name*='btn_cancelAdditionalService']");
                if(!isSaveButtonExist || !isCancelButtonExist) { return false; }

                String aPriceToBeSaved = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][Price]']")).getAttribute("value");
                String aTitleToBeSaved = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][Title]']")).getAttribute("value");

                driver.findElement(By.cssSelector("input[name*='btn_saveAdditionalService']")).click();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

                isItemSaved = IsItemSavedFromAdditionalEdit(driver, aPriceToBeSaved, aTitleToBeSaved);

                if(secondChar == 'e' && !isItemSaved) {
                    return true;
                }
                else if (secondChar == 'e' && isItemSaved) { // Positive testing, error is expected but the system does not gave one
                    return false;
                }

                if(!isItemSaved) {
                    return false;
                }

                break;
            case 'r': // Clear Specials' fields
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
            case 'j': // Clear Additional's fields
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][Title]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][Price]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][NumberOfPackages]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;

            case 't':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Title]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'c':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][Title]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;

            case 'p':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Price]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'b':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][Price]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;

            case 'n':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][AvailableContingent]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;
            case 'm':
                input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][NumberOfPackages]']"));
                input.clear();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                break;

            case 'v':
                isAddButtonExist = existsElement(driver, "input[name*='btn_addSpecial']");
                if(!isAddButtonExist) { return false; }

                setDatePickers(driver);

                String numberToBeAdd = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][NumberOfPackages]']")).getAttribute("value");
                String priceToBeAdd = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Price]']")).getAttribute("value");
                String titleToBeAdd = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][Title]']")).getAttribute("value");

                driver.findElement(By.cssSelector("input[name*='btn_addSpecial']")).click();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

                isItemSaved = IsItemSavedFromAddSpecial(driver, numberToBeAdd, priceToBeAdd, titleToBeAdd);

                if (isItemSaved) {
                    DeleteSpecialLatestItem(driver);
                }

                if(secondChar == 'e' && !isItemSaved) {
                    return true;
                }
                else if (secondChar == 'e' && isItemSaved) { // Positive testing, error is expected but the system does not gave one
                    return false;
                }

                if(!isItemSaved) {
                    return false;
                }
                break;
            case 'q':
                isAddButtonExist = existsElement(driver, "input[name*='btn_addAdditionalService']");
                if(!isAddButtonExist) { return false; }

                setAdditionalRequiredFields(driver);

                String numberToBeAddAdditional = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][NumberOfPackages]']")).getAttribute("value");
                String priceToBeAddAdditional = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][Price]']")).getAttribute("value");
                String titleToBeAddAdditional = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][Title]']")).getAttribute("value");

                driver.findElement(By.cssSelector("input[name*='btn_addAdditionalService']")).click();
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

                isItemSaved = IsItemSavedFromAddAdditional(driver, numberToBeAddAdditional, priceToBeAddAdditional, titleToBeAddAdditional);

                if (isItemSaved) {
                    DeleteAdditionalLatestItem(driver);
                }

                if(secondChar == 'e' && !isItemSaved) {
                    return true;
                }
                else if (secondChar == 'e' && isItemSaved) { // Positive testing, error is expected but the system does not gave one
                    return false;
                }

                if(!isItemSaved) {
                    return false;
                }
                break;
            default:
                break;
        }

        return true;
    }

    private static boolean IsItemSavedFromSpecialEdit(WebDriver driver, String aktuell, String price, String title) {
        if(DoesSpecialInputGivesAnError("Title", driver)
                || DoesNumberInputGivesAnError(driver)
                || DoesSpecialInputGivesAnError("Price", driver)) {
            return false;
        }

        String savedAktuell = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/table[1]/tbody/tr[2]/td[5]")).getText();
        String savedPriceWithEuro = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/table[1]/tbody/tr[2]/td[6]")).getText();
        String savedTitle = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/table[1]/tbody/tr[2]/td[2]")).getText();

        String[] temp = savedPriceWithEuro.split(" ");
        String savedPrice = temp[0];

        return aktuell.equals(savedAktuell) && price.equals(savedPrice) && title.equals(savedTitle);
    }

    private static boolean IsItemSavedFromAdditionalEdit(WebDriver driver, String price, String title) {
        if(DoesAdditionalInputGivesAnError("Title", driver)
                || DoesAdditionalInputGivesAnError("NumberOfPackages", driver)
                || DoesAdditionalInputGivesAnError("Price", driver)) {
            return false;
        }

        String savedPriceWithEuro = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[1]/table[1]/tbody/tr[2]/td[5]")).getText();
        String savedTitle = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[1]/table[1]/tbody/tr[2]/td[2]")).getText();

        String[] temp = savedPriceWithEuro.split(" ");
        String savedPrice = temp[0];

        return price.equals(savedPrice) && title.equals(savedTitle);
    }

    private static boolean IsItemSavedFromAddSpecial(WebDriver driver, String number, String price, String title) {
        if(DoesSpecialInputGivesAnError("Title", driver)
                || DoesNumberInputGivesAnError(driver)
                || DoesSpecialInputGivesAnError("Price", driver)) {
            return false;
        }

        String savedNumber;
        String savedPrice;
        String savedTitle;

        String numberXpath = "/html/body/div/div[2]/form/div[2]/div/div[2]/table[1]/tbody/tr[3]/td[4]";
        String priceXpath = "/html/body/div/div[2]/form/div[2]/div/div[2]/table[1]/tbody/tr[3]/td[6]";
        String titleXpath = "/html/body/div/div[2]/form/div[2]/div/div[2]/table[1]/tbody/tr[3]/td[2]";

        if (isElementExistByXpath(driver, numberXpath)) {
            savedNumber = driver.findElement(By.xpath(numberXpath)).getText();
        }
        else { return false; }

        if (isElementExistByXpath(driver, priceXpath)) {
            savedPrice = driver.findElement(By.xpath(priceXpath)).getText();
        }
        else { return false; }

        if (isElementExistByXpath(driver, titleXpath)) {
            savedTitle = driver.findElement(By.xpath(titleXpath)).getText();
        }
        else { return false; }

        return number.equals(savedNumber) && ((price + " €").equals(savedPrice) || (price + "€").equals(savedPrice)) && title.equals(savedTitle);
    }

    private static boolean IsItemSavedFromAddAdditional(WebDriver driver, String number, String price, String title) {
        if(DoesAdditionalInputGivesAnError("Title", driver)
                || DoesAdditionalInputGivesAnError("NumberOfPackages", driver)
                || DoesAdditionalInputGivesAnError("Price", driver)) {
            return false;
        }

        String savedNumber;
        String savedPrice;
        String savedTitle;

        String additionalNumberXpath = "/html/body/div/div[2]/form/div[2]/div/div[1]/table[1]/tbody/tr[3]/td[4]";
        String additionalPriceXpath = "/html/body/div/div[2]/form/div[2]/div/div[1]/table[1]/tbody/tr[3]/td[5]";
        String additionalTitleXpath = "/html/body/div/div[2]/form/div[2]/div/div[1]/table[1]/tbody/tr[3]/td[2]";

        if (isElementExistByXpath(driver, additionalNumberXpath)) {
            savedNumber = driver.findElement(By.xpath(additionalNumberXpath)).getText();
        }
        else { return false; }

        if (isElementExistByXpath(driver, additionalPriceXpath)) {
            savedPrice = driver.findElement(By.xpath(additionalPriceXpath)).getText();
        }
        else { return false; }

        if (isElementExistByXpath(driver, additionalTitleXpath)) {
            savedTitle = driver.findElement(By.xpath(additionalTitleXpath)).getText();
        }
        else { return false; }

        return number.equals(savedNumber) && ((price + " €").equals(savedPrice) || (price + "€").equals(savedPrice)) && title.equals(savedTitle);
    }

    private static void DeleteSpecialLatestItem(WebDriver driver) {
        WebElement input;
        try{
            input = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/table[1]/tbody/tr[3]/td[8]/input"));
            input.click();
            driver.manage().timeouts().implicitlyWait(250, TimeUnit.MILLISECONDS);
            driver.switchTo().alert().accept();
            driver.manage().timeouts().implicitlyWait(250, TimeUnit.MILLISECONDS);
        }
        catch (NoSuchElementException ignored) {
        }
    }

    private static void DeleteAdditionalLatestItem(WebDriver driver) {
        WebElement input;
        try{
            input = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[1]/table[1]/tbody/tr[3]/td[7]/input"));
            input.click();
            driver.manage().timeouts().implicitlyWait(250, TimeUnit.MILLISECONDS);
            driver.switchTo().alert().accept();
            driver.manage().timeouts().implicitlyWait(250, TimeUnit.MILLISECONDS);
        }
        catch (NoSuchElementException ignored) {
        }
    }

    private static boolean DoesSpecialInputGivesAnError(String name, WebDriver driver) {
        WebElement input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][" + name + "]']"));
        String backgroundColor = input.getCssValue("background-color");

        return backgroundColor.equals(errorColor);
    }

    private static boolean DoesAdditionalInputGivesAnError(String name, WebDriver driver) {
        WebElement input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[AdditionalServices][" + name + "]']"));
        String backgroundColor = input.getCssValue("background-color");

        return backgroundColor.equals(errorColor);
    }

    private static boolean DoesNumberInputGivesAnError(WebDriver driver) {
        WebElement input;
        String backgroundColor;

        if (existsElement(driver, "input[name*='btn_cancelSpecial']")) {
            input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][AvailableContingent]']"));
            backgroundColor = input.getCssValue("background-color");
        }
        else {
            input = driver.findElement(By.cssSelector("input[name*='frm_arr_product[Specials][NumberOfPackages]']"));
            backgroundColor = input.getCssValue("background-color");
        }

        return backgroundColor.equals(errorColor);

    }

    private static void setDatePickers (WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/table[2]/tbody/tr[2]/td[2]/img[1]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[7]/td[4]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/table[2]/tbody/tr[2]/td[2]/img[2]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[7]/td[5]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    private static void setAdditionalRequiredFields (WebDriver driver) {
        String checkBox = "/html/body/div/div[2]/form/div[2]/div/div[1]/table[2]/tbody/tr[3]/td[2]/input[2]";
        Boolean isChecked = driver.findElement(By.xpath(checkBox)).isSelected();
        if (!isChecked) { driver.findElement(By.xpath(checkBox)).click(); }

        Select selectBox = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[1]/table[2]/tbody/tr[4]/td[2]/select")));
        Boolean isElementSelected = existSelectedElement(selectBox);

        if (!isElementSelected) {
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[1]/table[2]/tbody/tr[4]/td[2]/select/option[1]")).click();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        }
    }

    private static boolean existSelectedElement(Select selectBox) {
        try {
            selectBox.getFirstSelectedOption();
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
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

    private static boolean isEnabled(WebDriver driver, String id) {
        boolean isEnabled;
        WebElement element = driver.findElement(By.cssSelector(id));
        isEnabled = element.isEnabled();
        return isEnabled;
    }

    private static void clickAndWaitASecond(WebDriver driver, WebElement input){
        input.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
}
