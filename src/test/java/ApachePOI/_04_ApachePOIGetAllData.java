package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException{
        String path="src/test/java/ApachePOI/Resource/ApacheExcel2.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0); //0.sheet i ver

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { // satır miktarı zoo.lenght

            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) { // ilgili satırdaki
                System.out.print(sheet.getRow(i).getCell(j)+" "); // zoo[i][j]
            }
            System.out.println();
        }
    }
}
