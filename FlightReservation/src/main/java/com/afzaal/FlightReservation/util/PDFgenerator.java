package com.afzaal.FlightReservation.util;

import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.afzaal.FlightReservation.Entities.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PDFgenerator {
	public void generatepdf(Reservation reservation, String filepath) {
		Document document = new Document(); // Create a new Document instance for each PDF
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filepath));
			document.open();
			System.out.println("done");
			document.add(new PdfPTable(2));
			document.add(generateTable(reservation));
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private PdfPTable generateTable(Reservation reservation) {
		PdfPTable table = new PdfPTable(2);
		PdfPCell cell;
		cell = new PdfPCell(new Phrase("Flight Itinerary"));
		cell.setColspan(2);
		table.addCell(cell);

		cell = new PdfPCell(new Phrase("Flight Details"));
		cell.setColspan(2);
		table.addCell(cell);

		table.addCell("Airlines ");
		table.addCell(reservation.getFlight().getOperatingairline());

		table.addCell("Departure City");
		table.addCell(reservation.getFlight().getDeparturecity());

		table.addCell("Arrival City");
		table.addCell(reservation.getFlight().getArrivalcity());

		table.addCell("Flight Number");
		table.addCell(reservation.getFlight().getFlightnumber());

		table.addCell("Departure Date");
		table.addCell(reservation.getFlight().getDeparturecity());

		table.addCell("Departure Time");
		table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());

		cell = new PdfPCell(new Phrase("Passenger Details"));
		cell.setColspan(2);
		table.addCell(cell);

		table.addCell("First Name");
		table.addCell(reservation.getPassenger().getFirstname());

		table.addCell("Middle Name");
		table.addCell(reservation.getPassenger().getMiddlename());

		table.addCell("Last Name");
		table.addCell(reservation.getPassenger().getLastname());

		table.addCell("Email");
		table.addCell(reservation.getPassenger().getEmail());

		table.addCell("Phone");
		table.addCell(reservation.getPassenger().getPhone());

		return table;
	}

}
