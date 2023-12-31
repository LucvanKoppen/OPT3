import java.util.ArrayList;

public class Wasmachine implements WasmachineService {
    private int nr;
    private String locatie;
    private String status;
    private boolean beschikbaar;
    private int cooldown;
    public static ArrayList<Wasmachine> Wasmachines = new ArrayList<Wasmachine>();
    private ArrayList<Wasprogramma> wasprogrammas = new ArrayList<Wasprogramma>();
    public Wasmachine(int nr, String locatie) {
        this.nr = nr;
        this.locatie = locatie;
        this.beschikbaar = true;
        Wasmachines.add(this);
    }
    public boolean getBeschikbaar() {
        return beschikbaar;
    }
    public void addWasprogramma(Wasprogramma wasprogramma) {
        this.wasprogrammas.add(wasprogramma);
    }
    public ArrayList<Wasprogramma> getWasprogrammas() {
        return wasprogrammas;
    }
    public String getLocatie() {
        return locatie;
    }
    public static Wasmachine CheckBeschikbaarheid(boolean heeftDrogerNodig, boolean moetIndustrieleMachine, boolean mogelijkheidEigenWasmiddel) {
        Wasmachine wasmachineBeschikbaar = null;
        for (Wasmachine wasmachine:Wasmachine.Wasmachines) {
            if(wasmachine.getBeschikbaar()) {
                for (Wasprogramma wasprogramma:wasmachine.getWasprogrammas()) {
                    if(wasprogramma.isHeeftDrogerNodig() == heeftDrogerNodig && wasprogramma.isMoetInIndustrieleMachine() == moetIndustrieleMachine && wasprogramma.isMogelijkheidEigenWasmiddel() == mogelijkheidEigenWasmiddel) {
                        wasmachineBeschikbaar = wasmachine;
                    }
                    //else if (wasprogramma.isHeeftDrogerNodig() || heeftDrogerNodig || wasprogramma.isMoetInIndustrieleMachine() || moetIndustrieleMachine || wasprogramma.isMogelijkheidEigenWasmiddel() || mogelijkheidEigenWasmiddel) {
                    //   wasmachineBeschikbaar = wasmachine;
                    //}
                }
            }
        }
        return wasmachineBeschikbaar;
    }
    @Override
    public Bon startWasmachine(Wasprogramma wasprogramma) {
        this.performMaintenance();
        this.cooldown = wasprogramma.getAantalMinuten();
        this.updateWasmachineStatus(false);
        return Wasprogramma.startWasprogramma(wasprogramma, this);
    }
    @Override
    public void updateWasmachineStatus(boolean beschikbaar) {
        this.beschikbaar=beschikbaar;
    }
}