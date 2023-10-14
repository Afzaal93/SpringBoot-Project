package com.afzaal.FlightReservation.util;

import java.io.File;
import com.sun.mail.util.FolderClosedIOException;
import javax.mail.PasswordAuthentication;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {
	@Autowired
	private JavaMailSender sender;

	public void sendEmail(String toAddress, String filepath) {
		MimeMessage message = sender.createMimeMessage();
		try {
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
			messageHelper.setTo(toAddress);
			messageHelper.setSubject("Itinerary for your flight");
			messageHelper.setText("Please find your Itinerary attached.");
			messageHelper.addAttachment("Invoice", new File(filepath));
			sender.send(message);
			//the email Id pass word is taken by ->Google Account ->app password ->enter og password ->add app ->then take the password generated
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
