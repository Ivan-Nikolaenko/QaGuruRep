import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class tests {
    @BeforeAll
    static void setMaxSize() {
        Configuration.browserSize="1920x1080";
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
        $(by("aria-label", "Choose Friday, December 10th, 2021")).click();
        $("[id=subjectsInput]").setValue("English").pressEnter();
//        Пришлось использовать хpath, по другому не удавалось выйти на данный элемент
        $(byXpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
        File file = $("#uploadPicture").uploadFile(new File("C:\\Users\\User\\IdeaProjects\\QaGuruRep\\filetest.txt"));
        $("[id=currentAddress]").setValue("Omsk ugly and lost city");
        $("[id=state] input").setValue("N").pressEnter();
        $("[id=city] input").setValue("G").pressEnter();
        $("[id=submit]").click();
        $("[id=closeLargeModal]").click();

    }
}
