public class SmartWatch implements Device {

	@Override
	public void makePhoneCall(int phoneNumber) {
		System.out.println("Llamando al numero: " + phoneNumber + " desde mi: " + this.deviceType + " " + this.getManufacturer());

	}

	@Override
	public void takePic() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveDeviceTo(int PosX, int PosY) {
		// TODO Auto-generated method stub

	}

}
