1 Generowanie podzbiorów


Algorytm wypisujący wszystkie podzbiory zbioru {1,...,n}: 
- Pierwszy podzbiór: ∅.
- by uzyskać następny po A podzbiór:
  - Wskazujemy na największy element nie nalezący do A, czyli a = max{i ∈/ A}
  - Jeżeli takiego a nie ma, to koniec algorytmu, zbiór A jest ostatnim podzbiorem.
  - W przeciwnym przypadku dodajemy a do A i usuwamy z A wszystkie elemenety większe od a.
      
Dla n = 3 powyższy algorytm wypisze po kolei nastęujące zbiory: ∅ {3}, {2}, {2,3}, {1}, {1,3}, {1,2}, {1, 2, 3}.
    