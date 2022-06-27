package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.MyRepeatedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class PersonRepeatedTest implements MyRepeatedTest {
    @RepeatedTest(value = 10, name = "{displayName}: {currentRepetition} of {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
    }

    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }

    @RepeatedTest(value = 10, name= "{displayName}: {currentRepetition} of {totalRepetitions}")
    @DisplayName("My Another repeated test")
    void myAnotherRepeatedTest() {
    }
}
