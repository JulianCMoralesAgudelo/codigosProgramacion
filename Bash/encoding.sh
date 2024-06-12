#!/bin/bash
#https://www.tecmint.com/convert-files-to-utf-8-encoding-in-linux/
#enter input encoding here
FROM_ENCODING="iso-8859-1"
#output encoding(UTF-8)
TO_ENCODING="UTF-8"
#convert
CONVERT=" iconv  -f   $FROM_ENCODING  -t   $TO_ENCODING"
#loop to convert multiple files 
for  file  in  *.java; do
     $CONVERT   "$file"   -o  "${file%.java}.utf8.converted"
done
exit 0
