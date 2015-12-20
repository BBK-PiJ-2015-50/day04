// Not sure this question makes sense as a mortgage calculator,
// but assuming question intends interest rate to mean a rate to cover the whole loan period,
// rather than an annual interest rate...

print "Enter total mortgage amount: "
double amountBorrowed = Double.parseDouble(System.console().readLine())
print "Enter number of years to pay it back: "
double yearsToPayBack = Double.parseDouble(System.console().readLine())
print "Enter interest rate: "
double interestRate = Double.parseDouble(System.console().readLine())
MortgageCalculator(amountBorrowed, yearsToPayBack, interestRate)

void MortgageCalculator(double amountBorrowed, double yearsToPayBack, double interestRate) {
	double totalAmountToBePaid = amountBorrowed * (1 + (interestRate / 100))
	println ("Total amount to be paid = " + totalAmountToBePaid)
	double moneyToPayEveryYear = totalAmountToBePaid / yearsToPayBack
	println ("Money to pay every year = " + moneyToPayEveryYear)
	double yearsBeforeOnlyCapitalRemains = (totalAmountToBePaid - amountBorrowed) / moneyToPayEveryYear
	println ("Number of years before interest is paid and only capital remains = " + yearsBeforeOnlyCapitalRemains)
}
