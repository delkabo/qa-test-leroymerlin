package com.delkabo.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.switchTo;

public class LeroyMerlinObject {

    private SelenideElement
            searchLine = $("[placeholder='Профессия, должность или компания']"),
            titleCompany = $("div.vacancy-company-details");

    public LeroyMerlinObject openPage() {
        open("https://hh.ru/");
        return this;
    }

    public LeroyMerlinObject searchVacancy(String name) {
        searchLine.setValue(name).pressEnter();
        return this;
    }

    public LeroyMerlinObject clickSearched(String name) {
        SelenideElement blockVac = $$(".vacancy-serp-item__layout")
                .findBy(text(name));
        blockVac.scrollTo().$(".resume-search-item__name").click();
        switchTo().window(1);
        return this;
    }

    public LeroyMerlinObject shouldTitle(String name) {
        titleCompany.shouldHave(text(name));
        return this;
    }
}
