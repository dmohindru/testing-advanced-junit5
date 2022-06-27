package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("repeated")
public interface MyRepeatedTest {
    @BeforeEach
    default void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Executing before each for method: " + testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition() + " - " + repetitionInfo.getTotalRepetitions());

    }
}
