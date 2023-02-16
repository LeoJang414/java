package 생성자;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int hour;
	
	public Day(String doing, int time, String location) {
		super();
		count++;
		hour += time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
}
