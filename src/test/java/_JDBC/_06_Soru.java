package _JDBC;


import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

// city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
public class _06_Soru extends JDBCParent{

    @Test
    public void Test1() throws SQLException {
        ResultSet rs= sorguEkrani.executeQuery("select city from city;");

        //1. yol
        int rowNo=1;
        while (rs.absolute(rowNo++))
            System.out.println(rs.getString("city"));

        System.out.println("------------------------");

        //2. yol
        rs.last();
        int sonSatirNo= rs.getRow();
        for (int i = 1; i < sonSatirNo; i++) {
            rs.absolute(i);
            System.out.println(rs.getString("city"));
        }

    }

    @Test
    public void Test2() throws SQLException {
        //city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız
        ResultSet rs= sorguEkrani.executeQuery("select city from city;");

        //1. yol
        while (rs.relative(1))
            System.out.println(rs.getString("city"));

        System.out.println("---------------------------------");

        //2.yol
        rs.last();
        int sonSatirNo= rs.getRow(); //bulunduğum satırı veriyor
        rs.first(); // relative en son bulunan yere gittiği için başa aldık

        for (int i = 1; i < sonSatirNo+1; i++) { // son satırı da yazması için +1 yazdık
            System.out.println(rs.getString("city"));
            rs.relative(1);
        }




    }
}
