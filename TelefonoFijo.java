public class TelefonoFijo implements Device {

	@Override
	public void makePhoneCall(int phoneNumber) {
		System.out.println("Llamando al numero: " + phoneNumber + " desde mi: " + this.deviceType + " " + this.getManufacturer());

	}
}
