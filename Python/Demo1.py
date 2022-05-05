start= int(input("Enter start number: "));
end= int(input("Enter end number: "));
inc= int(input("Enter increment number: "));

for i in range(start, end, inc):
    print(i);
    
print("==================");
for i in range(20):
    if(i%2==0):
        print("even: ", i);
