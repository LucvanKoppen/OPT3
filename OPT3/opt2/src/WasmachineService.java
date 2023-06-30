public interface WasmachineService {
        Bon startWasmachine(Wasprogramma wasprogramma);

        // voer wasprogramma uit
        // is er een machine die dit programma kan draaien beschikbaar
         void updateWasmachineStatus(boolean beschikbaar);
        public default void performMaintenance() {
                // Perform maintenance tasks specific to the Wasmachine
                // For example, clean internal parts, check for any issues, etc.
                // Implement the necessary logic here...

                System.out.println("Performing maintenance");

                // Example maintenance tasks:
                cleanInternalParts();
                checkForIssues();
                calibrateSettings();
        }

        private void cleanInternalParts() {
                // Logic to clean the internal parts of the washing machine
                System.out.println("Cleaning internal parts...");
                // ...
        }

        private void checkForIssues() {
                // Logic to check for any issues or malfunctions in the washing machine
                System.out.println("Checking for issues...");
                // ...
        }

        private void calibrateSettings() {
                // Logic to calibrate the settings of the washing machine
                System.out.println("Calibrating settings...");
                // ...
        }

        // Existing code...
}
