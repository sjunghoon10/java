package mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;

// 메일을 전송하는 메서드로 만들고,
// 팀원들에게 반복문으로 모두 메일 발송시키기

public class MailTest {
	
	public void sendEmail(String mailAddress, String content)
	{
		final String bodyEncoding = "UTF-8"; 
		String username = "junghoon.shin3377@gmail.com";  
		String password = "csrb tbfv bykf ztqm";
		String subject = "[나영순데]";
		String toEmail = mailAddress; 
		String fromEmail = "junghoon.shin3377@gmail.com";
	    String fromUsername = "정훈 신";
	    String html = null;
	    StringBuffer sb = new StringBuffer();
	    sb.append(content);
	    html = sb.toString();
	    // 메일 옵션 설정
	    Properties props = new Properties();    
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.port", "587");
	    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	    props.put("mail.smtp.ssl.protocols", "TLSv1.2");
	    
	    try {
	      // 메일 서버  인증 계정 설정
	      Authenticator auth = new Authenticator() {
	        protected PasswordAuthentication getPasswordAuthentication() {
	          return new PasswordAuthentication(username, password);
	        }
	      };
	      
	      // 메일 세션 생성
	      Session session = Session.getDefaultInstance(props, auth);
	      
	      // 메일 송/수신 옵션 설정
	      Message message = new MimeMessage(session);
	      message.setFrom(new InternetAddress(fromEmail, fromUsername));
	      message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
	      message.setSubject(subject);
	      message.setSentDate(new Date());
	      
//	      // 메일 콘텐츠 설정
	      Multipart mParts = new MimeMultipart();
	      MimeBodyPart mTextPart = new MimeBodyPart();
	      MimeBodyPart mFilePart = null;
	//    
//	      // 메일 콘텐츠 - 내용
	      mTextPart.setText(html, bodyEncoding, "html");
	      mParts.addBodyPart(mTextPart);
//	            
//	      // 메일 콘텐츠 설정
	      message.setContent(mParts);
	 
	      // 메일 발송
	      Transport.send( message );
	      
	    } catch ( Exception e ) {
	      e.printStackTrace();
	    }

	}
	public static void main(String[] args) {
		MailTest mail = new MailTest();
		String[] mailLists = {"j22h.h0h@gmail.com", "rkddl94@gmail.com", "oasis1340@gmail.com","kimys31892@gmail.com"};
		String message = "오늘 끝나고 옥상으로 따라와";
		
		for(String element : mailLists) {
			mail.sendEmail(element, message);
		}
		
	}
	
	
}


