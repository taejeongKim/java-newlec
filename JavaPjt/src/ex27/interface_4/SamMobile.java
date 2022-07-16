package ex27.interface_4;

public class SamMobile {
	
	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void play() {
		speaker.amp();
	}

}
