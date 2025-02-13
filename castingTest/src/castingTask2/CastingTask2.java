package castingTask2;

public class CastingTask2 {

	public static void main(String[] args) {
//		캐릭터는 오크, 요정, 인간을 사냥할 수 있다.
//		오크 : 가죽을 얻는다.
// 		요정 : 날개를 얻는다.
// 		인간 : 갑옷을 얻는다.
	
	Character jh = new Character("jh", "warrior", 17);
	Creature mobOrk = new Ork();
	Creature mobElf = new Elf();
	Creature mobHuman = new Human();
	
	jh.hunt(mobElf);
	}
}
