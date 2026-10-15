## Activité 1-2 : Service de multiplication TCP

### Objectif
Étendre l'application Client/Serveur TCP pour permettre au serveur de multiplier un entier envoyé par le client par 5.

### Fonctionnement
1. Le client saisit un entier au clavier.
2. Le client envoie cet entier au serveur.
3. Le serveur reçoit l'entier et calcule le produit `x * 5`.
4. Le serveur envoie le résultat au client.
5. Le client reçoit et affiche le résultat.
6. La communication continue jusqu'à ce que le client saisisse `0`. Dans ce cas, les sockets sont fermées proprement.

### Tests effectués
- `x = 2` → résultat = `10`
- `x = -3` → résultat = `-15`
- `x = 4` → résultat = `20`
- `x = 0` → arrêt de la communication

### Captures d'écran

#### Exécution du serveur
![Serveur](captures/server_tp2.png)

#### Exécution du client
![Client](captures/client_tp2.png)

#### Test de multiplication
![Test de calcul](captures/test_calcul.png)### Exécution du serveur
![Serveur](captures/server_tp2.png)

### Exécution du client
![Client](captures/client_tp2.png)

### Test de multiplication
![Test de calcul](captures/test_calcul.png)# TP1 - Les sockets TCP

## Informations générales
- Faculté : Faculté des Sciences de Sfax
- Année universitaire : 2026-2027
- Matière : Développement d'applications réparties
- Activité : Première connexion Client/Serveur

## 1. Objectif
L'objectif de ce TP est de réaliser une connexion entre un client et un serveur en Java avec les sockets TCP.

## 2. Environnement
- Eclipse IDE
- Java JDK
- Git
- GitHub

## 3. Création du serveur
Le serveur utilise ServerSocket sur le port 5000 et attend la connexion d'un client.

## 4. Création du client
Le client utilise Socket pour se connecter au serveur sur le port 5000.

## 5. Résultats
Le serveur affiche un message lorsqu'il attend un client, puis confirme la connexion.
Le client affiche un message avant et après sa connexion.

## 6. Test avec une adresse IP
Le client sera testé avec l'adresse 127.0.0.1.

## 7. Conclusion
Ce TP permet de comprendre la connexion client/serveur avec les sockets TCP en Java.
## Captures d'écran

### Console du serveur
![Console du serveur](captures/serveur.png)

### Console du client
![Console du client](captures/client.png)
