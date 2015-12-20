Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
	println "even.";
} else if (i2.isOdd()) {
	println "odd.";
} else {
	println "undefined!! Your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
	println("Your toString() method seems to work fine.");
}

class Integer2 {
	int value
	// returns the value of this number as an int, a getter
	int getValue() {
		return value
	}

	// a setter
	void setValue(int value) {
		this.value = value
	}

	// returns true if the number is even, false otherwise
	boolean isEven() {
		return (value % 2 == 0)
	}

	// the opposite
	boolean isOdd() {
		return (value % 2 != 0)
	}

	// prints the value of the integer on the screen
	void prettyPrint() {
		println(value)
	}

	// returns a String equivalent to the number
	String toString() {
		return "" + value
	}
}

