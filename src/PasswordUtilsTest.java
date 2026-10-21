import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        //arrange
        String password = "hello";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("short",actual);
        
    }

    @Test
    void testDescribePasswordLengthExactly12Chars(){
        //arrange
        String password = "************";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("long",actual);
    }

    @Test
    void testDescribePasswordLengthExtraLongPassword(){
        //arrange
        String password = "jhhhhhagagsvfdhgacgsdhajfjakjgnasf";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("extra long", actual);
    }
    @Test void testContainsTripleTrue(){
        String password = "paaasword";
        boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(true,actual);
    }

    @Test void testContainsTripleFalse(){
        String password = "pasword";
        boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(false,actual);
    }
}
