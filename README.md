# Zsivány juhász feladat

Legyen három osztályunk: Shepherd, Herd, Dog.

### Herd osztály
A nyájnak legyen három módosítható tulajdonsága:
1. bárányok száma
2. őrzött-e a nyáj
3. jól tápláltak-e a bárányok
Legyen egy konstruktor ami a bárányok számát várja és a nyájt őrizetlenre és éhezőre állítja.

### Dog osztály
A kutyának van:
1. neve
2. gazdája
3. őrzött nyája
4. energiája

A kutya dolga a gazdája nyájának őrzése.
A konstruktor egy nevet és energiát vár.

### Shepherd osztály
A juhásznak legyen:
1. neve
2. nyája
3. esetleg kutyája

Legyen két konstruktor:
1. egyikben a név és nyáj adott
2. másikban csak a név, és egy 0 méretű nyájat rendel a juhászhoz.

### Első feladat
Hozzunk létre a nyájhoz egy metódust, ami 10 vagy 20 százalékkal növeli a nyáj méretét,
attól függően, hogy esznek-e rendesen.

### Második feladat
Egy másik metódussal a nyáj béget. Attól függően mekkora egy párszor.

### Harmadik feladat
Legyen a kutyának egy metódusa, amivel őriz egy nyájat, egyszerre csak egy nyájat tudjon őrizni.

### Negyedik feladat
A kutyák okos állatok. Tudnak bárányt számolni. Ilyenkor fáradtabbak lesznek, és ha teljesen kimerültek,
nem őrzik tovább a nyájat.

### Ötödik feladat
A juhásznak legyen egy metódusa, amivel kutyát tud örökbefogadni. Egy kutyának egy gazdája lehet, ha egy kutyát
örökbefogadnak a régi gazdinak nem lesz többé kutyája.
Kezdetben a kutya automatikusan őrzi a nyájat.

### Hatodik feladat
Tudjon a juhász főzni. Időnként(minden 3. alkalommal) a juhász egy bárányt főz meg,
feltéve, hogy van még elég bárány a nyájban.
