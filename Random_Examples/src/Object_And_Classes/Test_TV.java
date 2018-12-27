package Object_And_Classes;

public class Test_TV {
public static void main(String[] args) {
	TV tv1 = new TV();
	tv1.turnon();
	tv1.setChannel(25);
	tv1.setVolumeLevel(3);
	System.out.println("volume level is " + tv1.volumelevel +" tv1's channel is " + tv1.channel  );
	tv1.channelDown();
	tv1.volumeLevelUp();
	System.out.println("volume level is " + tv1.volumelevel +" tv1's channel is " + tv1.channel  );
	TV tv2 = new TV();
	tv2.turnon();
	tv2.channelUp();
	tv2.channelUp();
	tv2.volumeLevelUp();
	System.out.println("volume level is " + tv2.volumelevel +" tv1's channel is " + tv2.channel);
}
}
