package JbkPack;

public class Greeting_Message_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String emailMsg="Email-this is test mail by JBK";
		String smsMsg="SMS-best book for Java dev";
		System.out.println("icici");
		Greeting_Message greeting_message=new Greeting_Message();
		greeting_message.getEmailTxt(emailMsg);
		greeting_message.getSmsTxt(smsMsg);

		System.out.println("BOA");
		Greeting_Message greeting_messageBOA=new Greeting_Message("Hello","KiranBOA");
		greeting_messageBOA.getEmailTxt(emailMsg);
		greeting_messageBOA.getSmsTxt(smsMsg);

		System.out.println("HDFC");
		Greeting_Message greeting_messagehdfc=new Greeting_Message("Hello","Kiranhdfc");
		greeting_messagehdfc.getEmailTxt(emailMsg);
		greeting_messagehdfc.getSmsTxt(smsMsg);
		
		
	}

}
