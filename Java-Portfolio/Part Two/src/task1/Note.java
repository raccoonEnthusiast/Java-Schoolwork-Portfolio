package task1;

public class Note {

	private String pitch;

	public String getPitch() {
		return pitch;
	}

	public void setPitch(String pitch) {
		this.pitch = pitch;
	}

	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Note(String pitch, int duration) {
		this.setDuration(duration);
		this.setPitch(pitch);
	}

	public void playNote(String pitch, int duration) {
		System.out.printf("The note %s is played for %d seconds\n", this.getPitch(), this.getDuration());
	}

}
