package io.github.chubbyhippo.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class DemoApplicationTests {

    @Autowired
    private MockMvcTester mockMvcTester;

    @Test
    @DisplayName("should return hello")
    void shouldReturnHello() {
        mockMvcTester.get()
                .uri("/hello")
                .assertThat()
                .body()
                .asString()
                .isEqualTo("hello");

    }
}
