import pandas
import mysql.connector
# connector
db = mysql.connector.connect(
    host="127.0.0.1",
    user="root",  # change the username
    password="admin123",  # change the password
    database="trisanjit"
)

conn = db.cursor()
# loop will run until the user stops it
while True:
    print("Enter 1 for system generation")
    print("Enter 2 for Shop")
    print("Enter 3 to exit")
    v = int(input())
    q = ""
    if v == 1:
        while True:
            print("Enter 1 to create customer table")
            print("Enter 2 to create item table")
            print("Enter 3 to create bill table")
            print("Enter 4 to exit to main menu")
            k = int(input())
            if k == 1:
                # To generate customer table
                try:
                    q = """
create table customer(
    cid varchar(255) primary key,
    cname varchar(255) not null,
    cphone bigint not null
)
"""
                    conn.execute(q)
                    db.commit()
                except:
                    print("Customer table already exits")
            elif k == 2:
                # To generate item table
                try:
                    q = """
create table item(
    itemID varchar(255) primary key,
    ItemName varchar(255) not null,
    ItemPrice decimal not null
)
"""
                    conn.execute(q)
                    db.commit()
                except:
                    print("Item table already exits")
            elif k == 3:
                # To generate bill table
                try:
                    q = """
create table bill(
    orderID int not null auto_increment,
    cid varchar(255) not null,
    itemID varchar(255) not null,
    quantity int not null,
    amount decimal not null,
    primary key(orderID),
    foreign key(cid) references customer(cid) on update cascade,
    foreign key(itemID) references item(itemID) on update cascade
)
"""
                    conn.execute(q)
                    db.commit()
                except:
                    print("Bill table already exits")
            else:
                break
    if v == 2:
        while True:
            print("Enter 1 to enter customer information")
            print("Enter 2 to update customer information")
            print("Enter 3 to display the customers")
            print("Enter 4 to select the item to buy")
            print("Enter 5 to generate the bill")
            print("Enter 6 to add items to the inventory")
            print("Enter 7 to remove items from the inventory")
            print("Enter 8 to update items in the inventory")
            print("Enter 9 to show list of items in the inventory")
            print("Press any other number to go main menu")
            k = int(input())
            if k == 1:
                # To add customer information
                try:
                    cid = 'C' + str(int(input("Enter a customer number: ")))
                    name = input("Enter name of the customer: ")
                    phone = str(int(input("Enter phone number")))
                    q = "insert into customer(cid,cname,cphone) values(\"" + \
                        cid + "\"," + "\"" + name + "\"," + phone + ");"
                    conn.execute(q)
                    db.commit()
                except:
                    print("Error encountered while entering data.")
            elif k == 2:
                # To update customer info
                while True:
                    print("Enter 1 to update name")
                    print("Enter 2 to update phone number")
                    print("Enter any other number to go back to main menu: ")
                    h = int(input())
                    if h == 1 or h == 2:
                        t = input("Enter customer id: ")
                        try:
                            q = "select cid from customer where cid=\"" + t + "\""
                            conn.execute(q)
                            p = conn.fetchone()
                            if p[0] == t:
                                if h == 1:
                                    try:
                                        name = input("Enter name: ")
                                        q = "update customer set cname = \"" + name + "\" where cid=\"" + p[0] + "\""
                                        conn.execute(q)
                                        db.commit()
                                    except:
                                        print("Try Again..Error Encountered")
                                elif h == 2:
                                    try:
                                        phone = str(int(input("Enter phone number: ")))
                                        q = "update customer set cphone = \"" + phone + "\" where cid=\"" + p[0] + "\""
                                        conn.execute(q)
                                        db.commit()
                                    except:
                                        print("Error Encountered...Try Again")
                        except:
                            print("Customer Not Found")
                    else:
                        break

            elif k == 3:
                # To display customer list
                try:
                    q = "select * from customer"
                    conn.execute(q)
                    result = conn.fetchall()
                    table = DataFrame(result, columns=['Customer ID', 'Customer Name', 'Customer Phone'])
                    print(table)
                except:
                    print("Error fetching customer list")
            elif k == 4 or k == 5:
                try:
                    q = "select * from item"
                    conn.execute(q)
                    result = conn.fetchall()
                    table = DataFrame(result, columns=['Item ID', 'Item Name', 'Item Price'])
                    print(table)
                except:
                    print("Error displaying items")
                prices = []  # to store prices
                quantity = []  # to store quantity
                while True:
                    print("Enter 1 to select the item")
                    print("Enter 2 to display the bill: ")
                    print("Enter any other number to go back to previous menu: ")
                    option = int(input())
                    if option == 1:
                        try:
                            s = 'S' + str(int(input("Select the item by entering item number: ")))
                            q = 'select ItemPrice from item where itemID="' + s + '"'
                            conn.execute(q)
                            result = conn.fetchone()
                            price = result[0]  # item price
                            quant = int(input("Enter the quantity: "))
                            select = 'C' + str(int(input("Enter customer number: ")))
                            q = 'select cid from customer where cid="' + select + '"'
                            conn.execute(q)
                            result = conn.fetchone()
                            customer = str(result[0])  # customer id
                            total = price * quant
                            q = 'insert into bill(cid,itemID,quantity,amount) values("' + customer + '","' + s + '",' + str(
                                quant) + ',' + str(total) + ')'
                            conn.execute(q)
                            db.commit()
                        except:
                            print("Error encountered while entering bill information")
                    elif option == 2:
                        try:
                            q = 'select * from bill'
                            conn.execute(q)
                            print("Bill Generated is ")
                            result = conn.fetchall()
                            table = DataFrame(result,
                                              columns=['Order ID', 'Customer ID', 'Item ID', 'Quantity', 'Amount'])
                            print(table)
                        except:
                            print("Error Encountered while displaying bill")
                    else:
                        break

            elif k == 6:
                # To add items to the inventory
                try:
                    iid = 'S' + str(int(input("Enter item serial number: ")))
                    iname = input("Enter name of the item: ")
                    price = input("Enter price of the item: ")
                    q = "insert into item(itemID,ItemName,ItemPrice) values(\"" + \
                        iid + "\"," + "\"" + iname + "\"," + price + ");"
                    conn.execute(q)
                    db.commit()
                except:
                    print("Error encountered while entering data.")
            elif k == 7:
                try:
                    iid = 'S' + str(int(input("Enter item serial number: ")))
                    q = "delete from item where itemID=\"" + iid + "\""
                    conn.execute(q)
                    db.commit()
                except:
                    print("Error encountered while removing the item")
            elif k == 8:
                # To update items in the inventory
                while True:
                    print("Enter 1 to update Item Name")
                    print("Enter 2 to update Item Price")
                    print("Enter any other number to go back to main menu: ")
                    h = int(input())
                    if h == 1 or h == 2:
                        t = input("Enter item id: ")
                        try:
                            q = "select itemID from item where itemID=\"" + t + "\""
                            conn.execute(q)
                            p = conn.fetchone()
                            if p[0] == t:
                                if h == 1:
                                    try:
                                        name = input("Enter name: ")
                                        q = "update item set ItemName = \"" + name + "\" where itemID=\"" + p[0] + "\""
                                        conn.execute(q)
                                        db.commit()
                                    except:
                                        print("Try Again..Error Encountered")
                                elif h == 2:
                                    try:
                                        phone = str(int(input("Enter Item Price: ")))
                                        q = "update item set ItemPrice = \"" + phone + "\" where itemID=\"" + p[
                                            0] + "\""
                                        conn.execute(q)
                                        db.commit()
                                    except:
                                        print("Error Encountered...Try Again")
                        except:
                            print("Item Not Found")
                    else:
                        break
            elif k == 9:
                # To show all the items in item table
                try:
                    q = "select * from item"
                    conn.execute(q)
                    result = conn.fetchall()
                    table = DataFrame(result, columns=['Item ID', 'Item Name', 'Item Price'])
                    print(table)
                except:
                    print("Error Fetching Item Table")
            else:
                break
    if v >= 3:
        conn.close()
        db.close()
        break
