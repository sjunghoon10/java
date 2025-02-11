package castingTask2;

class Creature {
}

class Ork extends Creature{
	void dead() {
		System.out.println("가죽을 얻는다");
	}
}

class Elf extends Creature{
	void dead() {
		System.out.println("날개를 얻는다");
	}
}

class Human extends Creature{
	void dead() {
		System.out.println("갑옷을 얻는다");
	}
}

public class Character {
// 이름, 직업, 레벨
// 사냥하는 메서드
	String name;
	String job;
	int level;
	
	public Character() {;}
	
	
	public Character(String name, String job, int level) {
		this.name = name;
		this.job = job;
		this.level = level;
	}


	void hunt(Creature mob) {
		if(mob instanceof Ork){
			Ork orkInstance = (Ork)mob;
			orkInstance.dead();
		}
		else if(mob instanceof Elf){
			Elf elfInstance = (Elf)mob;
			elfInstance.dead();
		}
		else if(mob instanceof Human) {
			Human humanInstance = (Human)mob;
			humanInstance.dead();
		}
	}
}
