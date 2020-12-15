package algorithms.productofnumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppExceptionTest {

    @Test
    void shouldThrowExceptionOfGivenMessage() throws AppException{
        try {
            throw new AppException("Testing exception");
        }
        catch (AppException e){
            assertEquals(e.getMessage(), "Testing exception");
        }

    }

    @Test
    void shouldThrowAndCheckMessageOfException(){
        Throwable exception = assertThrows(
                AppException.class,
                () -> {
                    throw new AppException("Exception message");
                }
        );
        assertEquals("Exception message", exception.getMessage());
    }
}