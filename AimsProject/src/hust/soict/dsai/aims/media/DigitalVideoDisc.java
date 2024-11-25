package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    // Create constructor method
    public DigitalVideoDisc() {
    	super();
	}

    public DigitalVideoDisc(String title) {
		setTitle(title);
		setId(nbMedia);
		nbMedia++;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		setTitle(title);
		setCategory(category);
		setCost(cost);
		setId(nbMedia);
		nbMedia++;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		setTitle(title);
		setCategory(category);
		setDirector(director);
		setCost(cost);
		setId(nbMedia);
		nbMedia++;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		setTitle(title);
		setCategory(category);
		setDirector(director);
		setLength(length);
		setCost(cost);
		setId(nbMedia);
		nbMedia++;
	}
    
	@Override
	public String toString() {
		return (getId() + 1) + ". DVD - " + this.getTitle() + " - " + this.getCategory() + 
				" - " + this.getDirector() + " - " + this.getLength() + 
				": " + this.getCost() + "$\n";
	}
    
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength() + "\n");
    }
    
}
