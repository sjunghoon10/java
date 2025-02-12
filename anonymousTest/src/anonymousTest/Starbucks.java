package anonymousTest;

public class Starbucks {
	
	boolean isFree;
	public Starbucks() {;}
	
	public Starbucks(boolean isFree)
	{
		this.isFree = isFree;
	}
	
	public void openEvent()
	{
		this.isFree = true;
	}
	
	public void closeEvent()
	{
		this.isFree = false;
	}
	
	public void register(Form form) {
		String[] menu = form.getMenus();
//		for(int i=0; i< menu.length; i++) {
//			System.out.println(i + 1 + "." + menu[i]);
//		}
		
		form.sell("에이드");
	}
}
