package anonymousTest;


public class Building {
	
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks(false);
		jamsil.openEvent();
		//jamsil.closeEvent();
		jamsil.register(new Form() {
			
			@Override
			public void sell(String menu) {
				if(jamsil.isFree == true)
				{
					System.out.println("무료나눔 행사 승인");
				}
				else
				{
					String[] menus = getMenus();
					for(int i=0; i<menus.length; i++) {
						if(menus[i].contains(menu)) {
							System.out.println(menus[i] + "판매 완료");
							break;
						}
					}
				}
				
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}
		});
		
//		gangnam.register(new Form() {
//			
//			@Override
//			public void sell(String menu) {
//				String[] menus = getMenus();
//				for(int i=0; i<menus.length; i++) {
//					if(menus[i].contains(menu)) {
//						System.out.println(menus[i] + "판매 완료");
//						break;
//					}
//				}
//			}
//			@Override
//			public String[] getMenus() {
//				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
//			}
//		});
	}
}
