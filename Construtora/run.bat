@echo off
setlocal
cd /d "%~dp0"
if not exist out mkdir out
javac -encoding UTF-8 -d out src\app\Main.java src\app\telas\*.java
if errorlevel 1 (
  pause
  exit /b 1
)
java -cp out app.Main
