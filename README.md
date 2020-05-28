# Cairo Metro Stations (Breadth First Search)
#
This is a best path finder for Cairo Metro Stations implemented using the Breadth First Search (BFS) Algorithm.
#
#### It Consists of 4 Classes :
-  **Metro Station** : Used to describe a single station.
- **StationsUtil** : A util class that contatins methods to get Station names or Station neighbours.
- **TreeNode** : This is a wrapper class that holds stations while searching.
- **BreadthFirstSearch** : This is the class which contains the algorithm.
#
#### Each Metro Station is composed of three fields :
- **Station Name**
- **Srtation Code**
- **Neighbour Stations**
#
#### Inputs and Outputs
**The input** is basicly 2 integers representing the ***startStationCode*** and ***endStationCode***, All available codes are shown in tables below, if a wrong code is used a NullPointerException with message *"Wrong Station Code"* will be throwed.
**The Output** is a Stack of MetroStation class representing the path from the Start station to the End station, and the stack's size represents the number of stations in this path.
### Line One Stations
#
|     Station Name    | Station Code |
|:-------------------:|:------------:|
|     New El-Marg     | 130          |
|       El-Marg       | 131          |
|    Ezbet El-Nakhl   | 132          |
|      Ain Shams      | 133          |
|     El-Matareyya    | 134          |
| Helmeyet El-Zaitoun | 135          |
|  Hadayeq El-Zaitoun | 136          |
|    Saray El-Qobba   | 137          |
|  Hammamat El-Qobba  | 138          |
|    Kobri El-Qobba   | 139          |
|   Manshiet El Sadr  | 140          |
|     EL-Demerdash    | 141          |
|        Ghamra       | 142          |
|     Al-Shohadaa     | 143          |
|        Orabi        | 144          |
|        Nasser       | 145          |
|        Sadat        | 146          |
|    Saad Zaghloul    | 147          |
|   Al-Sayeda Zeinab  | 148          |
|  El-Malek El-Saleh  | 149          |
|      Mar Girgis     | 150          |
|      El-Zahraa      | 151          |
|     Dar El-Salam    | 152          |
|   Hadayek El-Maadi  | 153          |
|        Maadi        | 154          |
|   Sakanat El-Maadi  | 155          |
|    Tora El-Balad    | 156          |
|       Kozzika       | 157          |
|    Tora El-Asmant   | 158          |
|      El-Maasara     | 159          |
|    Hadayek Helwan   | 160          |
|       Wadi Hof      | 161          |
|  Helwan University  | 162          |
|      Ain Helwan     | 163          |
|        Helwan       | 164          |

### Line Two Stations
#
|    Station Name    | Station Code |
|:------------------:|:------------:|
|  Shubra El-Kheima  | 230          |
| Kolleyyet El-Zeraa | 231          |
|      Mezallat      | 232          |
|      Khalafawy     | 233          |
|     St. Teresa     | 234          |
|    Rod El-Farag    | 235          |
|       Masaraa      | 236          |
|     Al-Shohadaa    | 143          |
|       Attaba       | 238          |
|   Mohamed Naguib   | 239          |
|        Sadat       | 146          |
|        Opera       | 241          |
|        Dokki       | 242          |
|      El Bohoth     | 243          |
|  Cairo University  | 244          |
|       Faisal       | 245          |
|        Giza        | 246          |
|   Omm El-Masryeen  | 247          |
|    Sakiat Mekky    | 248          |
|      El-Mounib     | 249          |

### Line Three Stations
#
|   Station Name   | Station Code |
|:----------------:|:------------:|
|   EL Shams Club  | 330          |
|    Alf Maskan    | 331          |
|      Haroun      | 332          |
|     Al-Ahram     | 333          |
| Koleyet El-Banat | 334          |
|   Cairo Stadium  | 335          |
|     Fair Zone    | 336          |
|     Abbassia     | 337          |
|    Abdou Pasha   | 338          |
|     El-Geish     | 339          |
|  Bab El-Shaaria  | 340          |
|      Attaba      | 238          |

