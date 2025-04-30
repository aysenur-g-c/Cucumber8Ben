package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {

    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/Resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0);

        int satirMiktari=sheet.getPhysicalNumberOfRows(); // şu an kaç satir var
        Row yeniSatir=sheet.createRow(0); // en son boş satıra yazar
        Cell yeniHucre=yeniSatir.createCell(0); // satırın ilk hücresini oluştur.
        yeniHucre.setCellValue("Merhaba Dünya");

        //okuma modunu kapat
        inputStream.close(); // aynı anda okuma ve kaydetme yapılamıyor. okuma modu kapatıldı

        //dosyayı kaydet (Save tuşuna bas)
        FileOutputStream outputStream=new FileOutputStream(path); // yazma modunu aç
        workbook.write(outputStream); // hafızada ki workbook u path i verilen dosyaya yaz
        workbook.close(); // hafıza boşaltıldı
        outputStream.close(); // yazma modu kapatıldı

        System.out.println("İşlem tamamlandı");



    }
}
