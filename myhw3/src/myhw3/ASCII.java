package myhw3;

public class ASCII extends EncodeP implements Encodable {
	public byte[] CodeWord(byte[] in) {
		byte[] word = new byte[1];
		word[0] = (byte)in[0];
		return word;
	}
	
	public String toString(int value) {
		return Character.toString((char)value);
	}
}
