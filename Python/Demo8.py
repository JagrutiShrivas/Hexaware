class Bank:
    def Loan(self):
        print("Loan with first Super bank, ");
    def Loan(self):
        print("Loan with second super bank, "); #overloading not possible

class SBI(Bank):
    def Loan(self):
        print("Loan with SBI class");

d=SBI();
d.Loan();
