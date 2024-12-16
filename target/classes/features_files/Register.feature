Feature: Je vérifie la page d enregistrement
  En tant que utilisateur je souhaite m enregistrer sur le site Mercury

  @register
  Scenario: Je vérifie la page d authentification
    Given Je me connecte sur l application Mercury1
    And Je clique sur le bouton register
    When Je saisis le first name "Amine"
    And Je saisis le last name "Taous" 
    And Je saisis le phone "55382390"
    And Je saisis le email "aminetaous2@gmail.com"
    And Je saisis le adresse "boumhal"
    And Je saisis le city "ben arous"
    And Je saisis le state "Boumhal"
    And Je saisis le code postale "2074"
    And Je saisis le country "TUNISIA"
    And Je saisis le user name pour enregistrement "amine"
    And Je saisis le password "amine123"
    And Je saisis le confirmpassword "amine123"
    And Je clique sur le bouton envoyer
    Then Je me redirige vers la page du register "Thank you for registering. You may now sign-in using the user name and password you've just entered."
