package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    @DisplayName("1 + 2 = 3")
    void t1() {
        App app = new App();
        int rs = app.plus(1,2);

        assertEquals(3, rs); // 나는 보장합니다 rs의 값이 3과 같다고 보장합니다. 만약 이 두 값이 다르면 테스트를 종료시킵니다.
    }

    @Test
    @DisplayName("10 + 20 = 30")
    void t2() {
        App app = new App();
        int rs = app.plus(10,20);

        assertEquals(30, rs);
    }


}
