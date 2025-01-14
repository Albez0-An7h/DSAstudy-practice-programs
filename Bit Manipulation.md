# Bit Manipulation

---

# Left Shift operator (<<):

- It shifts the binary number by the given number.
```md
10 >> 1
1010 >> 1
1010__ All the numbers shifted to the left, so we need an extra number.
-Thats we just place 0 whenever we need an extra number

10100 = 20
```

- Hence, if we ever left shift any number by 1, it doubles it.
- a << 1  = 2a

- if a << b = 2$^b$ x a

# Right shift operator (>>):

- Opposite of left shift
  0011001 >> 1 = 001100
  ignored the last digit.

- It divides the number by 2.
- a << 1 = a / 2
- a << b = a / 2$^b$
---
# Mask

It is an separate entity that allows us to get our answer related to it
- To make a mask we just 1 << (i-1).
- Here i is the position of the bit we want to find
---
# Get the i$^t$$^h$ bit.

Just & the number with its mask.

---
# Set the i$^t$$^h$ bit

- Means set the bit to 1.
- just or it with the mask.
---
# Clear bit

- make the bit zero.
- & with the complement(~) of bit mask.
---
# update bit

- change the bit.
