import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class tests {
    @BeforeAll
    static void setMaxSize(){
        Configuration.startMaximized=true;
    }
    @Test
    public void studentRegForm() throws InterruptedException {
        open("https://demoqa.com/automation-practice-form");

        $("[id=firstName]").setValue("Ivan-VanDam");
        $("[id=lastName]").setValue("Nikolaenko");
        $("[id=userEmail]").setValue("ivan@mail.ru");
        $("[id=gender-radio-1]").doubleClick();
        $("[id=userNumber]").setValue("0123456789");
        $("[id=dateOfBirthInput]").click();
        $(by("aria-label","Choose Wednesday, November 10th, 2021")).click();
        $("[id=subjectsInput]").setValue("English").pressEnter();
        $(byXpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
        $("[id=uploadPicture]").click();





        Thread.sleep(4000);







    }
}
