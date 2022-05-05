class Demo:
    def __init__(self):
        try:
            a= int(input("Enter A value: "));
            b= int(input("Enter B value: "));
            c=a/b;
            print("Res: " , c);
        except:
            print("can not divide by zero");
        finally:
            print("Thankyou");

d=Demo();
