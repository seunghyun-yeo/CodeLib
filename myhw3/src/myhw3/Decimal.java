package myhw3;

public class Decimal extends EncodeP implements Encodable {
	public byte[] CodeWord(byte[] in) {
		byte [] word = new byte[3];
		word[0] = (byte)(in[0]/100);
		word[1] = (byte)((in[0]%100)/10);
		word[2] = (byte)(in[0]%10);
		return word;
	}
	
	Decimal(){
		symbol_map = new String("0123456789");
	}
}
