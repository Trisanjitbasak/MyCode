import tkinter as tk
window = tk.TK()
window,tittle("Calculator")
label = tk.label(window, text="")
lbel.pack()
button1 = tk.button(window, text="1", padx=20, pady=10, command=lamda: button_click(1))
button2 = tk.button(window, text="2", padx=20, pady=10, command=lamda: button_click(2))
button3 = tk.button(window, text="3", padx=20, pady=10, command=lamda: button_click(3))
button4 = tk.button(window, text="4", padx=20, pady=10, command=lamda: button_click(4))
button5 = tk.button(window, text="5", padx=20, pady=10, command=lamda: button_click(5))
button6 = tk.button(window, text="6", padx=20, pady=10, command=lamda: button_click(6))
button7 = tk.button(window, text="7", padx=20, pady=10, command=lamda: button_click(7))
button8 = tk.button(window, text="8", padx=20, pady=10, command=lamda: button_click(8))
button9 = tk.button(window, text="9", padx=20, pady=10, command=lamda: button_click(9))
button0 = tk.button(window, text="0", padx=20, pady=10, command=lamda: button_click(0))
button_add = tk.button(window, text="+", padx=20, pady=10, command=button_add)
button_subtract = tk.button(window, text="-", padx=20, pady=10, command=button_subtract)
button_multiply = tk.button(window, text="*", padx=20, pady=10, command=button_multiply)
button_divide = tk.button(window, text="/", padx=20, pady=10, command=button_divide)
button_clear = tk.button(window, text="Clear", padx=20, pady=10, command=button_clear)
button_equal = tk.button(window, text="=", padx=20, pady=10, command=button_equal)
