package eus.ehu.business_logic;

import eus.ehu.data_access.DbAccessManager;
import eus.ehu.domain.Pilot;

import java.util.List;

public class BlFacadeImpl implements BlFacade {
    // Create an attribute to hold a reference to the DbAccessManager
    private DbAccessManager dbManager = DbAccessManager.getInstance();

    // delegate all the methods to the db manager
    @Override
    public void storePilot(String name, String nationality, int points) {
        dbManager.storePilot(name, nationality, points);
    }

    @Override
    public List<Pilot> getAllPilots() {
        return dbManager.getAllPilots();
    }

    @Override
    public List<Pilot> getPilotsByNationality(String nationality) {
        return dbManager.getPilotsByNationality(nationality);
    }

    @Override
    public int deletePilotByName(String pilotName) {
        return dbManager.deletePilotByName(pilotName);
    }

    @Override
    public void addPointsToPilot(int morePoints, String pilotName) {
        dbManager.addPointsToPilot(morePoints, pilotName);
    }
}
