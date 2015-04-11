# Protokoły spotkań

## Aktualna lista TODO
- Zadania programistyczne są na [Trello](https://trello.com/b/1PocOld8/poc-wp).
- Sprawy organizacyjne
  - Kontakty mailowe do wszystkich są w OpenProject.
  - Kto nie ma konta w OpenProject, wysyła maila do Tomka z prośbą o dodanie.
  - Kontakty Skypowe są w dyskusji Skypowej.
  - Kto nie jest dodany do zespołu OpenPKW w GitHubie, przysyła Sebastianowi swoją nazwę konta z GitHuba i Sebastian go dodaje.
  - Kto nie jest dodany do tablicy OpenPKW w Trello, przysyła Sebastianowi swoją nazwę konta w Trello i Sebastian go dodaje.
- Sebastian i Tomek - uporządkowanie infrastruktury
  - Przeinstalowanie systemu operacyjnego na serwerze Dobromir.
  - Skonfigurowanie od nowa Continuous Delivery.
  - Skonfigurowanie środowiska IT (integration tests).
  - Skonfigurowanie środowiska UAT (testy ręczne).
  - Skonfigurowanie środowiska produkcyjnego (EXT? PROD?).

## 10 kwietnia 2015, Skype, 1h
Obecni: Sebastian Celejewski, Rafał Reguła, Krzysztof Miksa, Kacper Jasiński, Marcin Tokarski, Tomasz Woźniak, Wojciech Szóstak, Marcin Marzec, Adam Nakoneczny

Tematyka:
- Przywitanie nowych osób.
- Bieżąca sytuacja w projekcie OpenPKW.
- Relacja pomiędzy projektami OPW i OpenPKW. Są to dwa osobne projekty. OpenPKW tworzy oprogramowanie dla PKW, do wykorzystania przez członków komisji wyborczych, zgodne ze wszystkimi przepisami, wytycznymi, praktykami komisji wyborczych. OPW natomiast tworzy oprogramowanie do niezależnego od PKW weryfikowania wyników wyborych, wykorzystywane przez wolontariuszy, którzy będą wprowadzać publicznie dostępne protokoły wyborcze do systemu. Zespoły OpenPKW i OPW są w większej części wspólne, tj. osoby tworzące OpenPKW tworzą również OPW. Uwspólnienie dotyczy także infrastruktury, tj. OpenPKW wykorzystuje serwery OPW.
- Omówienie statusu kodu w repozytorium PocKalkulatorWyborczyHtml. Jest to prototyp, w którym ćwiczymy funkcjonalność, natomiast na razie pomijamy sprawy takie, jak bezpieczeństwo, wydajność itd.
- Omówienie ostatnich zmian w kodzie (niewiele, głównie uporządkowanie backendu).
- Omówienie obecnej i przyszłej technologii Kalkulatora OpenPKW. Obecnie: AngularJS na frontend i Java EE na backend.
- Omówienie funkcjonalności, która jest do zaimplementowania w najbliższej przyszłości:
  - Wprowadzanie danych i walidacja.
  - Generowanie pliku PDF.
  - Eksport danych na serwer.
- Omówienie metody wspólnej pracy.
  - Każda funkcja systemu rozwijana będzie na swoim branchu. Po ukończeniu danej funkcjonalności lub jakiegoś jej skończonego zakresu robimy merge do brancha master.
  - Zmiany wprowadzamy na swoich forkach i wysyłamy pull requesty. Pull request będzie zweryfikowany przez innych członków drużyny i wtedy będzie wmergowany do brancha danej funkcji.
  - Będziemy tworzyć osobne branche lub taki dla wydań systemu.
- Omówienie konwencji programistycznych.
   - https://github.com/johnpapa/angular-styleguide
   - http://jscs.info/
   - Od razu wprowadzamy testy.

## 27 marca 2015, Skype, 1.5h
Obecni: Sebastian Celejewski, Adam Kowalewski, Dawid Kulesza, Marcin Tokarski, Kamil Kowalski, Kacper Jasiński

Tematyka:
- Frontent Kalkulatora OpenPKW - budowanie, deployment
- Continuous Integration dla frontendu - potrzebny administrator Apache
- Jak generować PDFy? Ze względu na spory rozmiar czcionek porzucamy na razie pomysł generowania PDFu po stronie front-endu.
- Czyli: pozostaje backend w Javie.
- Dalsze kroki: uporządkowanie kodu frontendu, przerobienie wszystkiego na Angulara, potem dopiero robienie walidacji, generowania XMLa i generowania PDFa.

## 23 marca 2015, Skype, 2h
Obecni: Sebastian Celejewski, Adam Kowalewski, Dennis Gabriel Kruk, Adam Brzozowski, Kacper Jasiński, Dawid Kulesza, Adam Nakoneczny

Tematyka:
Spotkanie wprowadzające
- Krótka historia OpenPKW
- Co się obecnie dzieje (prace analityczne, deweloperskie, administracyjne i organizacyjne).
- Specyfika pracy (zespół się formuje, ustalamy zasady, porządkujemy dokumentację itp.)
- Who is who w projekcie
- Plan działania (pierwszy etap: Kalkulator OpenPKW).
- Kalkulator OpenPKW (funkcjonalność, technologia, deploymenty, plany itp.).
- Zaproszenie na spotkanie w środę.

Zadania na najbliższy czas:
- Przerobienie prototypu HTML z aplikacji JavaEE na aplikację webową (zaczął to już Marcin Tokarski).
- Zaimplementowanie brakującej funkcjonalności (lista zadań jest w Trello: https://trello.com/b/1PocOld8/poc-wp)
- Skonfigurowanie continuous delivery dla nowej aplikacji webowej.
