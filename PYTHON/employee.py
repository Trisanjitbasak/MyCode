import mysql.connector
db = mysql.connector.connect(
    host = "localhost",
    user = "root",
    passwd = "admin123",
    database = "employee"
)
conn = db.cursor()
print("Enter 1 for Auto-generation")
print("Enter 2 for Employees")
print("Enter 3 for exit")
k = int(input())
i=0
if(k == 1):
    print("Enter 1 to add an employee")
    print("Enter 2 to delete an employee")
    print("Enter 3 to modify the data")
    print("Enter 4 to exit to main menu")
    n = int(input())
    if(n == 1):
        CID = str(int(input("Enter a employee number: ")))
        name = input("Enter name of the employee: ")
        phone = str(int(input("Enter phone number: ")))
        q = "insert into employee values(CID, name, phone);"
        conn.execute(q)
        db.commit()
