package com.delkabo.tests;

import com.codeborne.selenide.SelenideElement;
import com.delkabo.components.LeroyMerlinObject;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LeroyMerlin extends TestBase{

    LeroyMerlinObject leroyMerlinObject = new LeroyMerlinObject();

    @Test
    void leroyMerlin() {
        open("https://hh.ru/");

        leroyMerlinObject
                .searchVacancy("Леруа Мерлен QA Automation")
                .clickSearched("QA Automation")
                .shouldTitle("Леруа Мерлен");


    }
}
