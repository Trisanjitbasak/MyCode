import tkinter as tk

# Create an empty list to store the to-do items
todo_list = []

# Define a function to add a new item to the list
def add_item():
    # Get the text from the entry widget
    item = entry.get()
    # Add the item to the list
    todo_list.append(item)
    # Clear the entry widget
    entry.delete(0, tk.END)
    # Refresh the listbox with the updated list
    update_listbox()

# Define a function to remove the selected item from the list
def remove_item():
    # Get the index of the selected item
    index = listbox.curselection()[0]
    # Remove the item from the list
    todo_list.pop(index)
    # Refresh the listbox with the updated list
    update_listbox()

# Define a function to refresh the listbox with the updated list
def update_listbox():
    # Clear the listbox
    listbox.delete(0, tk.END)
    # Add each item from the list to the listbox
    for item in todo_list:
        listbox.insert(tk.END, item)

# Create the main window
root = tk.Tk()
root.title("To-Do App")

# Create the entry widget
entry = tk.Entry(root)
entry.pack()

# Create the "Add" button
add_button = tk.Button(root, text="Add", command=add_item)
add_button.pack()

# Create the listbox to display the to-do items
listbox = tk.Listbox(root)
listbox.pack()

# Create the "Remove" button
remove_button = tk.Button(root, text="Remove", command=remove_item)
remove_button.pack()

# Start the main event loop
root.mainloop()