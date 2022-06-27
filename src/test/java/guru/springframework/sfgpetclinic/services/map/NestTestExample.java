package guru.springframework.sfgpetclinic.services.map;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Nested Test example")
public class NestTestExample {
    @BeforeEach
    void setUp() {
        System.out.println("Parent Level Test - Setup");
    }

    @Nested
    @DisplayName("First Level nested test")
    class FirstLevelTest {
        @BeforeEach
        void setUp() {
            System.out.println("First Level Test - Setup");
        }

        @Test
        void firstLevelTest() {
            System.out.println("First Level test");
        }

        @Nested
        @DisplayName("Second Level nested test")
        class SecondLevelTest {
            @BeforeEach
            void setUp() {
                System.out.println("Second Level test - Setup");
            }

            @Test
            void secondLevelTest() {
                System.out.println("Second Level test");
            }
        }


    }

    @Test
    void parentLevelTest() {
        System.out.println("Parent level test");
    }
}
