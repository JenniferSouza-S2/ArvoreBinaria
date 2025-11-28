## Projeto de Árvore Binária de Busca 

Este projeto implementa três cenários de uma Árvore Binária de Busca para análise de:
- Altura da árvore
- Total de nós
- Total de folhas
- Percursos: Em-ordem, Pré-ordem, Pós-ordem e Por níveis

---

## Como compilar e executar

No terminal, dentro da pasta do projeto:

```bash
javac *.java
java Main


## Saída do Terminal

==========================================================
Cenário A — Degenerada à Direita
==========================================================
Valores inseridos: 10 20 30 40 50 60 70 

Altura da árvore: 7
Total de nós: 7
Total de folhas: 1

Em-ordem:  10 20 30 40 50 60 70
Pré-ordem: 10 20 30 40 50 60 70
Pós-ordem: 70 60 50 40 30 20 10

Por níveis:
Nível 1: 10 
Nível 2: 20 
Nível 3: 30 
Nível 4: 40 
Nível 5: 50 
Nível 6: 60 
Nível 7: 70 
==========================================================

==========================================================
Cenário B — Degenerada à Esquerda
==========================================================
Valores inseridos: 70 60 50 40 30 20 10 

Altura da árvore: 7
Total de nós: 7
Total de folhas: 1

Em-ordem:  10 20 30 40 50 60 70
Pré-ordem: 70 60 50 40 30 20 10
Pós-ordem: 10 20 30 40 50 60 70

Por níveis:
Nível 1: 70 
Nível 2: 60 
Nível 3: 50 
Nível 4: 40 
Nível 5: 30 
Nível 6: 20 
Nível 7: 10 
==========================================================

==========================================================
Cenário C — Quase Balanceada com Ramo Profundo
==========================================================
Valores inseridos: 50 30 70 20 40 60 80 10 25 35 45 55 65 75 85 90 95 97 98 99 

Altura da árvore: 9
Total de nós: 20
Total de folhas: 8

Em-ordem:  10 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 97 98 99
Pré-ordem: 50 30 20 10 25 40 35 45 70 60 55 65 80 75 85 90 95 97 98 99
Pós-ordem: 10 25 20 35 45 40 30 55 65 60 75 99 98 97 95 90 85 80 70 50

Por níveis:
Nível 1: 50 
Nível 2: 30 70 
Nível 3: 20 40 60 80 
Nível 4: 10 25 35 45 55 65 75 85 
Nível 5: 90 
Nível 6: 95 
Nível 7: 97 
Nível 8: 98 
Nível 9: 99 
==========================================================
