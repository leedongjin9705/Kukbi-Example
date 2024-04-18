package chap08.sec04;

public class Audio implements RemoteControl {
	// 필드 선언
	private int volume;
	
	@Override// turnOn() 추상 메소드 오버라이딩	
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}
	
	@Override // turnOff() 추상 메소드 오버라이딩	
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}
	
	@Override// setVolume() 추상 메소드 오버라이딩	
	public void setVolume(int volume) {
		//인터페이스  상수 필드를 이용 ==> volume 필드의 값을 제한
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨: "  + this.volume);
	}
	

}
