int decimalNumber, binaryNumber
String decimalString, binaryString
println ""
println "BINARY-DECIMAL & DECIMAL-BINARY CONVERSION"
boolean noMore = false
while (!noMore) {
	println "You have 2 options"
	println "Enter 1 for Binary-to-Decimal, 2 for Decimal-to-Binary or 0 to exit"
	conversionChoice = Integer.parseInt(System.console().readLine())
	if (conversionChoice == 1) {
		print "enter binary number: "
		binaryString = System.console().readLine()
		decimalNumber = binary2decimal(binaryString)
		println "corresponding decimal number = " + decimalNumber
	} else if (conversionChoice == 2) {
		print "enter decimal number: "
		decimalString = System.console().readLine()
		decimalNumber = Integer.parseInt(decimalString)
		binaryNumber = decimal2binary(decimalNumber)
		println "corresponding binary number = " + binaryNumber
	} else {
		noMore = true
	}
}

int binary2decimal(String binaryString) {
	String binaryLetter
	int binaryDigit, powerOf2
	int numberOfDigits = binaryString.length()
	int result = 0
	for (i=0;i<numberOfDigits;i++) {
		binaryLetter = binaryString.substring(i,i+1)
		binaryDigit = Integer.parseInt(binaryLetter)
		powerOf2 = numberOfDigits - i - 1
		result = result + binaryDigit * Math.pow(2,powerOf2)
	}
	return result
}

int decimal2binary(int decimalNumber) {
	String binaryString = ""
	int remainder, result
	while (decimalNumber!=0) {
		remainder = decimalNumber % 2
		decimalNumber = decimalNumber / 2
		binaryString = remainder + binaryString
	}
	result = Integer.parseInt(binaryString)
	return result
}