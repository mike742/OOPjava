
public class MapleTree {
	
	private String _plantDate;
	private String _heightDate;
	private double _height;
	
	public MapleTree() { }

	public MapleTree(String plantDate) {
		_plantDate = plantDate;
	}
	
	public MapleTree(String plantDate, String heightDate) {
		_plantDate = plantDate;
		_heightDate = heightDate;
	}	
	
	public MapleTree(String plantDate, String heightDate, double height) {
		System.out.println("constructor with parameters called");
		_plantDate = plantDate;
		_heightDate = heightDate;
		_height = height;
		
		this.dumpData();
	}
	
	public void plant(String value) {
		_plantDate = value;
	}
	
	public void germinate(String value) {
		_heightDate = value;
	}
	
	public void height(double value) {
		_height = value;
	}
	
	public void dumpData() {
		System.out.println(_plantDate + "\n" + _heightDate + "\n" + _height);
	}
}
