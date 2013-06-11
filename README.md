Plane
=====

Solution pour le Coding challenge : maman les petits avions

Voir le lien : http://thecodersbreakfast.net/index.php?post/2013/02/18/Coding-challenge-maman-les-petits-avions

Aujourd'hui, je vous propose de jouer aux petits avions, et de vérifier quel prototype vole le mieux.

Pour les départager, nous allons nous appuyer sur la Suite de Syracuse :
En partant d'un nombre initial (entier positif), pour obtenir le suivant :

* s’il est pair, on le divise par 2 ;
* s’il est impair, on le multiplie par 3 et on ajoute 1.

On répète l'opération jusqu'à obtenir le nombre 1 (la suite est convergente).

On définit ensuite les termes suivants :

* le temps de vol total : c'est la longueur de la séquence obtenue.
* le temps de vol en altitude : c'est la période continue, à partir du décollage, pendant laquelle l'avion reste à une altitude supérieure ou égale à l'altitude initiale (voir exemple ci-dessous).
* l'altitude maximale : c'est la valeur maximale de la séquence.

Prenons l'exemple du nombre initial 15.

* Sa séquence est [15, 46, 23, 70, 35, 106, 53, 160, 80, 40, 20, 10, 5, 16, 8, 4, 2, 1]
* Son temps de vol total est de 18
* Son temps de vol en altitude est de 11 ([15, 46, 23, 70, 35, 106, 53, 160, 80, 40, 20] = 11 éléments)
* Son altitude maximale est de 160

Voyons maintenant comment tester nos différents prototypes d'avions.
Chaque prototype a évidemment un nom de code top secret, comme "Enterprise" ou "FauconMillenium". En additionnant les valeurs des lettres qui composent leurs noms, nous sommes capables de déterminer leur nombre initial.
Ainsi : "Enterprise" vaut 1057, et "FauconMillenium" vaut 1544.

Je vous laisse calculer quel modèle vole le mieux, et inventer vos propres prototypes !

Idéalement, il suffirait d'appeler une méthode en lui passant le nom du prototype, pour calculer (et éventuellement afficher) les trois indicateurs.
(Tous les langages bienvenus, utilisez Gist, Pastebin ou autre si votre code est volumineux)

