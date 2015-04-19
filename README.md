# Uwaga

Projekt PocKalkulatorWyborczyHtml zostal rozbity na dwa projekty:
- openpkw-kalkulator-obwodowy-web
- openpkw-dokument-generator

Prosimy nie wrzucać już żadnych zmian do tego projektu. Wkrótce zostanie on usuniety.

# PocKalkulatorWyborczyHtml
Prototyp kalkulatora wyborczego tworzony w technologiach webowych (HTML/CSS/JScript) z częścią serwerową w JEE. Tworzony w celu usprawnienia komunikacji programistów z analitykami - weryfikacji koncepcji, założeń, możliwości technologicznych, interfejsu użytkownika itp.

## Jak dołączyć?
- Zapoznaj się z kodem źródłowym. Zwróć uwagę nie tylko na branch master, ale także na pozostałe niedawno modyfikowane branche.
- Zapoznaj się z notatkami ze [spotkań analitycznych](https://github.com/openpkw/openpkw/blob/master/Protokoly%20spotkan.md) oraz z notatkami ze [spotkań zespołu deweloperskiego](https://github.com/openpkw/PocKalkulatorWyborczyHtml/blob/master/Protokoly_spotkan.md) i dowiedz się jakie mamy priorytety na najbliższe dni.
- Zapoznaj się z [listą zadań](https://trello.com/b/1PocOld8/poc-wp) na Trello.
- Jeśli masz uwagi dotyczące aplikacji, jej architektury, kodu, funkcjonalności itd. - utwórz Issue w GitHubie. 
- Utwórz swojego forka, wprowadź swoje zmiany i wyślij nam pull request.
- Jeśli możesz regularnie poświęcić trochę czasu na pomoc w rozwijaniu OpenPKW, gorąco zapraszamy! Skontaktuj się z nami, aby uzyskać pełny dostęp do repozytorium kodu. Chętnie przekażemy Ci odpowiedzialność za rozwijanie konkretnych części aplikacji, konkretnych funkcjonalności, bądź konkretnych aspektów procesu deweloperskiego (bezpieczeństwo, testowanie, continuous delivery itd.).
- Kontakt:
  - Rafał Reguła: <Rafal.Regula@openpkw.pl>
  - Sebastian Celejewski: <Sebastian.Celejewski@wp.pl>

## Funkcjonalność
### Wersja 0.1 (bieżąca)
- [KW-U-1](http://trello.com/c/wHH5FeuB) Wprowadzanie i walidacja wyników wyborów prezydenckich w formularzu elektronicznym
- [KW-U-2](https://trello.com/c/3nQc4SMi) Generowanie protokołu w postaci pliku PDF
- [KW-U-3](https://trello.com/c/LzikRQvG) Wysyłanie protokołu w postaci elektronicznej na serwer

### Wersja 0.2 (przyszła)
- [KW-U-4](https://trello.com/c/xXDZeLrq) Sporządzanie raportu błędów.
- [KW-U-5](https://trello.com/c/cOlQ97Vi) Sporządzanie listy uwag i adnotacji.
- [KW-U-6](https://trello.com/c/I4WIjpR9) Zabezpieczanie protokołu certyfikatem.

## Serwery
- Serwer Continuous Integration (Jenkins): http://91.250.114.134:8080/ci-jenkins/
- Server webowy (Apache), na którym wystawiony jest frontend: http://52.4.122.192/
- Serwer aplikacyjny (JBoss), na którym wystawiony jest backend: http://52.1.164.93:8080/openpkw/

Szczegółowe informacje o konfiguracji serwerów: https://github.com/openpkw/PocKalkulatorWyborczyHtml/raw/master/doc/ports_and_protocols.pdf

## Oranizacja pracy
- Tablica z zadaniami: https://trello.com/b/1PocOld8/poc-wp
- Wszyscy developerzy mają pełny dostęp do repozytorium.
- Każdy feature implementowany jest na branchu. Przed mergem do mastera deweloperzy spotykają się i omawiają propozycje zmian.
- To nie jest kod produkcyjny, tylko prototyp, który trzeba szybko wyhackować, a potem pójdzie do kosza, więc spokojnie ze wzorcami projektowymi, nazewnictwem i cyzelowaniem szczegółów.

## Struktura projektu
- Frontend: aplikacja webowa (AngularJS).
- Backend: aplikacja Java EE

## Konfiguracja środowiska deweloperskiego
- Eclipse: Konfiguracja formattera: https://raw.githubusercontent.com/openpkw/PocKalkulatorWyborczyHtml/master/doc/konfiguracja/code-conventions-eclipse.xml
- Eclipse: Domyślne kodowanie: UTF-8 (Window/Preferences/General/Workspace/Text file encoding

## Budowanie i deployment aplikacji
### Frontend
W katalogu src/frontend:

```npm install``` - instaluje wszystkie zależności wymagane w projekcie<br/>
```npm run build``` - buduje wersję produkcyjną aplikacji<br/>
```npm run server-dev``` - serwer deweloperski (http://localhost:9000)
```npm run deploy``` - wysyła aplikację na serwer webowy w środowisku OpenPKW-DEV

### Backend
W katalogu src/backend:

```mvn clean package``` - buduje backend<br/>
```mvn jboss-as:deploy -Dopenpkw-env:local``` - wysyła aplikację na lokalny serwer aplikacyjny (JBoss)<br/>
```mvn jboss-as:deploy -Dopenpkw-env:dev``` - wysyła aplikację na serwer aplikacyjny (JBoss) w środowisku OpenPKW-DEV 

## Informacje o projekcie OpenPKW
- Strona główna projektu: https://openpkw.pl/
- Grupa dyskusyjna: http://openpkw.pl/pipermail/lista/

## Atrakcyjna, zachęcająca grafika :-)

Wzór formularza dla wyborów prezydenckich w roku 2015.

![Wzór formularza](https://raw.githubusercontent.com/openpkw/PocKalkulatorWyborczyHtml/master/doc/images/formularz_wzor.png)

Wygląd prototypu formularza w HTML (work in progress)

![Wygląd prototypu formularza w HTML](https://raw.githubusercontent.com/openpkw/PocKalkulatorWyborczyHtml/master/doc/images/formularz_prototyp_html.png)
