package pk13;

public class Player {

	private PlayerLevel level;      // PlayerLevel level = new PlayerLevel();
	
	public Player() {
		// PlayerLevel level = new BeginnerLEvel(); 객체생성
		level = new BeginnerLevel();    // 초보자로 메모리받음
		level.showLevelMessage();       // 초보자 메세지
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelMessage();        // 각 레벨의 메세지
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
