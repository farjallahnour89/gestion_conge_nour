package tn.esprit.gestionconges.security.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import tn.esprit.gestionconges.message.requset.Mail;

@Service
public class EmailServiceImpl implements EmailService{
    @Autowired
	private JavaMailSender javaMailSender;
    
	@Autowired
	public EmailServiceImpl(JavaMailSender javaMailSender) {
		this.javaMailSender=javaMailSender;
	}
	


	@Override
	@Async
	public void sendCodeByMail(Mail mail) {
		SimpleMailMessage simpleMailMessage =new SimpleMailMessage();
		simpleMailMessage.setFrom("youssefchouchene09@gmail.com");
		simpleMailMessage.setTo(mail.getTo());
		simpleMailMessage.setSubject("Code Active");
		simpleMailMessage.setText(mail.getCode());
		javaMailSender.send(simpleMailMessage);
		
	}
	
	
	
	
	@Override
	@Async
	public void sendMailSuggestion(Mail mail) {
		SimpleMailMessage simpleMailMessage =new SimpleMailMessage();
		simpleMailMessage.setFrom("youssefchouchene09@gmail.com");
		simpleMailMessage.setTo(mail.getTo());
		simpleMailMessage.setSubject("il y'a des mauvais Suggestion");
		simpleMailMessage.setText(mail.getCode());
		javaMailSender.send(simpleMailMessage);
		
	}
	
	
	@Override
	@Async
	public void sendMailSujet(Mail mail) {
		SimpleMailMessage simpleMailMessage =new SimpleMailMessage();
		simpleMailMessage.setFrom("youssefchouchene09@gmail.com");
		simpleMailMessage.setTo(mail.getTo());
		simpleMailMessage.setSubject("il y'a des mauvais Sujet");
		simpleMailMessage.setText(mail.getCode());
		javaMailSender.send(simpleMailMessage);
		
	}
	
	@Override
	@Async
	public void sendMailComment(Mail mail) {
		SimpleMailMessage simpleMailMessage =new SimpleMailMessage();
		simpleMailMessage.setFrom("youssefchouchene09@gmail.com");
		simpleMailMessage.setTo(mail.getTo());
		simpleMailMessage.setSubject("il y'a des mauvais Commentaire");
		simpleMailMessage.setText(mail.getCode());
		javaMailSender.send(simpleMailMessage);
		
	}
	
	
	@Override
	@Async
	public void sendMailUsers(Mail mail) {
		SimpleMailMessage simpleMailMessage =new SimpleMailMessage();
		simpleMailMessage.setFrom("youssefchouchene09@gmail.com");
		simpleMailMessage.setTo(mail.getTo());
		simpleMailMessage.setSubject("Reunion");
		simpleMailMessage.setText(mail.getCode());
		javaMailSender.send(simpleMailMessage);
		
	}

}
