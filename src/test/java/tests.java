import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class tests {
    @BeforeAll
    static void setMaxSize() {
        Configuration.startMaximized = true;
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
//        -> далее интересный способ поиска необходимого значения атрибута :)
        $(by("aria-label", "Choose Wednesday, November 10th, 2021")).click();
//         После нахождения элемента использую ввод значения и нажатие на Enter
        $("[id=subjectsInput]").setValue("English").pressEnter();
//        Пришлось использовать хpath, по другому не удавалось выйти на данный элемент
        $(byXpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
//        $("[id=uploadPicture]").doubleClick(); -> не требует нажатия, используем конструкцию Селенида для отправки файла ,которую
//        использую далее ->
        File file = $("#uploadPicture").uploadFile(new File("C:\\Users\\User\\IdeaProjects\\QaGuruRep\\filetest.txt"));
        $("[id=currentAddress]").setValue("Omsk ugly and lost city");
        $(byXpath("//*[@id=\"state\"]/div/div[1]")).click();
        $(byXpath("//*[@id=\"state\"]/div/div[1]")).setValue("NCR");





        Thread.sleep(4000);


    }
}
