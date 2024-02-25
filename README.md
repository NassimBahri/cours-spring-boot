# Cours Spring Boot

Ce Répertoire contient le code source des applications développées dans le cadre du cours *Projet Framework JEE* enseigné à l'[Université Libre de Tunis (ULT)](https://www.ult-tunisie.com). Le cours Spring Boot se concentre sur l'apprentissage de la création d'applications basées sur des microservices.

## Responsable du module

* [Nassim Bahri](https://www.nassimbahri.ovh) - Enseignant du cours/TD

## Prérequis

Il faut installer les outils suivants sur votre machine :

* [Java 17](https://www.oracle.com/java/technologies/downloads/#java17)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/)
* Pour la création des applications dynamiques, il faut installer un SGDB + interface d'administration. Vous pouvez donc installer l'un des logiciels suivants (MySQL et PHPMyAdmin): [WampServer](https://www.wampserver.com/en/) | [Laragon](https://laragon.org/) | [XAMPP](https://www.apachefriends.org/)
* [Postman](https://www.postman.com/)

## Structure de ce répertoire

* [HelloWorld](HelloWorld) : Initiation aux concepts clés de Spring Boot notamment (IoC, Dependency Injection, Bean et Component).
* [students](students) : Application Spring Boot permettant de gérer (opérations CRUD) une liste des étudiants. Dans ce projet, nous utilisons la classe ``ArrayList`` de Java pour stocker les étudiants (In-memory database).

## License

Ce projet est sous licence [Apache 2.0](https://choosealicense.com/licenses/apache-2.0/). 