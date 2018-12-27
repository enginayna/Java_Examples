package Object_And_Classes;

public class TV {
	int channel = 1;
	int volumelevel = 1;
	boolean on = false;
	
	public TV() {
	}
	public void turnon() {
		on = true;
	}
	public void turnoff() {
		on = false;
	}
	public void setChannel(int newChannel) {
		if(on && newChannel >=1 && newChannel <=120) {
		channel = newChannel;
		}
	}
	public void setVolumeLevel(int newVolumeLevel) {
		if(on && newVolumeLevel >=1 && newVolumeLevel <=7) {
			volumelevel = newVolumeLevel;
		}
	}
	public void channelUp() {
		if(on && channel<120) {
			channel++;
		}
	}
	public void channelDown() {
		if(on && channel >1) {
			channel--;
		}
	}
	public void volumeLevelUp() {
		if(on && volumelevel< 7) {
			volumelevel++;
		}
	}
	public void volumeLevelDown() {
		if(on && volumelevel>1){
			volumelevel--;
		}
	}
}
