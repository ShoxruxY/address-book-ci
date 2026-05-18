package com.example.addressbook;
import org.junit.jupiter.api.*;
import com.example.addressbook.model.SqliteConnection;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabaseTest {
    @Test
    public void testConnection(){
        Connection conn = SqliteConnection.getInstance();
        assertEquals( true, conn != null);
    }

}
