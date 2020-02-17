package GoHome;

public class Main {

	public static void main(String[] args) {
		ChenQianRong a=new ChenQianRong();
		 GoHomeable b=new CreamRong();
         doGoHome(a);
         doGoHome(b);
	}
	
	private static void doGoHome(GoHomeable go) {
		go.leaveOffice();
		go.goHome();
		go.dinner();
		go.sleep();
	}

}