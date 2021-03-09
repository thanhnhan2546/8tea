package com.github.qquang24t5._8tea.it;

import io.cucumber.java.vi.Biết;
import io.cucumber.java.vi.Cho;
import io.cucumber.java.vi.Khi;
import io.cucumber.java.vi.Thì;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    public String isItFriday() {
        return "Không";
    }

    @Biết("Hôm nay là chủ nhật")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @Khi("Tôi hỏi hôm nay có phải thứ 6 không")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = isItFriday();
    }

    @Thì("Tôi được trả lời là {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
