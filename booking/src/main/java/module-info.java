module booking {

    requires lombok;
    requires org.apache.pdfbox;
    requires itextpdf;
    requires org.apache.fontbox;
    requires customer;

    exports de.leuphana.crs.booking.behavior;
    exports de.leuphana.crs.booking.structure;
}