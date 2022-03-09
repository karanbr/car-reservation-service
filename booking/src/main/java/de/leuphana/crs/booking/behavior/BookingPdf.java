package de.leuphana.crs.booking.behavior;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import de.leuphana.crs.booking.structure.Body;
import de.leuphana.crs.booking.structure.Booking;
import de.leuphana.crs.booking.structure.Footer;
import de.leuphana.crs.booking.structure.Head;

import java.io.FileOutputStream;
import java.util.Date;

public class BookingPdf {
    private static String FILE = "/Users/karan/IdeaProjects/car-reservation-service/Booking-";
    private static Font catFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);


    public static void createPdf(Booking booking) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE + booking.getBookingID() + ".pdf"));
            document.open();
            addMetaData(document);
            addHeader(document, booking.getHead());
            addBody(document, booking.getBody());
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addMetaData(Document document) {
        document.addTitle("Booking confirmation");
        document.addCreator("Car Reservation Service");
    }

    private static void addHeader(Document document, Head head) throws DocumentException {
        Paragraph preface = new Paragraph();
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Header", catFont));

        addEmptyLine(preface, 1);
        preface.add(new Paragraph(
                head.toString(),
                smallBold));
        addEmptyLine(preface, 3);
//        addEmptyLine(preface, 8);

        document.add(preface);
    }

    private static void addBody(Document document, Body body) throws DocumentException {
//        Anchor anchor = new Anchor("Your Booking", catFont);
//        anchor.setName("Your Booking");
//        Chapter catPart = new Chapter(new Paragraph(anchor), 1);
//        Paragraph subPara = new Paragraph("Subcategory 1", subFont);
//        Section subCatPart = catPart.addSection(subPara);
//        subCatPart.add(new Paragraph(body.toString()));
//        document.add(catPart);
        Paragraph bodyPara = new Paragraph();
        addEmptyLine(bodyPara, 1);
        bodyPara.add(new Paragraph("Header", catFont));
        addEmptyLine(bodyPara, 1);
        bodyPara.add(new Paragraph(
                body.toString(),
                smallBold));
        addEmptyLine(bodyPara, 3);
        document.add(bodyPara);
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

}
