import pandas as pd
import mysql.connector
db = mysql.connector.connect(
    host = "localhost",
    user = "root",
    passwd = "admin123",
    database = "company_database"
)
conn = db.cursor()
print("Enter 1 to see/modify employee table")
print("Enter 2 to see/modify branch table")
a = int(input())
while True:
    fname=0
    if(a == 1):
        print("Enter 1 to see employee table")
        print("Enter 2 to modify employee table")
        print("Enter 3 to exit to main menu")
        b = int(input())
        if(b == 1):
            conn.execute("select * from employee")
            data = conn.fetchall()
            table = pd.DataFrame(data, columns=['first_name', 'last_name', 'email_id'])
            print(table)
            db.commit()
        elif(b == 2):
            while True:
                print("Enter 1 to add employee")
                print("Enter 2 to remove employee")
                print("Enter 3 to exit to main menu")
                c = int(input())
                if(c == 1):
                    print("Enter the first_name")
                    fname = input()
                    print("Enter the last_name")
                    lname = input()
                    print("Enter the email_id")
                    email = input()
                    d8 = int(input())
                    conn.execute("""INSERT INTO EMPLOYEE VALUES(?, ?, ?)""",(fname, lname, email))
                    conn.commit()
                    if(conn):
                        print("Data restored")
                    else:
                        print("error occurred")    
                elif(c == 2):
                    print("Enter the name of the employee to be removed")
                    fname1 = input()
                    conn.execute("""DELETE FROM employee WHERE first_name=?""",(fname1))
                    conn.commit()
                else:
                    break;    

conn.close()
db.close()                
