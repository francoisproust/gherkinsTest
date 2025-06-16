# gherkinsTest

L'objectif de ce projet est de fournir un exemple d'utilisation de Gherkins pour tester des fonctionnalités d'une application. Il s'agit d'un projet de démonstration qui illustre comment écrire des scénarios de test en utilisant le langage Gherkin et comment les exécuter avec un framework de test.

Pour ce faire, il se base sur plusieurs exemples de scénarios de test, chacun répondant à une problématique. Le but est qu'à chaque fin d'itération, les tests soient tous OK.

## Prérequis
    - java 17
    - maven 3.8.4

## TP

### Exercice 1

- Ajouter le test suivant:

```gherkin
    Given le nombre A a pour valeur 1
    And le nombre B a pour valeur 1
    When additionner A et B
    Then le résultat doit être égal à 2
```
- Implémenter le code Java nécessaire pour que ce test passe.

### Exercice 2
- Ajouter le test suivant:

```gherkin
    Given le nombre A a pour valeur 1
    And le nombre B a pour valeur 2
    When additionner A et B
    Then le résultat doit être égal à 3
```
- Lancer les tests et constater que le test échoue.
- Corriger le code Java pour que le test passe. (variabiliser les valeurs A et B)

### Exercice 3
- Ajouter le test suivant:

```gherkin
    Given le nombre A a pour valeur 2
    And le nombre B a pour valeur 2
    When additionner A et B
    Then le résultat doit être égal à 4
```
- Lancer les tests tout est OK.

### Exercice 4
- Ajouter le test suivant:

```gherkin
    Given le nombre A a pour valeur 5
    And le nombre B a pour valeur 2
    When soustraire le nombre A du nombre B
    Then le résultat doit être égal à 3
```
- Le dernier test échoue.
- Corriger le code Java pour que le test passe. (implémenter la soustraction)

### Exercice 5
- Ajouter le test suivant:

```gherkin
    Given le nombre A a pour valeur 5
    And le nombre B a pour valeur 2
    When réaliser une opération de type "addition" entre A et B
    Then le résultat doit être égal à 7
```
- refactorer le code pour utiliser un switch sur le type d'opération.