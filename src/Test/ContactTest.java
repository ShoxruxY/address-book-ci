import com.example.addressbook.model.Contact;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {
    private Contact contact;

    @BeforeEach
    void setUp(){
        contact = new Contact("John","Doe","john.doe@example.com", "1234567890");
    }

    @Test
    void testGetId(){
        contact.setId(1);
        assertEquals(1, contact.getId());
    }

    @Test
    void getFirstName(){
        assertEquals("John", contact.getFirstName());
    }

    @Test
    void testSetFirstName(){
        contact.setFirstName("Jane");
        assertEquals("Jane", contact.getFirstName());
    }

    @Test
    void testGetLastName(){
        assertEquals("Doe", contact.getLastName());
    }

    @Test
    void testSetLastName(){
        contact.setLastName("Smith");
        assertEquals("Smith", contact.getLastName());
    }

    @Test
    void testGetEmail(){
        assertEquals("john.doe@example.com", contact.getEmail());
    }

    @Test
    void testSetEmail(){
        contact.setEmail("jane.smith@example.com");
        assertEquals("jane.smith@example.com", contact.getEmail());
    }

    @Test
    void testGetPhone(){
        assertEquals("1234567890",contact.getPhone());
    }

    @Test
    void testSetPhone(){
        contact.setPhone("0987654321");
        assertEquals("0987654321", contact.getPhone());
    }

    @Test
    void testGetFullName(){
        assertEquals("John Doe", contact.getFullName());
    }
}
