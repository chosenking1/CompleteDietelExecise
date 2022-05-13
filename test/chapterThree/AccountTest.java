package chapterThree;
//3.11
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    Account account;

    @BeforeEach
    void setUp(){
        account = new Account("Mobolaji Johnson", 2000.0);
    }
    @Test
    void accountExist(){
    assertNotNull(account.getClass());
}
    @Test
    void balanceCanBeChecked(){
    assertEquals(2000,account.getBalance());
}
    @Test
    void depositCanBeMade(){
        account.deposit(4000.0);
        assertEquals(6000, account.getBalance());
    }

    @Test
    void withdrawalCanBeMade(){
        assertEquals("Transaction Complete, Have a good day Mobolaji Johnson", account.withdraw(1500) );
        assertEquals(500, account.getBalance());
    }

    @Test
    void withdrawalCantExceedBalance(){
        assertEquals("The You dont Have enough in your balance", account.withdraw(2500) );
        assertEquals(2000, account.getBalance());
    }
}
