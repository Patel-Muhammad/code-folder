import pyautogui
import time

time.sleep(10)
count = 0 

while count <= 500:
    pyautogui.write("Good morningg vroo!!")
    pyautogui.press("enter")
    time.sleep(0.3)
    count =count+1

