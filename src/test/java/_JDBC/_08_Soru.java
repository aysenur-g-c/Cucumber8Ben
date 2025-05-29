package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class _08_Soru extends JDBCParent{
    // language tablosundaki tüm satırları ve üstüne kolon isimleri ile yazdırınız,
    // aynı mysql sonuç ekranında olduğu gibi

    @Test
    public void Test1() throws SQLException {
        ResultSet rs= sorguEkrani.executeQuery("select * from language;");
        ResultSetMetaData rsmd= rs.getMetaData();

        //önce kolon isimlerini(başlıkları) yazalım
        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.print(rsmd.getColumnName(i)+"\t");

        System.out.println();

        //şimdi bilgileri satır satır yazalım
        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) // yan yana kolondaki bilgileri yaz
                System.out.print(rs.getString(i)+"\t");

            System.out.println(); // sonraki satır için satır atlat
        }

//        protected void identifyEmployeesWithHighestAverageSalaryPerDepartment(String query) throws SQLException {
//            try (Statement st = con.createStatement();
//                 ResultSet rs = st.executeQuery(query)) {
//
//                System.out.printf("%-20s %-20s %-20s %-16s%n", "Department", "First Name", "Last Name", "Average Salary");
//                System.out.println("------------------------------------------------------------------------");
//
//                while (rs.next()) {
//                    String department = rs.getString("department");
//                    String firstName = rs.getString("first_name");
//                    String lastName = rs.getString("last_name");
//                    double avgSalary = rs.getDouble("avg_salary");
//                    System.out.printf("%-20s %-20s %-20s %-16.2f%n", department, firstName, lastName, avgSalary);
//                }
//            }
//        }

    }
}
