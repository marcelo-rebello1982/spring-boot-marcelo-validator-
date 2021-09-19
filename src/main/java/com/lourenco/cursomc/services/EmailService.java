package com.lourenco.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.lourenco.cursomc.model.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
