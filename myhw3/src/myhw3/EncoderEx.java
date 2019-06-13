package myhw3;

public class EncoderEx {
	public static void main(String[] args) {
		EncoderEx ex = new EncoderEx();
		
		byte[] inputdata = new byte[6];
		inputdata[0] = 0x12;
		inputdata[1] = 0x34;
		inputdata[2] = 0x56;
		inputdata[3] = 65;
		inputdata[4] = 66;
		inputdata[5] = 67;
		
		System.out.println("Base64 : "+ 
				ex.Encoding(inputdata, new Base64()) );
		System.out.println("ASCII  : "+ 
						ex.Encoding(inputdata, new ASCII()) );
		System.out.println("Hex    : "+ 
						ex.Encoding(inputdata, new Hex()) );
		System.out.println("Binary : "+ 
						ex.Encoding(inputdata, new Binary()) );
		System.out.println("Decimal : "+ 
						ex.Encoding(inputdata, new Decimal()) );
				
		
		
	}
	
	public String Encoding(byte[] inputdata, Encodable en) {
		String res = en.encode(inputdata);
		return res;
	}
}
