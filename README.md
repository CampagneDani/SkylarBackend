# SkylarBackend
Backend of Skylar

Zugangsdaten der Datenbank einpflegen:
In der Datei „application.properties“ müssen die Zugangsdaten der Datenbank eingepflegt werden. 
-	Dabei muss bei „spring.datasource.url“ der Pfad zur Datenbank eingefügt werden. Beispiel. „jdbc:mysql://localhost:3306/skylardatabase“
-	Bei „spring.datasource.username“ muss der Datenbankbenutzer hinterlegt werden
-	Bei „spring.datasource.password“ muss das Password des Datenbankbenutzers hinterlegt werden
Die gleichen Zugangsdaten müssen zusätzlich noch in der Datei „DBFunction.java“ in den Strings url, user und password hinterlegt werden. 

Backend starten:
Nachdem diese Zugangsdaten eingepflegt wurden, kann das Backend durch Ausführen der Main-Methode in der Klasse „BackEndSkylarApplication“ gestartet werden.
