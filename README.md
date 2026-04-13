# Application Mobile : Compteur & Interaction Toast (Android)

##  Présentation du Projet
Ce projet est une application Android native développée en Java dans le cadre d'un TP de développement mobile. L'objectif est de manipuler les composants de base d'une interface utilisateur (UI) et de gérer les interactions événementielles simples.

L'application propose deux fonctionnalités principales :
* **Affichage d'une notification éphémère (Toast)** : En cliquant sur un bouton dédié, un message de confirmation s'affiche en bas de l'écran.
* **Gestion d'un état (Compteur)** : Un système d'incrémentation dynamique permettant de mettre à jour un `TextView` en temps réel.

##  Aperçu de l'Interface
<img width="444" height="893" alt="Screenshot 2026-03-22 175646" src="https://github.com/user-attachments/assets/08681926-5117-4be3-bb34-3a2298914901" />

*Interface moderne utilisant un `RelativeLayout` et des composants stylisés.*

##  Stack Technique
* **Langage :** Java
* **IDE :** Android Studio
* **Interface :** XML (Layouts personnalisés)
* **Compatibilité :** SDK 24+

## Structure du Code
Le projet repose sur une architecture simple mais robuste, mettant en œuvre la séparation entre la vue et la logique de contrôle :

### 1. Logique Java (`MainActivity.java`)
Le code est structuré de manière modulaire pour faciliter la lecture et la maintenance :
* **`initialiserInterface()`** : Centralise la liaison entre le code Java et les composants XML via `findViewById`.
* **Gestion des événements** : Utilisation de Listeners (`setOnClickListener`) pour déclencher les actions utilisateur.
* **Persistance temporaire** : Utilisation d'une variable d'instance `scoreActuel` pour maintenir l'état du compteur durant le cycle de vie de l'activité.

### 2. Design UI (`activity_main.xml`)
L'interface a été personnalisée pour offrir une meilleure expérience utilisateur (UX) :
* Utilisation d'un **Background personnalisé** (#F0F4F8).
* Boutons avec des **teintes de couleurs spécifiques** (`backgroundTint`) pour différencier les actions.
* Hiérarchie visuelle claire via des marges et des tailles de police adaptées.

##  Installation
1. Cloner le dépôt : 
   ```bash
   git clone [https://github.com/MAITO465/Lab1.git](https://github.com/MAITO465/Lab1.git)

2. Ouvrez le projet avec Android Studio.

3. Laissez Gradle synchroniser les dépendances.

4. Lancez l'application sur un émulateur ou un appareil physique via le bouton Run (Shift + F10).
