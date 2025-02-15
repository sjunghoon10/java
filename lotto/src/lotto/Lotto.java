package lotto;

class Researcher implements LottoOwner {
	int[] myNumbers;
	public Researcher() {;}
	
	public Researcher(int[] numbers) {
		myNumbers = numbers;
	}
}

class Worker implements LottoOwner {
	int[] myNumbers;
	public Worker() {;}
	
	public Worker(int[] numbers) {
		myNumbers = numbers;
	}
}

public class Lotto {
	 int[] drawNumber() {
		 int[] luckyNumber = new int[6];
		 for(int i=0; i<6;) {
			 int number = (int)Math.floor(Math.random() * 7 + 1);
			 boolean isOne = true;
			 for(int j=0; j<i; j++) {
				 if(number == luckyNumber[j]) {
					 isOne = false;
					 break;
				 }
			 }
			 if(isOne == true) {
				 luckyNumber[i] = number;
				 i++;
			 }
		 }
		return luckyNumber;
	}
	 
	 public void checkNumber(LottoOwner lottoPerson, int[] luckyNumber) {
			int count = 0;
			if(lottoPerson instanceof Researcher)
			{
				Researcher researcher = (Researcher)lottoPerson;
				int[] myNumbers = researcher.myNumbers;
				for(int i=0; i<luckyNumber.length; i++)
				{
					for(int j=0; j<myNumbers.length; j++)
					{
						if(luckyNumber[i] == myNumbers[j])
						{
							count++;
							break;
						}
					} 
				}
				if(count == 6)
				{
					System.out.println("연구에 투자한다.");
				}
				else if(count == 5)
				{
					System.out.println("지인에게 밥을 산다.");
				}
			}
			else if(lottoPerson instanceof Worker)
			{
				Worker worker = (Worker)lottoPerson;
				int[] myNumbers = worker.myNumbers;
				for(int i=0; i<luckyNumber.length; i++)
				{
					for(int j=0; j<myNumbers.length; j++)
					{
						if(luckyNumber[i] == myNumbers[j])
						{
							count++;
							break;
						}
					} 
				}
				if(count == 6)
				{
					System.out.println("직장을 그만둔다.");
				}
				else if(count == 5)
				{
					System.out.println("전액을 저축한다.");
				}
			}
		}
	 
	 public static void main(String[] args) {
		 Lotto lotto = new Lotto();
		 int[] lottos = lotto.drawNumber();
		 for(int i=0; i<lottos.length; i++) {
			 System.out.println(lottos[i]);
		 }
		 int[] luckNumber = {1, 5, 23, 25, 29, 38};
		 int[] workerNumber = {1, 5, 23, 25, 29, 39}; 
		 LottoOwner worker = new Worker(workerNumber);
		 LottoOwner researcher = new Researcher(workerNumber);
		 lotto.checkNumber(researcher, luckNumber);
 	}
}
