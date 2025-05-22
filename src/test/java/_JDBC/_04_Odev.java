package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_Odev extends JDBCParent{
    // TODO: DB den Actor tablosunu okuyarak, bir excele yazdırınız.
    public void Odev() throws SQLException {
        ResultSet rs= sorguEkrani.executeQuery("select * from actor;");

    }
}
