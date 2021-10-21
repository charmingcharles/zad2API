# zad2API

## Zwracanie przekazanego tekstu
Jeśli przekażemy naszemu API jakiś tekst i odwołamy się do tego adresu to dostaniemy jako zwrotną odpowiedź
tekst który przekazaliśmy:
```
http://localhost:8080/itself?text=Karol
```
przykładowa zwracana wartość:
```
Karol
```
Zwracane pola:
text - oryginalny tekst


Jeśli przekażemy naszemu API jakiś tekst i odwołamy się do tego adresu to dostaniemy jako zwrotną odpowiedź
tekst który przekazaliśmy ale tym razem w postaci JSON-a:
```
http://localhost:8080/jsonitself?text=Karol
```
Przykładowa zwracana wartość:
```
{"text":"Karol"}
```
Zwracane pola:
text - oryginalny tekst


Jeśli przekażemy naszemu API jakiś tekst i odwołamy się do tego adresu to dostaniemy jako zwrotną odpowiedź
tekst który przekazaliśmy ale tym razem w postaci JSON-a i z dodatkowymi informacjami na jego temat:
```
http://localhost:8080/count?text=Karol
```
Przykładowa zwracana wartość:
```
{"lowercase-count":"4","special-signs-count":"0","numbers-count":"0","uppercase-count":"1","length":"5","original-text":"Karol"}
```
Zwracane pola:
original-text - oryginalny tekst
length - długość tekstu
lowercase-count - zliczenie ilości wystąpień małej litery
uppercase-count - zliczenie ilości wystąpień wielkiej litery
special-signs-count - zliczenie ilości wystąpień znaków specjalnych
numbers-count - zliczenie ilości wystąpień cyfr