import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passValTest {

    @Test
    public void isPasswordValid() {
        //GIVEN
        String PassCheck = "whatever";
        //WHEN
        boolean result = passVal.validation(PassCheck);
        //THEN
        assertTrue(result);

    }

}