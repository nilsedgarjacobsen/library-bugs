# Bibliotekssystem - OOP Bugghunt 🐛

Detta projekt innehåller flera OOP-fel. Koden kompilerar och körs, men bryter mot OOP-principer eller kan ge runtime-problem.

## Er uppgift

1. **Klona projektet** från GitHub
2. **Hitta och dokumentera** alla OOP-fel ni hittar
3. **Fixa felen** enligt OOP best practices
4. **Testa** att programmet fungerar korrekt efter era fixar

## Ledtrådar - Vad ni ska titta på

### 🔒 Inkapsling
- [ ] Är alla fields lämpligt skyddade?
- [ ] Kan man ändra objekts tillstånd på olämpliga sätt utifrån?
- [ ] Finns det validering av input i setters?
- [ ] Kan man komma åt och modifiera interna datastrukturer direkt?
- [ ] Är static variabler skyddade?

**Testa:** Försök ändra `book1.pages = -100;` direkt i Main. Vad händer?

### 🏛️ Arv & Polymorfism
- [ ] Överskrider subklasser metoder korrekt?
- [ ] Används polymorfism där det behövs?
- [ ] Finns det inkonsistens mellan superclass och subclass beteende?

**Testa:** Jämför hur `displayInfo()` fungerar för Book vs EBook. Något konstigt?

### ⚠️ Runtime-säkerhet
- [ ] Kan programmet krascha med ArrayIndexOutOfBoundsException?
- [ ] Finns det risk för NullPointerException?
- [ ] Kan samma resurs användas två gånger felaktigt?

**Testa:** Försök lägga till 11 böcker i Library. Vad händer?
**Testa:** Försök låna samma bok två gånger. Vad borde hända vs vad som händer?

### 🎯 Logik & Affärsregler
- [ ] Kan en medlem låna fler böcker än vad `getMaxBooks()` säger?
- [ ] Implementeras `getMaxBooks()` gränsen någonstans?
- [ ] Kan en bok vara utlånad till flera personer samtidigt?
- [ ] Kollar systemet om en bok redan är utlånad?

**Testa:** Låt en Member låna 5 böcker. Borde det fungera?

### 🔗 Coupling & Design
- [ ] Är klasserna för tätt kopplade till varandra?
- [ ] Vet klasser för mycket om varandras interna tillstånd?
- [ ] Finns det bättre sätt att organisera ansvarsområden?

## Antal fel att hitta

Det finns **minst 10-12 OOP-problem** i koden. Några är allvarliga runtime-buggar, andra är designproblem som bryter mot OOP-principer.

## Tips

- Kör programmet först och se vad som händer
- Läs koden noggrant - inte alla fel syns när man kör programmet
- Tänk på vad som kan gå fel, inte bara vad som går fel just nu
- Diskutera med er grupp: "Varför är detta ett problem?"

## När ni är klara

Diskutera:
1. Vilket var det allvarligaste felet?
2. Vilket fel var svårast att hitta?
3. Hur skulle ni designat systemet från början?

Lycka till! 🚀