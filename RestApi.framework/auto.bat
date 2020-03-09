set ProjectPath=C:\Users\ChitracheduSyedBasha\eclipse-workspace\RestApi.framework
cd %ProjectPath%
set classpath=%projectPath%\bin;%ProjectPath%\lib\*
java org.testng.TestNG %ProjectPath%\testng.xml
pause