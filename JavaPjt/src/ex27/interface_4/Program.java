package ex27.interface_4;

public class Program {

	public static void main(String[] args) {
		SamMobile mobile = new SamMobile();
		Speaker aSpeaker = new ASpeaker();
		Speaker bSpeaker = new BSpeaker();
		
		mobile.setSpeaker(aSpeaker);
		mobile.play();

	}

}
