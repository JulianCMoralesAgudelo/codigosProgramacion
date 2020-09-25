public class SimpleLocation {
	public double lat;
	public double lon;

	public SimpleLocation(double latIn, double lonIn) {
		this.lat = latIn;
		this.lon = lonIn;
	}

	public static class LocationTester {
		public static void main(String[] args) {
			SimpleLocation lima = new SimpleLocation(-12.0, -77.0);
			System.out.println(lima.lat);
			System.out.println(lima.lon);
		}
	}
}