package lesson04;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FindContributors {

    @Test
    void firstContrShouldBeSoln(){
        Configuration.browserSize="800x400";
        open("https://github.com/selenide/selenide");
        $(".BorderGrid").$(Selectors.byText("Contributors"))
                .closest("div").$("li").hover();

        sleep(5000);
    }
}
