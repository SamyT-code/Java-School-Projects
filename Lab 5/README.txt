Nom étudiant : Samy Touabi
Numéro étudiant : 300184721
Code de cours : ITI1521
Section Lab : A02

Brève description du contenu:

Ceci est le lab 5

NOTE: Pour la méthode toString() de la classe FullTime, il est demandé de faire
	"une méthode toString qui doit afficher le nombre d’heures travaillés par
	semaine, le tarif horaire et le pourcentage pour les heures supplémentaires."

	Cependant, il n'y a pas ces attributs appartiennent aux employés de contrat
	(la personne qui a écrit le lab a dû faire une erreur) J'ai donc cimplement spécifié 
	que cette personne est un employé de contract. Sinon, jaurais pus faire:

	public String toString(){
		return super.toString() + " (employee permanent. " + pay + 
		" $ de paye, " + turnover + "$ de turnover, " + percentTurnover + 
		"% par de Turnover)";
	}