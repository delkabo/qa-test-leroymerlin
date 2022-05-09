package com.delkabo.tests;

import com.codeborne.selenide.SelenideElement;
import com.delkabo.components.LeroyMerlinObject;
import org.junit.jupiter.api.Test;

public class LeroyMerlin {

    LeroyMerlinObject leroyMerlinObject = new LeroyMerlinObject();

    @Test
    void leroyMerlin() {
        leroyMerlinObject.openPage()
                .searchVacancy("Леруа Мерлен QA Automation")
                .clickSearched("QA Automation")
                .shouldTitle("Леруа Мерлен");


    }
}
