# Projet : Suivi des Variations de Prix

## Introduction

Ce projet modélise la surveillance des variations de prix d'un article par un ensemble d'acteurs, tels que les consommateurs et les organismes de contrôle. Chaque acteur fixe un seuil de prix déclenchant une action spécifique.

## Patron de Conception Choisi

Le patron de conception Observer est choisi pour permettre aux acteurs de suivre les changements de prix de l'article de manière efficace.

## Classes Principales

### Article

La classe Article représente l'article suivi, avec des méthodes pour augmenter (`plusCher()`) ou diminuer (`moinsCher()`) son prix.

### Acteur

La classe Acteur modélise les personnes ou entités suivant l'évolution des prix. Chaque acteur a un seuil défini, au-dessus ou en dessous duquel une action est déclenchée.

### Communication entre Acteurs et Articles

L'interface Observer et la classe Observable de Java sont utilisées pour permettre aux acteurs d'être informés des variations de prix de l'article.

### Classe ArticleRun

La classe ArticleRun contient la méthode main(...) qui initialise un article, trois acteurs, et simule des variations aléatoires du prix de l'article toutes les 3 secondes.

## Spécialisation des Acteurs

Les Consommateurs déclenchent des demandes d'achat lorsque le prix passe en dessous d'un seuil, tandis que les Organismes de surveillance déclenchent des alertes en cas de variations critiques basées sur des accords de branche.

## Intérêt d'Utiliser les Classes de Java

Observer et Observable de l'API Java simplifient la gestion des notifications entre acteurs et articles, offrant une solution robuste pour suivre les changements de prix.

## Licence

Indiquez ici la licence sous laquelle le projet est distribué.
