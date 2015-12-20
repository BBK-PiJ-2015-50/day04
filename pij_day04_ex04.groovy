println "BINARY-DECIMAL & DECIMAL-BINARY CONVERSION"
// Trying out using a labelled break
mainloop: while (true) {
	println "Enter 1 for Binary-to-Decimal, 2 for Decimal-to-Binary or 0 to exit"
	switch (Integer.parseInt(System.console().readLine())) {
		case 1:
			print "enter binary number: "
			println "converted to decimal = " + binary2decimal(System.console().readLine())
			break;
		case 2:
			print "enter decimal number: "
			println "converted to binary = " + decimal2binary(Integer.parseInt(System.console().readLine()))
			break;
		default:
			break mainloop;
	}
}

int binary2decimal(String binaryString) {
	int binaryDigit, powerOf2
	int result = 0
	for (i=0;i<binaryString.length();i++) {
		binaryDigit = Integer.parseInt(binaryString.substring(i,i+1))
		powerOf2 = binaryString.length() - i - 1
		result = result + binaryDigit * Math.pow(2,powerOf2)
	}
	return result
}

String decimal2binary(int decimalNumber) {
	String result = ""
	while (decimalNumber!=0) {
		result = decimalNumber % 2 + result
		decimalNumber = decimalNumber / 2
	}
	return result
}