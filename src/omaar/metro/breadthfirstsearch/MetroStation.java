package omaar.metro.breadthfirstsearch;

import java.util.List;

/**
 * @author Omar Raed 
 * 
 * A class that describes a Metro Station 
 */
public class MetroStation {

    private String stationName;
    private int stationCode;
    private int[] neighbourStations;

    public MetroStation(int stationCode) {
        this.stationCode = stationCode;
        this.stationName = StationsUtil.getStationName(stationCode);
        this.neighbourStations = StationsUtil.getNeighbourStations(stationCode);
    }

    public String getStationName() {
        return stationName;
    }

    public int getStationCode() {
        return stationCode;
    }

    public int[] getNeighbourStations() {
        return neighbourStations;
    }

    public int neighboursAvailable() {
        return neighbourStations.length;
    }

    public boolean isVisited(List<Integer> visitedList) {

        for (int code : visitedList)
            if (code == this.stationCode)
                return true;

        return false;
    }

    public boolean isEndStation(int endCode) {
        return this.stationCode == endCode;
    }
}
