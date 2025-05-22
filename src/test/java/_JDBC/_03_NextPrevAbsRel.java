package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent{

    @Test
    public void Test1() throws SQLException {
        ResultSet rs= sorguEkrani.executeQuery("select * from language;");

        rs.next(); // 1 adım ileri
        System.out.println("1. Satır = " + rs.getString(2)); // colon adı yerine sırası yazılabilir English

        rs.next(); // 1 adım daha ileri
        System.out.println("2. Satır = " + rs.getString(2)); // Italian

        rs.previous(); // 1 adım geri gel
        System.out.println("1. Satır = " + rs.getString("name")); // English
    }

    @Test
    public void Test2() throws SQLException {
        ResultSet rs= sorguEkrani.executeQuery("select * from film");

        rs.absolute(10); // direkt baştan sayarak 10. satıra gider
        System.out.println("10. Satır = " + rs.getString("title")); // ALADDIN CALENDER

        rs.absolute(5); // direkt baştan sayarak 10. satıra gider
        System.out.println("5. Satır = " + rs.getString("title")); // AFRICAN EGG

        rs.absolute(10); // kaldığı yerden doğruca 10. satıra gider
        System.out.println("10. Satır = " + rs.getString("title")); // ALADDIN CALENDER

        rs.next(); // en son ki satırdan bir ileri gider
        System.out.println("11. Satıd = " + rs.getString("title")); // ALAMO VIDEOTAPE
    }

// rs.next() : sonraki satır
// rs.previous : önceki satır
// rs.absolute(10) : baştan itibaren 10.satıra ileri gider.
// rs.relative(10) : bulunduğu yerden 10.satıra ileri gider.
// rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
// rs.relative(-5) :  - (eksi) bulunduğu yerden 5 satır geri
// ilk satırdan relative ile 5 geri gitmek istersek sınırı taştığı için hata verecektir


}
