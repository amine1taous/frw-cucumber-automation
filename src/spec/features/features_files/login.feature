Feature: Je vérifie la page d'authentification
  En tant qu'utilisateur, je souhaite me connecter sur le site Mercury.

  @connexion
  Scenario: Je vérifie la page d'authentification
    Given Je me connecte sur l'application Mercury
    When Je saisis le user name pour authentification "test"
    And Je saisis le password pour authentification "test"
    And Je clique sur le bouton submit
    Then Je me redirige vers la page home "Login Successfully"
