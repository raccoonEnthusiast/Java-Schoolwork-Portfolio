package task1;

/* 
 * Name: Andrew Phillips
 * I pledge by honour that this program is solely my own work
 */

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		List<Note> notes = new LinkedList<>();
		notes.add(new Note("D", 19));
		notes.add(new Note("C", 20));
		notes.add(new Note("F", 31));
		notes.add(new Note("B", 45));
		notes.add(new Note("C", 73));
		notes.add(new Note("F", 13));
		notes.add(new Note("B", 34));
		notes.add(new Note("C", 53));

		processNotes(notes);
		drawRandomGroups(notes);
	}

	// Displays each note instance and calculates total duration
	public static void processNotes(List<Note> notes) {
		int totalDuration = 0;
		for (Note e : notes) {
			e.playNote(e.getPitch(), e.getDuration());
			totalDuration += e.getDuration();
		}
		System.out.printf("Total duration: %d seconds\n", totalDuration);
	}

	// Creates three lists as groups
	// Assigns each note to a random list
	// Displays contents of each list
	public static void drawRandomGroups(List<Note> notes) {

		List<Note> group1 = new LinkedList<>();
		List<Note> group2 = new LinkedList<>();
		List<Note> group3 = new LinkedList<>();

		for (Note e : notes) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 4);

			switch (randomNum) {
			case 1:
				group1.add(new Note(e.getPitch(), e.getDuration()));
				break;
			case 2:
				group2.add(new Note(e.getPitch(), e.getDuration()));
				break;
			case 3:
				group3.add(new Note(e.getPitch(), e.getDuration()));
				break;
			}

		}

		System.out.printf("%d Notes in group #1\n", group1.size());
		for (Note e : group1) {
			e.playNote(e.getPitch(), e.getDuration());
		}

		System.out.printf("%d Notes in group #2\n", group2.size());
		for (Note e : group2) {
			e.playNote(e.getPitch(), e.getDuration());
		}

		System.out.printf("%d Notes in group #3\n", group3.size());
		for (Note e : group3) {
			e.playNote(e.getPitch(), e.getDuration());
		}

	}
}
