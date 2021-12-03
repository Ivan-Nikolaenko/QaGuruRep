package lesson04;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FindSelenideTest {

    @Test
    void shouldFindSelenideOnGitHub() {
        Configuration.headless = false;
        //открыть страницу гитхаб
        open("https://github.com/");
        //ввести в поле поиска selenide+enter
        $("[name=q]").setValue("selenide").pressEnter();
        //Ищем коллекцию ($$)
        var firstRepositoryFound = $$("ul.repo-list li").first().$("a");
        //Кликаем
        firstRepositoryFound.click();
        //проверка ,есть ли в заголовке selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));
        $(".BorderGrid").$(Selectors.byText("Contributors")).closest("div").$("li").hover();
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));
    }
}
