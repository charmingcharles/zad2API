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

Jeśli przekażemy naszemu API jakiś tekst i odwołamy się do tego adresu to dostaniemy jako zwrotną odpowiedź
tekst który przekazaliśmy ale tym razem w postaci JSON-a:
```
http://localhost:8080/jsonitself?text=Karol
```
Przykładowa zwracana wartość:
```
{"text":"Karol"}
```
