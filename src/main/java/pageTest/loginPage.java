package pageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class loginPage {
    WebDriver wb;
    public loginPage(WebDriver wb){
        this.wb=wb;
        PageFactory.initElements(wb,this);
    }

    @FindBy(xpath = "//input[@id='loginid']")
    private WebElement loginId;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//b[normalize-space()='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[normalize-space()='Add New Sample']")
    private WebElement addNewSample;

    @FindBy(xpath = "//select[@id='ddlsamplesourceinfo']")
    private WebElement waterSource;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/input[2]")
    private WebElement paramOnePresence;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/input[3]")
    private WebElement paramOneAbsence;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/input[4]")
    private WebElement paramOneNotTested;

    @FindBy(xpath = "//tbody/tr[2]/td[5]/div[1]/input[2]")
    private WebElement paramTwoPresence;

    @FindBy(xpath = "//tbody/tr[2]/td[5]/div[1]/input[3]")
    private WebElement paramTwoAbsence;

    @FindBy(xpath = "//tbody/tr[2]/td[5]/div[1]/input[4]")
    private WebElement paramTwoNotTested;

    @FindBy(xpath = "//tbody/tr[3]/td[5]/div[1]/input[2]")
    private WebElement paramThreePresence;

    @FindBy(xpath = "//tbody/tr[3]/td[5]/div[1]/input[3]")
    private WebElement paramThreeAbsence;

    @FindBy(xpath = "//tbody/tr[3]/td[5]/div[1]/input[4]")
    private WebElement paramThreeNotTested;

    @FindBy(xpath = "//tbody/tr[4]/td[5]/div[1]/input[2]")
    private WebElement paramFourPresence;

    @FindBy(xpath = "//tbody/tr[4]/td[5]/div[1]/input[3]")
    private WebElement paramFourAbsence;

    @FindBy(xpath = "//tbody/tr[4]/td[5]/div[1]/input[4]")
    private WebElement paramFourNotTested;

    @FindBy(xpath = "//tbody/tr[5]/td[5]/div[1]/input[2]")
    private WebElement paramFivePresence;

    @FindBy(xpath = "//tbody/tr[5]/td[5]/div[1]/input[3]")
    private WebElement paramFiveAbsence;

    @FindBy(xpath = "//tbody/tr[5]/td[5]/div[1]/input[4]")
    private WebElement paramFiveNotTested;

    @FindBy(xpath = "//tbody/tr[6]/td[5]/div[1]/input[2]")
    private WebElement paramSixPresence;

    @FindBy(xpath = "//tbody/tr[6]/td[5]/div[1]/input[3]")
    private WebElement paramSixAbsence;

    @FindBy(xpath = "//tbody/tr[6]/td[5]/div[1]/input[4]")
    private WebElement paramSixNotTested;

    @FindBy(xpath = "//tbody/tr[7]/td[5]/div[1]/input[2]")
    private WebElement paramSevenPresence;

    @FindBy(xpath = "//tbody/tr[7]/td[5]/div[1]/input[3]")
    private WebElement paramSevenAbsence;

    @FindBy(xpath = "//tbody/tr[7]/td[5]/div[1]/input[4]")
    private WebElement paramSevenNotTested;

    @FindBy(xpath = "//tbody/tr[8]/td[5]/div[1]/input[2]")
    private WebElement paramEightPresence;

    @FindBy(xpath = "//tbody/tr[8]/td[5]/div[1]/input[3]")
    private WebElement paramEightAbsence;

    @FindBy(xpath = "//tbody/tr[8]/td[5]/div[1]/input[4]")
    private WebElement paramEightNotTested;

    @FindBy(xpath = "//tbody/tr[9]/td[5]/div[1]/input[2]")
    private WebElement paramNinePresence;

    @FindBy(xpath = "//tbody/tr[9]/td[5]/div[1]/input[3]")
    private WebElement paramNineAbsence;

    @FindBy(xpath = "//tbody/tr[9]/td[5]/div[1]/input[4]")
    private WebElement paramNineNotTested;

    @FindBy(xpath = "//tbody/tr[10]/td[5]/div[1]/input[2]")
    private WebElement paramTenPresence;

    @FindBy(xpath = "//tbody/tr[10]/td[5]/div[1]/input[3]")
    private WebElement paramTenAbsence;

    @FindBy(xpath = "//tbody/tr[10]/td[5]/div[1]/input[4]")
    private WebElement paramTenNotTested;

    @FindBy(xpath = "//tbody/tr[11]/td[5]/div[1]/input[2]")
    private WebElement paramElevenPresence;

    @FindBy(xpath = "//tbody/tr[11]/td[5]/div[1]/input[3]")
    private WebElement paramElevenAbsence;

    @FindBy(xpath = "//tbody/tr[11]/td[5]/div[1]/input[4]")
    private WebElement paramElevenNotTested;

    @FindBy(xpath = "//tbody/tr[12]/td[5]/div[1]/input[2]")
    private WebElement paramTwelvePresence;

    @FindBy(xpath = "//tbody/tr[12]/td[5]/div[1]/input[3]")
    private WebElement paramTwelveAbsence;

    @FindBy(xpath = "//tbody/tr[12]/td[5]/div[1]/input[4]")
    private WebElement paramTwelveNotTested;

    @FindBy(xpath = "//tbody/tr[13]/td[5]/div[1]/input[2]")
    private WebElement paramThirteenPresence;

    @FindBy(xpath = "//tbody/tr[13]/td[5]/div[1]/input[3]")
    private WebElement paramThirteenAbsence;

    @FindBy(xpath = "//tbody/tr[13]/td[5]/div[1]/input[4]")
    private WebElement paramThirteenNotTested;

    @FindBy(xpath = "//tbody/tr[14]/td[5]/div[1]/input[2]")
    private WebElement paramFourteenPresence;

    @FindBy(xpath = "//tbody/tr[14]/td[5]/div[1]/input[3]")
    private WebElement paramFourteenAbsence;

    @FindBy(xpath = "//tbody/tr[14]/td[5]/div[1]/input[4]")
    private WebElement paramFourteenNotTested;

    @FindBy(xpath = "//button[@id='btnsubmit']")
    private WebElement submitButton;


    public void login() throws InterruptedException
    {
        wb.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        loginId.click();
        loginId.sendKeys("8435045816");
        password.click();
        password.sendKeys("8435045816");
        loginButton.click();
        addNewSample.click();

        //Click and open the Date Picker
        wb.findElement(By.id("hdnsamplerecivedt")).click();

        //Click and open the Date Picker
        wb.findElement(By.id("txtsampletested")).click();


        // get table using inputId (hdnsamplerecivedt) + div class(xdsoft_calendar)

        /*
        document.getElementsByClassName('xdsoft_datetimepicker')[0]
        document.getElementsByClassName('xdsoft_datetimepicker')[0]
        */

        // iterate over table using cell value and select td based on date

        //This is from date picker table

       /* ExpectedCondition<List<WebElement>> allCalDiv=
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("xdsoft_calendar"));

        WebElement firstCal =  new WebDriverWait(wb, Duration.ofSeconds(10))
                .until(allCalDiv).get(0);*/


//        Thread.sleep(5000);

        WebElement firstCal = wb.findElements(By.className("xdsoft_calendar")).get(0);

        //This are the columns of the from date picker table
        List<WebElement> columns = firstCal.findElements(By.tagName("td"));

        clickGivenDay(columns, getCurrentDayMinus(2),0);
        //Wait a bit to see that we have selected the data properly.

        WebElement secondCal = wb.findElements(By.className("xdsoft_calendar")).get(1);

        //This are the columns of the from date picker table
        List<WebElement> columns2 = secondCal.findElements(By.tagName("td"));

        clickGivenDay(columns2, getCurrentDay(),0);

//        wb.findElement(By.id("hdnsamplerecivedt")).sendKeys("value", "2022/10/01 23:16");
//        wb.findElement(By.id("txtsampletested")).sendKeys("value", "2022/10/04 23:23");
//        hdnsamplerecivedt.selectByIndex(1);

       /* wb.findElement(By.id("hdnsamplerecivedt")).sendKeys("value", "2022/10/01 23:16");
        wb.findElement(By.id("txtsampletested")).sendKeys("value", "2022/10/04 23:23");*/

        Select habitaion = new Select(wb.findElement(By.id("ddlHabitaion")));
        //habitaion.selectByVisibleText("Bhadbhad");
        int habitationIndex= getRandomNumberUsingInts(1,4);
        habitaion.selectByIndex(habitationIndex);

        Select water = new Select(wb.findElement(By.id("ddlSource")));
//        water.selectByVisibleText("Hand Pump");
        water.selectByIndex(4);

        int waterSourceMaxIndex;
        if(habitationIndex==4){
            waterSourceMaxIndex=2;
        }else {
            waterSourceMaxIndex=3;
        }
        Select waterSource = new Select(wb.findElement(By.id("ddlsamplesourceinfo")));
        //waterSource.selectByVisibleText("Location : Bhadbhad [schemeId : 1707953, scheme name : Bhadbhad, Type : Handpump]");
        waterSource.selectByIndex(getRandomNumberUsingInts(1,waterSourceMaxIndex));

        //for presence in row1
//        JavascriptExecutor js= (JavascriptExecutor)wb;
//        js.executeScript("window.scrollBy(0,500)");
//        js.executeScript("arguments[0].click();", paramOnePresence);

        //for absence in row1
//        JavascriptExecutor js= (JavascriptExecutor)wb;
//        js.executeScript("window.scrollBy(0,500)");
//        js.executeScript("arguments[0].click();", paramOneAbsence);

        //for notTested in row1
        JavascriptExecutor js= (JavascriptExecutor)wb;
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("arguments[0].click();", paramOneNotTested);

//       // for presence in row2
//        JavascriptExecutor js2= (JavascriptExecutor)wb;
//        js2.executeScript("window.scrollBy(0,500)");
//        js2.executeScript("arguments[0].click();", paramTwoPresence);

        //for absence in row2
//        JavascriptExecutor js2= (JavascriptExecutor)wb;
//        js2.executeScript("window.scrollBy(0,500)");
//        js2.executeScript("arguments[0].click();", paramTwoAbsence);

//        //for notTested in row2
        JavascriptExecutor js2= (JavascriptExecutor)wb;
        js2.executeScript("window.scrollBy(0,500)");
        js2.executeScript("arguments[0].click();", paramTwoNotTested);

        // for presence in row3
        JavascriptExecutor js3= (JavascriptExecutor)wb;
        js3.executeScript("window.scrollBy(0,500)");
        js3.executeScript("arguments[0].click();", paramThreePresence);

        //for absence in row3
//        JavascriptExecutor js3= (JavascriptExecutor)wb;
//        js3.executeScript("window.scrollBy(0,500)");
//        js3.executeScript("arguments[0].click();", paramThreeAbsence);

//        //for notTested in row3
//        JavascriptExecutor js3= (JavascriptExecutor)wb;
//        js3.executeScript("window.scrollBy(0,500)");
//        js3.executeScript("arguments[0].click();", paramThreeNotTested);

        // for presence in row4
        JavascriptExecutor js4= (JavascriptExecutor)wb;
        js4.executeScript("window.scrollBy(0,500)");
        js4.executeScript("arguments[0].click();", paramFourPresence);

        //for absence in row4
//        JavascriptExecutor js4= (JavascriptExecutor)wb;
//        js4.executeScript("window.scrollBy(0,500)");
//        js4.executeScript("arguments[0].click();", paramFourAbsence);

//        //for notTested in row4
//        JavascriptExecutor js4= (JavascriptExecutor)wb;
//        js4.executeScript("window.scrollBy(0,500)");
//        js4.executeScript("arguments[0].click();", paramFourNotTested);

        // for presence in row5
        JavascriptExecutor js5= (JavascriptExecutor)wb;
        js5.executeScript("window.scrollBy(0,500)");
        js5.executeScript("arguments[0].click();", paramFivePresence);

        //for absence in row5
//        JavascriptExecutor js5= (JavascriptExecutor)wb;
//        js5.executeScript("window.scrollBy(0,500)");
//        js5.executeScript("arguments[0].click();", paramFiveAbsence);

//        //for notTested in row5
//        JavascriptExecutor js5= (JavascriptExecutor)wb;
//        js5.executeScript("window.scrollBy(0,500)");
//        js5.executeScript("arguments[0].click();", paramFiveNotTested);

        // for presence in row6
        JavascriptExecutor js6= (JavascriptExecutor)wb;
        js6.executeScript("window.scrollBy(0,500)");
        js6.executeScript("arguments[0].click();", paramSixPresence);

        //for absence in row6
//        JavascriptExecutor js6= (JavascriptExecutor)wb;
//        js6.executeScript("window.scrollBy(0,500)");
//        js6.executeScript("arguments[0].click();", paramSixAbsence);

//        //for notTested in row6
//        JavascriptExecutor js6= (JavascriptExecutor)wb;
//        js6.executeScript("window.scrollBy(0,500)");
//        js6.executeScript("arguments[0].click();", paramSixNotTested);

        // for presence in row7
        JavascriptExecutor js7= (JavascriptExecutor)wb;
        js7.executeScript("window.scrollBy(0,500)");
        js7.executeScript("arguments[0].click();", paramSevenPresence);

        //for absence in row7
//        JavascriptExecutor js7= (JavascriptExecutor)wb;
//        js7.executeScript("window.scrollBy(0,500)");
//        js7.executeScript("arguments[0].click();", paramSevenAbsence);

//        //for notTested in row7
//        JavascriptExecutor js7= (JavascriptExecutor)wb;
//        js7.executeScript("window.scrollBy(0,500)");
//        js7.executeScript("arguments[0].click();", paramSevenNotTested);

        // for presence in row8
        JavascriptExecutor js8= (JavascriptExecutor)wb;
        js8.executeScript("window.scrollBy(0,500)");
        js8.executeScript("arguments[0].click();", paramEightPresence);

        //for absence in row8
//        JavascriptExecutor js8= (JavascriptExecutor)wb;
//        js8.executeScript("window.scrollBy(0,500)");
//        js8.executeScript("arguments[0].click();", paramEightAbsence);

//        //for notTested in row8
//        JavascriptExecutor js8= (JavascriptExecutor)wb;
//        js8.executeScript("window.scrollBy(0,500)");
//        js8.executeScript("arguments[0].click();", paramEightNotTested);

        // for presence in row9
        JavascriptExecutor js9= (JavascriptExecutor)wb;
        js9.executeScript("window.scrollBy(0,500)");
        js9.executeScript("arguments[0].click();", paramNinePresence);

        //for absence in row9
//        JavascriptExecutor js9= (JavascriptExecutor)wb;
//        js9.executeScript("window.scrollBy(0,500)");
//        js9.executeScript("arguments[0].click();", paramNineAbsence);

//        //for notTested in row9
//        JavascriptExecutor js9= (JavascriptExecutor)wb;
//        js9.executeScript("window.scrollBy(0,500)");
//        js9.executeScript("arguments[0].click();", paramNineNotTested);

        // for presence in row10
        JavascriptExecutor js10= (JavascriptExecutor)wb;
        js10.executeScript("window.scrollBy(0,500)");
        js10.executeScript("arguments[0].click();", paramTenPresence);

        //for absence in row10
//        JavascriptExecutor js10= (JavascriptExecutor)wb;
//        js10.executeScript("window.scrollBy(0,500)");
//        js10.executeScript("arguments[0].click();", paramTenAbsence);

//        //for notTested in row10
//        JavascriptExecutor js10= (JavascriptExecutor)wb;
//        js10.executeScript("window.scrollBy(0,500)");
//        js10.executeScript("arguments[0].click();", paramTenNotTested);

        // for presence in row11
        JavascriptExecutor js11= (JavascriptExecutor)wb;
        js11.executeScript("window.scrollBy(0,500)");
        js11.executeScript("arguments[0].click();", paramElevenPresence);

        //for absence in row11
//        JavascriptExecutor js11= (JavascriptExecutor)wb;
//        js11.executeScript("window.scrollBy(0,500)");
//        js11.executeScript("arguments[0].click();", paramElevenAbsence);

//        //for notTested in row11
//        JavascriptExecutor js11= (JavascriptExecutor)wb;
//        js11.executeScript("window.scrollBy(0,500)");
//        js11.executeScript("arguments[0].click();", paramElevenNotTested);

        // for presence in row12
        JavascriptExecutor js12= (JavascriptExecutor)wb;
        js12.executeScript("window.scrollBy(0,500)");
        js12.executeScript("arguments[0].click();", paramTwelvePresence);

        //for absence in row12
//        JavascriptExecutor js12= (JavascriptExecutor)wb;
//        js12.executeScript("window.scrollBy(0,500)");
//        js12.executeScript("arguments[0].click();", paramTwelveAbsence);

//        //for notTested in row12
//        JavascriptExecutor js12= (JavascriptExecutor)wb;
//        js12.executeScript("window.scrollBy(0,500)");
//        js12.executeScript("arguments[0].click();", paramTwelveNotTested);

        // for presence in row13
//        JavascriptExecutor js13= (JavascriptExecutor)wb;
//        js13.executeScript("window.scrollBy(0,500)");
//        js13.executeScript("arguments[0].click();", paramThirteenPresence);

        //for absence in row13
//        JavascriptExecutor js13= (JavascriptExecutor)wb;
//        js13.executeScript("window.scrollBy(0,500)");
//        js13.executeScript("arguments[0].click();", paramThirteenAbsence);

//        //for notTested in row13
        JavascriptExecutor js13= (JavascriptExecutor)wb;
        js13.executeScript("window.scrollBy(0,500)");
        js13.executeScript("arguments[0].click();", paramThirteenNotTested);

        // for presence in row14
//        JavascriptExecutor js14= (JavascriptExecutor)wb;
//        js14.executeScript("window.scrollBy(0,500)");
//        js14.executeScript("arguments[0].click();", paramFourteenPresence);

        //for absence in row14
//        JavascriptExecutor js14= (JavascriptExecutor)wb;
//        js14.executeScript("window.scrollBy(0,500)");
//        js14.executeScript("arguments[0].click();", paramFourteenAbsence);

//        //for notTested in row14
        JavascriptExecutor js14= (JavascriptExecutor)wb;
        js14.executeScript("window.scrollBy(0,500)");
        js14.executeScript("arguments[0].click();", paramFourteenNotTested);

//        To submit the form
        Thread.sleep(3000);
        submitButton.click();
    }

    public void clickGivenDay(List<WebElement> elementList, String day, int count) {
        //DatePicker is a table. Thus we can navigate to each cell
        //and if a cell matches with the current date then we will click it.
        /**Functional JAVA version of this method.*/

        try
        {
            elementList.stream()
                    .filter(element -> element.getText().contains(day))
                    .findFirst()
                    .ifPresent(WebElement::click);
        }
        catch (Exception e)
        {
            while(count < 2)
            {
                count++;
                clickGivenDay(elementList,day,count);
            }
        }

        /**Non-functional JAVA version of this method.*/
        //for (
        //    WebElement cell : elementList) {
        //    String cellText = cell.getText();
        //    if (cellText.contains(day)) {
        //        cell.click();
        //        break;
        //    }
        //}
    }

    public static String getCurrentDay() {
        //Create a Calendar Object
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

        //Get Current Day as a number
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayInt + "\n");

        //Integer to String Conversion
        String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");

        return todayStr;
    }

    //Get The Current Day plus days. You can change this method based on your needs.
    public static String getCurrentDayPlus(int days) {
        LocalDate currentDate = LocalDate.now();

        int dayOfWeekPlus = currentDate.getDayOfWeek().plus(days).getValue();
        return Integer.toString(dayOfWeekPlus);
    }

    //Get The Current Day plus days. You can change this method based on your needs.
    public static String getCurrentDayMinus(int days) {
        LocalDate currentDate = LocalDate.now();

        int dayOfWeekPlus = currentDate.getDayOfWeek().minus(days).getValue();
        return Integer.toString(dayOfWeekPlus);
    }
    public int getRandomNumberUsingInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}