# PocKalkulatorWyborczyHtml
Prototyp kalkulatora wyborczego tworzony w technologiach webowych (HTML/CSS/JScript) z częścią serwerową w JEE.

## Kontakt
- Sebastian.Celejewski@wp.pl

## Funkcjonalność
- Wprowadzanie wyników wyborów prezydenckich do formularza elektronicznego
- Walidacja wyników wyborów prezydenckich
- Wysyłanie formularza w postaci elektronicznej na serwer
- Drukowanie formularza, a ściślej generowanie pliku PDF, który można wydrukować

## Serwery
- Serwer Continuous Integration (Jenkins): http://91.250.114.134:8080/ci-jenkins/
- Server webowy (Apache), na którym wystawiony jest frontend: http://52.4.122.192/
- Serwer aplikacyjny (JBoss), na którym wystawiony jest backend: http://52.1.164.93:8080/openpkw/
- Serwer Continuous Integration (GO CD): http://54.173.148.112/ (wyłączony, prawdopodobnie do skasowania)

## Oranizacja pracy
- Tablica z zadaniami: https://trello.com/b/1PocOld8/poc-wp
- Wszyscy developerzy mają pełny dostęp do repozytorium.
- Każdy deweloper prowadzi prace na swoim branchu.
- Co jakiś czas wszyscy deweloperzy spotykają się i omawiają propozycje zmian. Dyskusja może skończyć się mergem do mastera.

## Struktura projektu
- Frontend: aplikacja webowa (AngularJS).
- Backend: aplikacja Java EE

## Konfiguracja środowiska deweloperskiego
- Eclipse: Konfiguracja formattera: https://raw.githubusercontent.com/openpkw/PocKalkulatorWyborczyHtml/master/doc/konfiguracja/code-conventions-eclipse.xml
- Eclipse: Domyślne kodowanie: UTF-8 (Window/Preferences/General/Workspace/Text file encoding

## Informacje o projekcie OpenPKW
- Strona główna projektu: https://openpkw.pl/
- Grupa dyskusyjna: http://openpkw.pl/pipermail/lista/

## Atrakcyjna, zachęcająca grafika :-)

Wzór formularza dla wyborów prezydenckich w roku 2015.

![Wzór formularza](https://raw.githubusercontent.com/openpkw/PocKalkulatorWyborczyHtml/master/doc/images/formularz_wzor.png)

Wygląd prototypu formularza w HTML (work in progress)

![Wygląd prototypu formularza w HTML](https://raw.githubusercontent.com/openpkw/PocKalkulatorWyborczyHtml/master/doc/images/formularz_prototyp_html.png)
