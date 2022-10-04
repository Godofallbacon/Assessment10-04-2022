public enum FlightCrewJob {

    PILOT(0), CO_PILOT(1), FLIGHT_ATTENDANT(2);

    private final int indexPosition;

    public int getIndexPosition() {
        return indexPosition;
    }
    FlightCrewJob(int indexPosition) {
        this.indexPosition = indexPosition;
    }

}
