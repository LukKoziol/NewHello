import org.junit.jupiter.api.Test;
import pl.altkom.utils.HelloUtil;

import static org.junit.jupiter.api.Assertions.*;

class NewHelloTest {

    @Test
    void shouldReturnGreetingWithPassedArgument() {
        //fail();

        // Given
        String passedArguments = "ŁUKASZ";
        // When
        String expectedValue = NewHello.GREEINGG+ " "+ passedArguments;
        // Then
        String returnedValue = NewHello.upper (passedArguments);

        assertEquals(expectedValue, returnedValue);

    }
}