package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_FirstLastGetRowgetType extends JDBCParent{

    @Test
    public void Test1() throws SQLException {
        ResultSet rs= sorguEkrani.executeQuery("select city as sehir from city;");

        rs.last(); // son satra gider
        System.out.println("rs.getString(1) = " + rs.getString(1)); // city yazmakla aynı
        System.out.println("rs.getString(sehir) = " + rs.getString("sehir")); // city yazmakla aynı

        rs.first();
        System.out.println("rs.getString(1) = " + rs.getString(1)); // city yazmakla aynı

        rs.last();
        int kacinciSatirdayim=rs.getRow();
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);


    }
}
