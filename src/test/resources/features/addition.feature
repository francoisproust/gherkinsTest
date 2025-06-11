Feature: addition

  Scenario: addition de deux nombres
    Given le nombre A a pour valeur 1
    And le nombre B a pour valeur 1
    When j'additionne le nombre A et le nombre B
    Then le résultat est de 2
