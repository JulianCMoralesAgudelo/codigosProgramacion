ECHO #### ACTIVATE Windows ####

cscript c:\windows\system32\slmgr.vbs -ato  
Echo Did it report if Windows is active,
echo Enter 'y' for activated , or 'n' to attempt to
Echo view the Win 8 Key (if win 7 look under PC)


SET ACT=
SET /P ACT=Did it say windows was activated? y or n :

IF /I '%ACT%'=='y' GOTO EOF
IF /I '%ACT%'=='Y' GOTO EOF
IF /I '%ACT%'=='n' GOTO winactivate
IF /I '%ACT%'=='N' GOTO winactivate
else goto WINACTIVE
:winactivate
cls

\\SERVER\SHAREFOLDER\tools\getwin8key\getwin8key.exe > \\SERVER\SHAREFOLDER\misc\win8keys\%computername%_win8key.txt 

start "" cmd /c notepad "\\SERVER\SHAREFOLDER\misc\win8keys\%computername%_win8key.txt" > nul

SET KEY=
SET /P KEY=Paste or type Win Key:
start runas /user:%computername%\administrator "cscript //b c:\windows\system32\slmgr.vbs -ipk %KEY%"
timeout /t 5
start runas /user:%computername%\administrator "cscript //b c:\windows\system32\slmgr.vbs /ato"
REM Echo Press Spacebar once verified Windows is Activated.  If in question then manually activate windows 
timeout /t 5

goto WINACTIVE
pause
:EOF
color A1
cls
Echo Good job Win active

exit

##############
