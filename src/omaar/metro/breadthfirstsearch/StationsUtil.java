package omaar.metro.breadthfirstsearch;

/**
 * @author Omar Raed 
 * 
 * StationUtil class that contains methods to get Stations name or Stations neighbours
 * 
 */
public class StationsUtil {
	
	/*
	 * A method called to get list of neighbour stations for a station code
	 */
    public static int[] getNeighbourStations(int stationCode) {

        switch (stationCode) {

            case 130:
                return new int[]{131};
            case 131:
                return new int[]{130, 132};
            case 132:
                return new int[]{131, 133};
            case 133:
                return new int[]{132, 134};
            case 134:
                return new int[]{133, 135};
            case 135:
                return new int[]{134, 136};
            case 136:
                return new int[]{135, 137};
            case 137:
                return new int[]{136, 138};
            case 138:
                return new int[]{137, 139};
            case 139:
                return new int[]{138, 140};
            case 140:
                return new int[]{139, 141};
            case 141:
                return new int[]{140, 142};
            case 142:
                return new int[]{141, 143};
            case 143:
                return new int[]{142, 144, 236, 238};
            case 144:
                return new int[]{143, 145};
            case 145:
                return new int[]{144, 146};
            case 146:
                return new int[]{145, 147, 239, 241};
            case 147:
                return new int[]{146, 148};
            case 148:
                return new int[]{147, 149};
            case 149:
                return new int[]{148, 150};
            case 150:
                return new int[]{149, 151};
            case 151:
                return new int[]{150, 152};
            case 152:
                return new int[]{151, 153};
            case 153:
                return new int[]{152, 154};
            case 154:
                return new int[]{153, 155};
            case 155:
                return new int[]{154, 156};
            case 156:
                return new int[]{155, 157};
            case 157:
                return new int[]{156, 158};
            case 158:
                return new int[]{157, 159};
            case 159:
                return new int[]{158, 160};
            case 160:
                return new int[]{159, 161};
            case 161:
                return new int[]{160, 162};
            case 162:
                return new int[]{161, 163};
            case 163:
                return new int[]{162, 164};
            case 164:
                return new int[]{163};
            case 230:
                return new int[]{231};
            case 231:
                return new int[]{230, 232};
            case 232:
                return new int[]{231, 233};
            case 233:
                return new int[]{232, 234};
            case 234:
                return new int[]{233, 235};
            case 235:
                return new int[]{234, 236};
            case 236:
                return new int[]{235, 143};
            case 238:
                return new int[]{143, 239, 340};
            case 239:
                return new int[]{238, 146};
            case 241:
                return new int[]{146, 242};
            case 242:
                return new int[]{241, 243};
            case 243:
                return new int[]{242, 244};
            case 244:
                return new int[]{243, 245};
            case 245:
                return new int[]{244, 246};
            case 246:
                return new int[]{245, 247};
            case 247:
                return new int[]{246, 248};
            case 248:
                return new int[]{247, 249};
            case 249:
                return new int[]{248};
            case 330:
                return new int[]{331};
            case 331:
                return new int[]{330, 332};
            case 332:
                return new int[]{331, 333};
            case 333:
                return new int[]{332, 334};
            case 334:
                return new int[]{333, 335};
            case 335:
                return new int[]{334, 336};
            case 336:
                return new int[]{335, 337};
            case 337:
                return new int[]{336, 338};
            case 338:
                return new int[]{337, 339};
            case 339:
                return new int[]{338, 340};
            case 340:
                return new int[]{339, 238};
            default:
                throw new NullPointerException("Wrong Station Code");

        }

    }
	
	/*
	 * A method called to the stations name for a station code
	 */
    public static String getStationName(int stationCode) {

        switch (stationCode) {

            case 130:
                return "New El-Marg";
            case 131:
                return "El-Marg";
            case 132:
                return "Ezbet El-Nakhl";
            case 133:
                return "Ain Shams";
            case 134:
                return "El-Matareyya";
            case 135:
                return "Helmeyet El-Zaitoun";
            case 136:
                return "Hadayeq El-Zaitoun";
            case 137:
                return "Saray El-Qobba";
            case 138:
                return "Hammamat El-Qobba";
            case 139:
                return "Kobri El-Qobba";
            case 140:
                return "Manshiet El Sadr";
            case 141:
                return "EL-Demerdash";
            case 142:
                return "Ghamra";
            case 143:
                return "Al-Shohadaa";
            case 144:
                return "Orabi";
            case 145:
                return "Nasser";
            case 146:
                return "Sadat";
            case 147:
                return "Saad Zaghloul";
            case 148:
                return "Al-Sayeda Zeinab";
            case 149:
                return "El-Malek El-Saleh";
            case 150:
                return "Mar Girgis";
            case 151:
                return "El-Zahraa";
            case 152:
                return "Dar El-Salam";
            case 153:
                return "Hadayek El-Maadi";
            case 154:
                return "Maadi";
            case 155:
                return "Sakanat El-Maadi";
            case 156:
                return "Tora El-Balad";
            case 157:
                return "Kozzika";
            case 158:
                return "Tora El-Asmant";
            case 159:
                return "El-Maasara";
            case 160:
                return "Hadayek Helwan";
            case 161:
                return "Wadi Hof";
            case 162:
                return "Helwan University";
            case 163:
                return "Ain Helwan";
            case 164:
                return "Helwan";
            case 230:
                return "Shubra El-Kheima";
            case 231:
                return "Kolleyyet El-Zeraa";
            case 232:
                return "Mezallat";
            case 233:
                return "Khalafawy";
            case 234:
                return "St. Teresa";
            case 235:
                return "Rod El-Farag";
            case 236:
                return "Masaraa";
            case 238:
                return "Attaba";
            case 239:
                return "Mohamed Naguib";
            case 241:
                return "Opera";
            case 242:
                return "Dokki";
            case 243:
                return "El Bohoth";
            case 244:
                return "Cairo University";
            case 245:
                return "Faisal";
            case 246:
                return "Giza";
            case 247:
                return "Omm El-Masryeen";
            case 248:
                return "Sakiat Mekky";
            case 249:
                return "El-Mounib";
            case 330:
                return "EL Shams Club";
            case 331:
                return "Alf Maskan";
            case 332:
                return "Haroun";
            case 333:
                return "Al-Ahram";
            case 334:
                return "Koleyet El-Banat";
            case 335:
                return "Cairo Stadium";
            case 336:
                return "Fair Zone";
            case 337:
                return "Abbassia";
            case 338:
                return "Abdou Pasha";
            case 339:
                return "El-Geish";
            case 340:
                return "Bab El-Shaaria";
            default:
                throw new NullPointerException("Wrong Station Code");

        }

    }

}
