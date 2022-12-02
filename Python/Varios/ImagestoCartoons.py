""" 
https://www.askpython.com/python/examples/images-into-cartoons

1. Importing modules

The first step in every program is importing all the necessary modules(if any) into our file. 
For this problem we will be importing three modules namely the openCV, numpy and matplotlib module.

"""

import cv2
import numpy as np
import matplotlib.pyplot as plt

""" 
2. Loading and plotting the original image
The next step is to read the image using the imread function and then convert it to RGB format with the help of the cvtColor function. 
We then plot the image using the imshow function. The code for the same is shown below: 
"""

img = cv2.imread("FotoDoc.png")
img = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
plt.figure(figsize=(10, 10))
plt.imshow(img)
plt.axis("off")
plt.title("Original Image")
plt.show()

""" 

3. Converting Image to GrayScale

The next step in the process is to convert the image into a grayscale format using the cvtColor function. 
The reason behind doing so is that it simplifies the process and helps in the time complexity of the program later on.
The code to achieve the same is shown below. 

"""
gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
gray = cv2.medianBlur(gray, 5)
plt.figure(figsize=(10, 10))
plt.imshow(gray, cmap="gray")
plt.axis("off")
plt.title("Grayscale Image")
plt.show()

""" 

4. Getting edged image

To make things simpler for us, we will get an edged image of the grayscale image and then apply the convolutional network to the image.
The same is done by using the adaptiveThreshold and setting the required parameters to get the edged image. The code for the same is displayed below. 

"""

edges = cv2.adaptiveThreshold(
    gray, 255, cv2.ADAPTIVE_THRESH_MEAN_C, cv2.THRESH_BINARY, 9, 9)
plt.figure(figsize=(10, 10))
plt.imshow(edges, cmap="gray")
plt.axis("off")
plt.title("Edged Image")
plt.show()


""" 
5. Turning Images into Cartoons

The final step is to apply the convolutional filter using the bilateralFilter function. We then make use of the bitwise operation and pass the original image and the edged image to turn images into cartoons.

The code for the same is shown below.

"""

color = cv2.bilateralFilter(img, 9, 250, 250)
cartoon = cv2.bitwise_and(color, color, mask=edges)
plt.figure(figsize=(10,10))
plt.imshow(cartoon,cmap="gray")
plt.axis("off")
plt.title("Cartoon Image")
plt.show()