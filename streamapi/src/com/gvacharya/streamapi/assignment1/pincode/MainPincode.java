package com.gvacharya.streamapi.assignment1.pincode;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class MainPincode {

	public static void main(String[] args) {
		
		Pincode[] pincodeArray = new Pincode[5];
		
		pincodeArray[0] = new Pincode(400072);
		pincodeArray[1] = new Pincode(400074);
		pincodeArray[2] = new Pincode(400076);
		pincodeArray[3] = new Pincode(400078);
		pincodeArray[4] = new Pincode(400080);
		
		
		Stream<Pincode> pincodeStream = Arrays.stream(pincodeArray);
		
		
		Optional<Integer> max = pincodeStream
			.map(Pincode::getPincode)
				.max((p1,p2)->{return (p1>p2)?p1:p2;});
		
		if(!max.isEmpty())
			System.out.println(max);
		
//		OptionalInt max = pincodeStream.max();
//		System.out.println(max);
				
	}
	
}
