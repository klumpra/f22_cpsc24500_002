package textandmenu;

public class App {
	public static void main(String[] args) {
		Story story = new Story();
		TextAndMenuFrame frm = new TextAndMenuFrame(story);
		frm.setVisible(true);
	}
}
