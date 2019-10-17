package util;



import javax.mail.Authenticator;

import javax.mail.PasswordAuthentication;



public class Gmail extends Authenticator {



    @Override

    protected PasswordAuthentication getPasswordAuthentication() {

        return new PasswordAuthentication("boysky1234@naver.com","!skdi312k");

    }
}

    


/*
 * PasswordAuthentication pa; public Gmail() { String mail_id =
 * "namhyo312@gmail.com"; String mail_pw = "!skdi312k";
 * 
 * pa = new PasswordAuthentication(mail_id, mail_pw); }
 * 
 * public PasswordAuthentication getPasswordAuthentication() {
 * 
 * return pa;
 // 서버 주소 587 변경 후 시도하고 다시 465돌리기
 */
