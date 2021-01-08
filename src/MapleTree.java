
public class MapleTree {
	
	private String plantDate;
	private String heightDate;
	private double height;
	
	public MapleTree() {}
	
	public MapleTree(String plantDate, String heightDate, double height) {
		this.plantDate = plantDate;
		this.heightDate = heightDate;
		this.height = height;
	}
	
	public void plant(String value) {
		plantDate = value;
	}
	
	public void germinate(String value) {
		heightDate = value;
	}
	
	public void height(double value) {
		height = value;
	}
	
	public void dumpData() {
		System.out.println(plantDate + "\n" + heightDate + "\n" + height);
	}
}
