import mysql.connector
db = mysql.connector.connect(
    host = "localhost",
    user = "root",
    passwd = "admin123",
    database = "employee"
)
conn = db.cursor()
CID = str(int(input("Enter a customer number: ")))
name = input("Enter name of the customer: ")
phone = str(int(input("Enter phone number: ")))
q = "INSERT INTO EMPLOYEE VALUES(CID, name, phone);"
conn.execute(q)
db.commit()