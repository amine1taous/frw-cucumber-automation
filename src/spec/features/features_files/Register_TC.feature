Feature: Je rempli le formulaire
  En tant qu utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @module_registration
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l application Mercury1
    When Je clique sur le bouton register
    When Je saisi un data dans le champs firstname "<firstname>"
    When je saisi un data dans le champs lastname "<lastname>"
		When Je saisi un data dans le champs phone "<phone>"
		When Je saisi un data dans le champs mail "<mail>"
		When Je saisi un data dans le champs adresse "<adresse>"
		When Je saisi un data dans le champs city "<city>"
		When Je saisi un data dans le champs state "<state>"
		When Je saisi un data dans le champs code postale "<code>"
		When Je saisi un data dans le champs country "<country>"
		When Je saisi un data dans le champs username pour registerTC "<username>"
		When Je saisi un data dans le champs password pour registerTC "<password>"
		When Je saisi un data dans le champs confirmpassword pour registerTC "<password>"
		When Je clique sur le bouton envoyer
		Then Je me redirige vers la page du register du registerTC "<message>"
		
		
		
    Examples: 
      | firstname | lastname | phone    | mail            | adresse |    city   |  state  | code | country | username | password |                                           message                                                    |
      | Amine     | Taous    | 55382390 | amine@gmail.com | boumhal | ben arous | boumhal | 2074 | TUNISIA |  amine   | amine123 | Thank you for registering. You may now sign-in using the user name and password you've just entered. | 
      | Ousse     | ousse    | 24753951 | ous12@gmail.com | ghazela | Ariana so | ghazela | 2045 | TUNISIA |  ousss   | ousss123 | Thank you for registering. You may now sign-in using the user name and password you've just entered. | 

