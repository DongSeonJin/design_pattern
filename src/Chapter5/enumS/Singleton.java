package Chapter5.enumS;

public enum Singleton {
	UNIQUE_INSTANCE;
 
	// 기타 필요한 필드
	public String getDescription() {
		return "쓰레드세이프 합니다";
	}
}
